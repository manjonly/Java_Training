package training.ideas.java.datatypes;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnmao on 8/19/2014.
 */
public class fibonacciSeriesTest {
    @Test
    public void fibonacciTestFOR10(){
        //calcFibonacciSeries myFibonacciClass = new calcFibonacciSeries();
        FibonacciRec myFibonacciClass = new FibonacciRec();
        int seriescount=10;
        int [] myoutput = {1,1,2,3,5,8,13,21,34,55};
        Assert.assertArrayEquals(myoutput, myFibonacciClass.fiborec(seriescount));
    }

}
