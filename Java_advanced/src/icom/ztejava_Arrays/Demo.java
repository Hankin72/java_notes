package icom.ztejava_Arrays;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr ={10,2,55,23,24,100};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        String aa = "aac";

        // 3. 二分查找

        int index = Arrays.binarySearch(arr,555);
        System.out.println(index);
    }
}
