package training.ideas.java.calculator;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnmao on 7/23/2014.
 */
public class AdditionTest {
/*
    @Test
    public void addTwoIntegers(){
        Addition number = new Addition();
        Assert.assertEquals("Sum did not match",5,number.add(2,3));
        Assert.assertEquals("Sum did not match",7,number.add(4,3));
        Assert.assertEquals("Sum did not match",10.0,number.add(5.4,4.6));
    }

    @Test
    public void addTwoDoubles(){
        Addition number = new Addition();
        Assert.assertEquals("Sum did not match",10.0,number.add(5.4,4.6));
    }
    @Test
    public void addDoubleArray(){
        double [] darray = {2.5,3.1};
        Assert.assertEquals("Test failed",5.6,Addition.add(darray));
    }
    */
  @Test
  public void SumVaryingNumbers(){

      /*System.out.println("Enter the first number");
      //get user input for a
      System.out.println("Enter the second number");
      //get user input for b*/
        Assert.assertEquals("Test Failed", 20.7,Addition.add(4.2,5.5,7,4));
      Assert.assertEquals(9.1+9.2+3+6+9,Addition.add(9.1,9.2,3,6,9));
      Assert.assertEquals(1+3+8.3+6.4+6+4+5+4+9,Addition.add(1,3,8.3,6.4,6,4,5,4,9));
    }
}
