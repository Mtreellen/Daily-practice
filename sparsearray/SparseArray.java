package sparsearray;

/**
 * @author mtreellen
 * @create 2019-10-09-15:57
 */
public class SparseArray {
    public static void main(String[] args) {
        //创建原始的二维数组 11 * 11
        //0 表示没有棋子，1 表示黑子，2 表示蓝子
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[4][5] = 2;
        //输出原始的二维数组
        System.out.println("原始的二维数组:");
        for(int[] row : chessArr1){
            for(int data : row){
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        //将二维数组转为稀疏数组
        //1. 先遍历二维数组将得到：非 0 数据的个数
        int sum = 0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[0].length; j++) {
                if(chessArr1[i][j] != 0){
                    sum++;
                }
            }
        }
//        System.out.println("sum = " + sum);
        //2. 创建稀疏数组
        int[][] sparseArr = new int[sum + 1][3];
        //给稀疏数组赋值，初始化
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        //遍历二维数组，将非 0 的数据值存到 sparseArr 中
        int count = 0;//记录是第几个非 0 数据
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[0].length; j++) {
                if(chessArr1[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        }

        //输出稀疏数组
        System.out.println();
        System.out.println("稀疏数组为：");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
        }
        System.out.println();

        //将稀疏数组恢复为二维数组

        //1. 先读取稀疏数组的第一行，根据第一行的数据创建原始二维数组
        int[][] chessArr2 = new int[sparseArr[0][0]][sparseArr[0][1]];

        //输出一下这个二维数组
        System.out.println();
        System.out.println("二维数组:");
        for(int[] row : chessArr2){
            for(int data : row){
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        //2. 读取稀疏数组后几行[第二行开始]的数据，并赋给原始的二维数组
        for (int i = 1; i < sparseArr.length; i++) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        System.out.println();
        System.out.println("恢复后的二维数组:");
        for(int[] row : chessArr2){
            for(int data : row){
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

    }
}
