package training.ideas.java.datatypes;

/**
 * Created by idnmao on 8/19/2014.
 */
public class calcFibonacciSeries {
    public int[] calcFibonacci(int seriescount) {
        int [] outputArray = new int [seriescount];
        int i=0;
        outputArray[0]=1;
        outputArray[1]=1;
        for (i=2;i<seriescount;i++ ){
            outputArray[i]=outputArray[i-1]+outputArray[i-2];
        }
        return outputArray;
    }


}
