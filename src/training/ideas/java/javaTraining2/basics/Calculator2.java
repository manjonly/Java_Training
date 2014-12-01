package training.ideas.java.javaTraining2.basics;

/**
 * Created by idnmao on 12/1/2014.
 */
public class Calculator2 {
    private int count;

    public int performAdd(int num1, int num2) {
        count++;
        return num1+num2;
    }

    public int getCount() {
        return count;
    }

    public int performSubtract(int num1, int num2) {
        count++;
        return (num1-num2);
    }
}
