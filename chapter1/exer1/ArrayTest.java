package exercise.chapter1.exer1;

import java.util.Arrays;

/**
 * @author mtreellen
 * @create 2019-10-16-15:38
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1, 7};

        //调用sort方法，实现从大到小排序
        //在此处补充代码
        sort(array);
        //显示结果
        System.out.println("排序后的结果是：" + Arrays.toString(array));
    }

    //要求使用冒泡排序完成
    public static void sort(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j + 1] > arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }
    }
}
