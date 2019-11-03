package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * @author mtreellen
 * @date 2019-11-03 21:21
 * @description 希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        shellSortSwapTest();
        shellSortMoveTest();
    }

    public static void shellSortSwapTest(){
        //int[] arr = {123, 3, 4, 5, 6, 7, 232, 4, 32, 65, 7, 6, -12, -9, -1, 11, 21, 34};
        java.util.Date date = new java.util.Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = simpleDateFormat.format(date);
        System.out.println("shellSortSwapTest() :: 排序前时间：" + dateStr);

        int[] arr = new int[80000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 800000);
        }
//        System.out.println(Arrays.toString(arr));
        shellSortSwap(arr);
//        System.out.println(Arrays.toString(arr));

        java.util.Date date1 = new java.util.Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr1 = simpleDateFormat.format(date1);
        System.out.println("shellSortSwapTest() :: 排序后时间：" + dateStr1);
    }

    /**
     *  slower than insertion sorting
     * @param arr
     */
    public static void shellSortSwap(int[] arr){
        int temp = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2){
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0 ; j -= gap) {
                    if(arr[j] > arr[j + gap]){
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
    }
    public static void shellSortMoveTest(){
        java.util.Date date = new java.util.Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = simpleDateFormat.format(date);
        System.out.println("shellSortMoveTest() :: 排序前时间：" + dateStr);

        int[] arr = new int[80000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 800000);
        }
//        System.out.println(Arrays.toString(arr));
        shellSortMove(arr);
//        System.out.println(Arrays.toString(arr));

        java.util.Date date1 = new java.util.Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr1 = simpleDateFormat.format(date1);
        System.out.println("shellSortMoveTest() :: 排序后时间：" + dateStr1);
    }

    public static void shellSortMove(int[] arr){
        for (int gap = arr.length / 2; gap > 0; gap /= 2){
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if(arr[j] < arr[j - gap]){
                    while(j - gap >= 0 && temp < arr[j - gap]){
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = temp;
                }
            }
        }
    }

    public static void shellSort(int[] arr){
        for (int i = 5; i < arr.length; i++) {
            for (int j = i - 5; j >= 0 ; j -= 5) {
                if(arr[j] > arr[j + 5]){
                    int temp = arr[j];
                    arr[j] = arr[j + 5];
                    arr[j + 5] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 2; i < arr.length; i++) {
            for (int j = i - 2; j >= 0 ; j -= 2) {
                if(arr[j] > arr[j + 2]){
                    int temp = arr[j];
                    arr[j] = arr[j + 2];
                    arr[j + 2] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 ; j --) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}