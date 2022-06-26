package jcom.ztejava_BasicAlgorithm;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr ={10,14,16,25,28,30,35,88,100};
        System.out.println(binarySearch(arr,14));
    }
    /**
     * 二分查找算法的实现
     * @param arr 排序数组
     * @param data 目标数组
     * @return 索引，不存在，返回-1
     */
    public static int binarySearch(int [] arr, int data){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int midIndex = (left+right)/2;
            if (data>arr[midIndex]){
                left = midIndex +1;
            }else if(data < arr[midIndex]){
                right = midIndex-1;
            }else{
                return midIndex;
            }
        }
        return -1;
    }



}
