package kcom.ztejava_Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        Integer[] ages = {5,623,1,1,21,90};

        Arrays.sort(ages, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(Arrays.toString(ages));

        Arrays.sort(ages, (Integer o1, Integer o2) -> {
                return o2-o1;  //降序
        });
        System.out.println(Arrays.toString(ages));

        Arrays.sort(ages, (o1, o2) -> o1-o2);

        System.out.println(Arrays.toString(ages));
    }
}


