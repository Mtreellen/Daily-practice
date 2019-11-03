package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * @author mtreellen
 * @date 2019-11-03 20:53
 * @description
 */
public class InsertionSort {
    public static void main(String[] args) {
//        int[] arr = {101, 34, 119, 1};
        java.util.Date date = new java.util.Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = simpleDateFormat.format(date);
        System.out.println("排序前时间：" + dateStr);
        int[] arr = new int[80000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 8000000);
        }
//        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));
        java.util.Date date1 = new java.util.Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr1 = simpleDateFormat.format(date1);
        System.out.println("排序后时间：" + dateStr1);
    }
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int insertNum = arr[i];
            int insertIndex = i - 1;
            while(insertIndex >= 0 && insertNum < arr[insertIndex] ){
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            if(insertIndex + 1 != i){
                arr[insertIndex + 1] = insertNum;
            }
        }
    }
    public static void insertionSort1(int[] arr){
        //{101, 34, 119, 1}  ==>  {34, 101, 119, 1}
        int insertNum = arr[1];
        int insertIndex = 1 - 1;
        while(insertIndex >= 0 && insertNum < arr[insertIndex] ){
            arr[insertIndex + 1] = arr[insertIndex];
            insertIndex--;
        }
        arr[insertIndex + 1] = insertNum;
        System.out.println(Arrays.toString(arr));
        insertNum = arr[2];
        insertIndex = 2 - 1;
        while(insertIndex >= 0 && insertNum < arr[insertIndex] ){
            arr[insertIndex + 1] = arr[insertIndex];
            insertIndex--;
        }
        arr[insertIndex + 1] = insertNum;
        System.out.println(Arrays.toString(arr));
        insertNum = arr[3];
        insertIndex = 3 - 1;
        while(insertIndex >= 0 && insertNum < arr[insertIndex] ){
            arr[insertIndex + 1] = arr[insertIndex];
            insertIndex--;
        }
        arr[insertIndex + 1] = insertNum;
        System.out.println(Arrays.toString(arr));
    }
}
