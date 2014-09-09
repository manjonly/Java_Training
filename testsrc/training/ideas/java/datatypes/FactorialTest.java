package training.ideas.java.datatypes;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnmao on 8/20/2014.
 */
public class FactorialTest {
    @Test
    public void factorialtest4(){
        Factorial myFactorialClass = new Factorial();
        Assert.assertEquals(24, myFactorialClass.calcFactorialOf(4));

    }
}
