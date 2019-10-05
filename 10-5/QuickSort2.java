import java.util.Arrays;
import java.util.*;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        Random random = new Random();

        for(int i=0; i<array.length; i++) {
            array[i] = random.nextInt(1000)+1;
        }

        quickSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void insertSort2(int[] array, int start, int end) {
        for(int i = start + 1; i <= end; i++) {
            int tmp = array[i];
            int j = 0;
            for(j = i - 1; j >= start; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    public static void quick(int[] array, int start, int end) {

        if(end - start + 1 <= 16) {
            insertSort2(array, start, end);
            return;
        }
        
        medianOfThree(array, start, end);//三数取中法

        int par = partion(array, start, end);

        if(par > start + 1) {
            quick(array, start, par-1);
        }
        if(par < end - 1) {
            quick(array, par + 1, end);
        }
    }

    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }

    public static int partion(int[] array, int low, int high) {
        int tmp = array[low];
        while(low < high) {
            while(low < high && array[high] >= tmp) {
                high--;
            }
            if(low >= high) {
                array[low] = tmp;
                break;
            }else{
                array[low] = array[high];
            }

            while(low < high && array[low] <= tmp) {
                low++;
            }
            if(low >= high) {
                array[low] = tmp;
                break;
            }else{
                array[high] = array[low];
            }
        }
        array[low] = tmp;
        return low;
    }

    public static void swap(int[] array, int low, int high) {
        int tmp = array[low];
        array[low] = array[high];
        array[high] = tmp;
    }

    public static void medianOfThree(int[] array, int low, int high) {
        int mid = (low + high) / 2;
        //array[mid] <= array[low] <= array[high]
        if(array[mid] > array[low]) {
            swap(array, mid, low);
        }
        // if(array[mid] > array[high]) {
        //     swap(array, mid, high);
        // }
        if(array[low] > array[high]) {
            swap(array, low, high);
        }
    }
}