import java.util.Arrays;
import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[10000];
        Random random = new Random();

        for(int i=0; i<array.length; i++) {
            array[i] = random.nextInt(100000)+1;
        }

        quickSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void quick(int[] array, int start, int end) {
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
}