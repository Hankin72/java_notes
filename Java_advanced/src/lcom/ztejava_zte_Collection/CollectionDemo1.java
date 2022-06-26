package lcom.ztejava_zte_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // 有序， 可重复， 有索引
//        ArrayList<String> list = new ArrayList<>();
        Collection list = new ArrayList();
        list.add("Jvava");
        list.add("Jvava");
        list.add("help");
        list.add(1212);
        System.out.println(list);
        // Collection --- set
        // 无序， 不重复， 无索引
        Collection set1 = new HashSet();
        set1.add("hello");
        set1.add("hello");
        set1.add(1);
        set1.add(2);
        System.out.println(set1);
    }
}
