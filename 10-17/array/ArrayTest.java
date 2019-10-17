package array;

/**
 * 差之毫厘谬以千里
 * @author mtreellen
 * @create 2019-10-15-18:41
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        //,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
//        System.out.println(find(8, arr));
//        System.out.println(find1(8, arr));
        System.out.println(find2(1, arr));
    }

    public static boolean find(int target, int[][] array) {
        boolean flag = false;
        if(array != null){
            int a = array[0].length;
            int b = array.length;
            int tar = array[0][a - 1];

            for (int i = 1; i < array[0].length;) {
                for (int j = array[0].length - 1; j >= 1 ;) {
                    if(target > tar){
                        j--;
                        tar = array[i][j];
                    }
                    if(target < tar){
                        i++;
                        tar = array[i][j];
                    }
                    if (target == tar) {
                        flag = true;
                        break;
                    }
                }
            }
        }
        if(flag){
            return true;
        }
        return false;
    }
    public static boolean find1(int target, int[][] array){
        int row = array.length;
        int col = array[0].length;
        int i = row, j = 0;
        while(j < col && i >= 0){
            if(target == array[row][col]){
                return true;
            }else if(target > array[row][col]){
                j++;
            }else{
                i--;
            }
        }
        return false;
    }

    public static boolean find2(int target, int[][] array) {
        if(array == null){
            return false;
        }
        int row = 0;
        int col = array[0].length - 1;
        while(row < array.length && col >= 0){
            if(array[row][col] == target){
                return true;
            }else if(array[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
