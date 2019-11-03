package sort;

import java.util.Arrays;

/**
 * @author mtreellen
 * @date 2019-11-02-18:16
 */
public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {-12, -9, -1, 11, 21, 34};
        int[] arr = new int[80000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 8000000);
        }
//        System.out.println(Arrays.toString(arr));
//        java.util.Date date = new java.util.Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateStr = simpleDateFormat.format(date);
//        System.out.println("排序前时间：" + dateStr);

        System.out.println("普通冒泡：");
        bubbleSort(arr);

//        java.util.Date date1 = new java.util.Date();
//        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateStr1 = simpleDateFormat.format(date1);
//        System.out.println("排序后时间：" + dateStr1);
        System.out.println("优化冒泡");
        bubbleSort1(arr);
    }
    public static void test1(){
        int[] arr = {-12, -9, -1, 11, 21, 34};
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] >arr[i + 1] ){
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第一趟排序：");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1 - 1; i++) {
            if(arr[i] >arr[i + 1] ){
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第二趟排序：");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1 - 2; i++) {
            if(arr[i] >arr[i + 1] ){
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第三趟排序：");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1 - 3; i++) {
            if(arr[i] >arr[i + 1] ){
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第四趟排序：");
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        long l = System.currentTimeMillis();
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
//            System.out.println("第" + (i + 1) + "趟排序后：");
//            System.out.println(Arrays.toString(arr));
        }
        long l1 = System.currentTimeMillis();
        System.out.println("消耗时间:" + (l1 - l));
    }
    public static void bubbleSort1(int[] arr) {
        long l = System.currentTimeMillis();
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
//            System.out.println("第" + (i + 1) + "躺排序后：");
//            System.out.println(Arrays.toString(arr));
            if(!flag){
                break;// already sorted
            }else{
                flag = false;
            }
        }
        long l1 = System.currentTimeMillis();
        System.out.println("消耗时间:" + (l1 - l));
    }
}
