package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * @author mtreellen
 * @date 2019-11-03 20:11
 * @description select sorting
 */
public class SelectSort {
    public static void main(String[] args) {
//        int[] arr = {123, 3, 4, 5, 6, 7, 232, 4, 32, 65, 7, 6, -12, -9, -1, 11, 21, 34};
        java.util.Date date = new java.util.Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = simpleDateFormat.format(date);
        System.out.println("排序前时间：" + dateStr);
        int[] arr = new int[80000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 8000000);
        }
        selectSort(arr);
        java.util.Date date1 = new java.util.Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr1 = simpleDateFormat.format(date1);
        System.out.println("排序后时间：" + dateStr1);
    }
    public static void selectSort(int[] arr){
        int minIndex = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if(min > arr[j]){
                    minIndex = j;
                    min = arr[j];
                }
            }
            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
//            System.out.println(Arrays.toString(arr));
        }
    }
    public static void selectSort1(int[] arr){
        int minIndex = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        arr[minIndex] = arr[0];
        arr[0] = min;

        minIndex = 1;
        min = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        if(minIndex != 1){
            arr[minIndex] = arr[0];
            arr[0] = min;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void selectSort2(int[] arr){
        long l = System.currentTimeMillis();
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(min > arr[j]){
                    minIndex = j;
                    min = arr[j];
                }
            }
            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
        long l1 = System.currentTimeMillis();
        System.out.println("消耗时间:" + (l1 - l));
    }
}
