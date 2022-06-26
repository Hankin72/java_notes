package icom.ztejava_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        // 自定义数组 排序规则

        // 1，Arrays 的sort方法对于默认有值特性的数组是默认升序排序
        int [] ages ={43,12,11,34,23};
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        // 2, 降序排序。
        //   自定义比较器对象，只能支持饮用类型的排序
        Integer [] ages1 ={43,12,11,34,23};
        /**
         *
         * 参数1：被排序的数组
         * 参数2： 匿名内部类，代表一个比较器对象
         *
         * */
        Arrays.sort(ages1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return  o1-o2; // 默认排序 升序
                 return o2-o1;  // 降序
            }
        });

        System.out.println(Arrays.toString(ages1));

        System.out.println("==========");

        Student [] students = new Student[3];

        students[0] = new Student("吴磊",23,175.5);
        students[1] = new Student("张三",18,178.5);
        students[2] = new Student("李四",25,185.5);

        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 自己制定比较规则
//                return -(o1.getAge() - o2.getAge());
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });

        System.out.println(Arrays.toString(students));


    }


}
