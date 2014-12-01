package training.ideas.java.javaTraining2.basics;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnmao on 12/1/2014.
 */
public class CalculatorTest {
    Calculator2 mycalc=new Calculator2();

    @Test
    public void testAdd(){
        Assert.assertEquals("addition not matched",7,mycalc.performAdd(2,5));
        Assert.assertEquals("Count not matched",1,mycalc.getCount());
    }

    @Test
    public void testSubtract_return_pos(){
        //Calculator2 mycalc=new Calculator2();
        Assert.assertEquals("Subtraction not matched",3,mycalc.performSubtract(5,2));
        Assert.assertEquals("Count not matched",1,mycalc.getCount());
    }

    @Test
    public void testSubtract_return_neg(){
        //Calculator2 mycalc=new Calculator2();
        Assert.assertEquals("Subtraction not matched",-3,mycalc.performSubtract(2,5));
        Assert.assertEquals("Count not matched",1,mycalc.getCount());
    }

    @Test
    public void testSubtract_return_zero(){
        //Calculator2 mycalc=new Calculator2();
        Assert.assertEquals("Subtraction not matched",0,mycalc.performSubtract(5,5));
        Assert.assertEquals("Count not matched",1,mycalc.getCount());
    }
}
