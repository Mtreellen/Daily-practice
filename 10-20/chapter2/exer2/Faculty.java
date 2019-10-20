package exercise.chapter2.exer2;

/**
 * @author mtreellen
 * @create 2019-10-16-17:29
 */
public class Faculty extends Employee{
    private String degree;//学位
    private String level;//等级

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
