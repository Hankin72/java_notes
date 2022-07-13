

## 服务的基本用法

### 1. 定义一个服务

MyService是继承自Service类,说明这是一个服务（service）

```java

public class MyService extends Service {
    public MyService() {
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onCreate() {
        super.onCreate();
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
```

>onCreate(),onStartCommand(),onDestroy()这3个方式，是最常用的3个方法。
>
>其中onCreate()方法会在服务创建的时候调用。
>
>onStartCommand()方法会在每次服务启动的时候调用。
>
>onDestroy()方法会在服务销毁的时候调用。

>- 通常情况，如果我们希望服务一旦启动就立刻执行某个动作，就可以将逻辑写在onStartCommand()方法里。
>- 当服务销毁时，我们又应该在onDestroy()方法中去回收那些不再使用的资源。

>注意：每一个服务service都需要在AndroidManifest.xml文件中进行注册才能生效。
>
>```xml
><?xml version="1.0" encoding="utf-8"?>
><manifest xmlns:android="http://schemas.android.com/apk/res/android"
>    xmlns:tools="http://schemas.android.com/tools"
>    package="com.example.servicetest">
>    <application
>        android:allowBackup="true"
>        android:dataExtractionRules="@xml/data_extraction_rules"
>        android:fullBackupContent="@xml/backup_rules"
>        android:icon="@mipmap/ic_launcher"
>        android:label="@string/app_name"
>        android:roundIcon="@mipmap/ic_launcher_round"
>        android:supportsRtl="true"
>        android:theme="@style/Theme.Servicetest"
>        tools:targetApi="31">
>        <service
>            android:name=".MyService"
>            android:enabled="true"
>            android:exported="true">  
>        </service>
>        <activity
>            android:name=".MainActivity"
>            android:exported="true">
>            <intent-filter>
>                <action android:name="android.intent.action.MAIN" />
>                <category android:name="android.intent.category.LAUNCHER" />
>            </intent-filter>
>        </activity>
>    </application>
>
></manifest>
>```
>
>

### 2.启动和停止服务

启动和停止服务主要借助Intent来实现。

>代码演示：
>
>- activity_main.xml
>
>```xml
><?xml version="1.0" encoding="utf-8"?>
><LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
>    android:orientation="vertical"
>    android:layout_width="match_parent"
>    android:layout_height="match_parent"
>   >
>    <Button
>        android:layout_width="match_parent"
>        android:layout_height="wrap_content"
>        android:id="@+id/start_service"
>        android:text="start service"
>        />
>    <Button
>        android:id="@+id/stop_service"
>        android:layout_width="match_parent"
>        android:layout_height="wrap_content"
>        android:text="stop service"/>
></LinearLayout>
>```
>
>- MainActivity
>
>```java
>package com.example.servicetest;
>
>import androidx.appcompat.app.AppCompatActivity;
>
>import android.content.Intent;
>import android.os.Bundle;
>import android.view.View;
>import android.widget.Button;
>
>public class MainActivity extends AppCompatActivity implements View.OnClickListener {
>
>    @Override
>    protected void onCreate(Bundle savedInstanceState) {
>        super.onCreate(savedInstanceState);
>        setContentView(R.layout.activity_main);
>
>        Button startService = (Button) findViewById(R.id.start_service);
>        Button stopService = (Button) findViewById(R.id.stop_service);
>        startService.setOnClickListener(this);
>        stopService.setOnClickListener(this);
>    }
>
>    @Override
>    public void onClick(View view) {
>        switch (view.getId()){
>            case R.id.start_service:
>                Intent startIntent = new Intent(MainActivity.this, MyService.class);
>                startService(startIntent);  //  启动服务
>                break;
>            case R.id.stop_service:
>                Intent stopIntent = new Intent(this, MyService.class);
>                stopService(stopIntent);   // 停止服务
>                break;
>            default:
>                break;
>        }
>    }
>}
>```
>
>- MyService 
>
>  如何证实服务已经成功启动或者停止呢，最简单的方法就是通过日志打印的方式
>
>```java
>
>public class MyService extends Service {
>    public static final String TAG = "MyService";
>
>    public MyService() {
>    }
>    @Override
>    public IBinder onBind(Intent intent) {
>        // TODO: Return the communication channel to the service.
>        throw new UnsupportedOperationException("Not yet implemented");
>    }
>    @Override
>    public void onCreate() {
>        super.onCreate();
>        Log.d(TAG, "onCreate executed");
>    }
>    @Override
>    public int onStartCommand(Intent intent, int flags, int startId) {
>        Log.d(TAG, "onStartCommand executed");
>        return super.onStartCommand(intent, flags, startId);
>    }
>    @Override
>    public void onDestroy() {
>        super.onDestroy();
>        Log.d(TAG, "onDestroy executed");
>
>    }
>}
>
>
>```
>
>



### 3.活动和服务进行通信

onBind()方法

当一个活动和服务绑定之后，就可以调用该服务里的Binder提供的方法

> ```java
> package com.example.servicetest;
> 
> import android.app.Service;
> import android.content.Intent;
> import android.os.Binder;
> import android.os.IBinder;
> import android.util.Log;
> 
> public class MyService extends Service {
>   	public static final String TAG = "MyService";
>     private DownloadBinder mBinder = new DownloadBinder();
>     
>     class  DownloadBinder extends Binder{
>         public void startDownload(){
>             Log.d(TAG, "startDownload executed");
>         }
>         public int getProgress(){
>             Log.d(TAG, "getProgress executed");
>             return 0;
>         }
>     }
>     
>     //  构造器
>     public MyService() {
>     }
>     @Override
>     public IBinder onBind(Intent intent) {
>         return mBinder;
>     }
>    ...
> }
> ```

>```xml
><?xml version="1.0" encoding="utf-8"?>
><LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
>    android:orientation="vertical"
>    android:layout_width="match_parent"
>    android:layout_height="match_parent"
>   >
>    
>  ...
>
>    <View
>        android:layout_width="match_parent"
>        android:layout_height="100dp" />
>    <Button
>        android:layout_width="match_parent"
>        android:layout_height="wrap_content"
>        android:id="@+id/bind_service"
>        android:text="Bind service"
>        />
>    <Button
>        android:id="@+id/unbind_service"
>        android:layout_width="match_parent"
>        android:layout_height="wrap_content"
>        android:text="Unbind service"/>
></LinearLayout>
>```

```java


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private MyService.DownloadBinder downloadBinder;
    
    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder service) {
            downloadBinder = (MyService.DownloadBinder) service;
            downloadBinder.startDownload();
            downloadBinder.getProgress();
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
			
				...
        Button bindService = (Button) findViewById(R.id.bind_service);
        Button unbindService = (Button) findViewById(R.id.unbind_service);
        bindService.setOnClickListener(this);
        unbindService.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
           	...
            case R.id.bind_service:
                Intent bindIntent = new Intent(MainActivity.this, MyService.class);
                bindService(bindIntent, connection, BIND_AUTO_CREATE);  //  绑定服务
                break;
            case R.id.unbind_service:
                unbindService(connection);   // 解绑服务
                break;
            default:
                break;
        }
    }
}
```

>bindService(bindIntent, connection, BIND_AUTO_CREATE);  //  绑定服务
>
>bindService()接受三个参数，第一个参数就是刚构建的 Intent对象，第二个参数时创建的ServiceConnection的实例，第三个参数则是一个标志位，BIND_AUTO_CREATE表示活动和服务进行绑定自动创建服务，这使得MyService中的onCreate()方法得到执行，但是onStartCommand()方法不会执行。
>
>

>另外需要注意，任何一个服务在整个应用程序范围内都是通用的，即MyService不仅可以和MainActivity绑定，还可以和任何一个其他的活动进行绑定，而且在绑定完成后它们都可以获取到相同的DownloadBinder实例。
>
>



## Service的生命周期 

onCreate(),onStartCommand(),onDestroy(),onBind(),等方法都是服务的生命周期内可能调用的方法。

- 一旦项目的任何位置调用了Context的startService()方法，相应的服务就会启动起来，并回调onStartCommand()方法。如果这个服务还没有创建，则onCreate() 会先于onStartCommand()方法执行。
- 虽然每调用一次startSerive()方法，onStartCommand()就会执行一次，但是实际上每一个service只会存在一个实例。所以不管调用多少次startSerive()，只需调用一次stopService() or stopSelf()方法，服务就会停止下来。
- 另外，还有调用Context的bindService()来获取一个服务的持久连接，这时就会回调服务中onBind()方法。类似的如果服务还没有被创建onCreate() 会先于onBind()方法执行。之后调用方可以获取到onBind()方法里返回的IBinder对象的实例，这样就可以自由地和服务进行通信。只有调用方和服务之间连接没有断开，服务就会一直保持运行状态。
- startService() --> stopService() 这时服务onDestroy方法会执行，表示服务已经销毁
- 类似， bindService() --> unbindService(), onDestroy方法会执行。



- 但是，如果既调用startService()又调用bindService()， android系统的机制，一个服务只要被启动或者被绑定之后，就会一直处于运行状态。所以，想要销毁onDestroy, 需要同时调用stopService()和unbindService()



## Service的更多技巧

### 1。使用前台服务service





### 2.使用IntentService













