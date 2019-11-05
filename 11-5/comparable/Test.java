package compare.comparable;

import java.util.Arrays;
import java.util.Random;
/**
 * @author mtreellen
 * @date 2019-11-05 10:06
 * @description
 */
public class Test {
    public static void main(String[] args) {
//        compareToTest();
        test();
    }
    public static void test(){
        Person[] people = new Person[10];

        Random random = new Random(20191105);

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
            people[i].setAge(random.nextInt(100));
        }

        System.out.println(Arrays.toString(people));
        bubbleSort(people);
        System.out.println(Arrays.toString(people));
    }
    public static void compareToTest(){
        Person person = new Person("Ellen", 12, false);
        Person person1 = new Person("Monica", 22, true);

        int i = person.compareTo(person1);
        if(i < 0){
            System.out.println("person < person1");
        }else if(i > 0){
            System.out.println("person > person1");
        }else{
            System.out.println("person == person1");
        }
//        String s = new String("Ellen");
/*        int i1 = person.compareTo(s);
        if(i1 < 0){
            System.out.println("person < s");
        }else if(i1 > 0){
            System.out.println("person > s");
        }else{
            System.out.println("person == s");
        }*/
    }

    //TODO:有问题：
    public static void mergeSort1(Person[] arr, int low, int high){
        int length = high - low;
        if(length <= 1){
            return;
        }
        // 求待排序区间的中间下标
        int mid = (low + high) / 2;
        // 对左右两个小区间进行归并排序，直到小区间长度 <= 1
        mergeSort1(arr, low, mid);
        mergeSort1(arr, mid, high);
        //  合并两个有序数组
        merge(arr, low, high, low);
    }
    public static void mergeSort(Person[] people){
        mergeSort1(people, 0, people.length);
    }
    public static void merge(Person[] arr, int low, int high, int mid){
        int length = high - low;
        Person[] extra = new Person[length];
        int left = low;
        int right = mid;
        int indexExtra = 0;
        while(left < mid && right < high){
            int r = arr[left].compareTo(arr[right]);
            if(r <= 0){
                extra[indexExtra++] = arr[left++];
            }else{
                extra[indexExtra++] = arr[right++];
            }
        }
        while(left < mid){
            extra[indexExtra++] = arr[left++];
        }
        while(right < high){
            extra[indexExtra++] = arr[right++];
        }
        for (int i = 0; i < length; i++) {
            arr[i + low] = extra[i];
        }
    }
    public static void bubbleSort(Person[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int cur = arr[j].compareTo(arr[j + 1]);
                if(cur < 0){
                    Person temp = arr[j];
                    arr[j] = arr[ j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }else{
                flag = false;
            }
        }
    }
}
