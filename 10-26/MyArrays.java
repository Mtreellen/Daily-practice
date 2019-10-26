package array;

import java.util.Arrays;

/**
 * @author mtreellen
 * @date 2019-10-26-19:49
 */
public class MyArrays {
    /**
     * @param arr
     * @return：数组的最大值
     */
    public static int max(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > res){
                res = arr[i];
            }
        }
        return res;
    }

    /**
     * @param arr
     * @return：数组的最小值
     */
    public static int min(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < res){
                res = arr[i];
            }
        }
        return res;
    }

    /**
     * @param arr
     * @return：数组的平均值
     */
    public static double average(int[] arr){
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (sum / arr.length);
    }
    public static void reverse(int[] arr){
        for (int i = 0, j = arr.length - 1 ; i < j; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
    public static void reverse1(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1- i];
            arr[arr.length - 1- i] = tmp;
        }
    }
    public static void bubbleSort(int[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] < arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int height = arr.length - 1;
        while(low <= height){
            int mid  = (low + height) / 2;
            if(key > arr[mid]){
                height = mid - 1;
            }else if(key < arr[mid]){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void putEvenInFrontOfOdd(int[] arr){
        for (int i = 0, j = 1; j < arr.length && i < arr.length; j++) {
            if(arr[j] % 2 == 0){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
            }
//            if(arr[i] % 2 == 0){
//                i++;
//            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 10, 7, 9, 5, 1, 2, 0, 8, 2, 4};
        System.out.println("原数组打印" + Arrays.toString(arr));
        putEvenInFrontOfOdd(arr);
        System.out.println("偶数放在奇数前面：" + Arrays.toString(arr));
        System.out.println("数组最大值：" + max(arr));
        System.out.println("数组最小值：" + min(arr));
        System.out.println("数组平均值：" + average(arr));
        System.out.println("原数组打印：" + Arrays.toString(arr));
        reverse(arr);
        System.out.println("数组逆置1：" +  Arrays.toString(arr));
        reverse1(arr);
        System.out.println("数组逆置2：" +  Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println("冒泡排序（降序）：" +  Arrays.toString(arr));

        System.out.println("二分查找：" + binarySearch(arr, 1));
    }
}
