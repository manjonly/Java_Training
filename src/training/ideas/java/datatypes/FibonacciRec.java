package training.ideas.java.datatypes;

/**
 * Created by idnmao on 8/19/2014.
 */
public class FibonacciRec {
    public static int[] fiborec(int number) {
        int fiborec1[] = new int[number];

        calc(fiborec1,number);
        return fiborec1;
    }

    private static void calc(int fiborec2[], int j) {
        if(j==0)
            return;
        if(j==1|| j == 2) {
            fiborec2[0] = 1;
            fiborec2[1] = 1;
            return;
        }
        calc(fiborec2,j - 1);
        fiborec2[j-1]=fiborec2[j-2]+fiborec2[j-3];
    }
}
