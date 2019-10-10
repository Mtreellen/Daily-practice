import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
        int maxScore = 0;
        for (;;) {
            System.out.println("请输入学生成绩，输入负数表示结束。");
            int score = sc.nextInt();
            if(score < 0){
                break;
            }
            if(score > 100){
                System.out.println("输入非法成绩");
                continue;
            }
            /*
            JDK5.0 之前：
            Integer integer = new Integer(score);
            v.addElement(score);
             */
            //JDK5.0之后，自动装箱
            v.addElement(score);
            if(maxScore < score){
                maxScore = score;
            }
        }

        char level;
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            /*
            JDK5.0 之前：
            Integer inScore = (Integer)obj;
            int score = inScore.intValue();
             */
            //JDK5.0之后
            int score = (int)obj;


            if(maxScore - score <= 10){
                level = 'A';
            }else if(maxScore - score <= 20){
                level = 'B';
            }else if(maxScore - score <= 20){
                level = 'C';
            }else if(maxScore - score <= 20){
                level = 'D';
            }else{
                level = 'E';
            }
            System.out.println("student-" + i + "score is " + score + "level is " + level);
        }
    }
}
