package training.ideas.java.datatypes;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnmao on 8/20/2014.
 */
public class ArrayNamePyramidTest {
    @Test
    public void returnArrayNamePyramidTest1(){
        WorkingwithArrays newarrayclass = new WorkingwithArrays();
        String myName = "RAHUL";
        String [] outputarray = {"    R R    ","   A R R A   ","  H A R R A H  "," U H A R R A H U ","L U H A R R A H U L"};
        Assert.assertArrayEquals(outputarray, newarrayclass.returnArrayNamePyramid(myName));
    }
}
