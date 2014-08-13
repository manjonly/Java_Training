package training.ideas.java.datatypes;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnmao on 7/28/2014.
 */
public class ArrayTest {
    @Test
    public void interchagevaluesingivenarrayforgivenpositionstest() {
        WorkingwithArrays newarrayclass = new WorkingwithArrays();
        int [] inputarray = {12,80,77,58,100};
        int pos1=2;
        int pos2=4;
        int [] outputarray = {12, 80, 100, 58, 77};
        Assert.assertArrayEquals(outputarray, newarrayclass.interchangearrayvalues(inputarray,pos1,pos2));
    }

    @Test
    public void interchangevaluestest2(){
        WorkingwithArrays newarrayclass = new WorkingwithArrays();
        int [] inputarray = {12,80,77,58,100};
        int pos1=0;
        int pos2=2;
        int [] outputarray = {77,80,12,58,100};
        Assert.assertArrayEquals(outputarray, newarrayclass.interchangearrayvalues(inputarray,pos1,pos2));
    }

    @Test
    public void interchangevaluestest3(){
        WorkingwithArrays newarrayclass = new WorkingwithArrays();
        int [] inputarray = {12,80,77,58,100};
        int pos1=1;
        int pos2=1;
        //int [] outputarray = {77,80,12,58,100};
        Assert.assertArrayEquals(inputarray, newarrayclass.interchangearrayvalues(inputarray,pos1,pos2));
    }

    @Test
    public void interchangevaluestest4(){
        WorkingwithArrays newarrayclass = new WorkingwithArrays();
        int [] inputarray = {12,80,77,58,100};
        int pos1=1;
        int pos2=3;
        int [] outputarray = {12,58,77,80,100};
        Assert.assertArrayEquals(outputarray, newarrayclass.interchangearrayvalues(inputarray,pos1,pos2));
    }

    @Test
    public void interchangevaluestest5(){
        WorkingwithArrays newarrayclass = new WorkingwithArrays();
        int [] inputarray = {12,80,77,58,100};
        int pos1=0;
        int pos2=4;
        int [] outputarray = {100,80,77,58,12};
        Assert.assertArrayEquals(outputarray, newarrayclass.interchangearrayvalues(inputarray,pos1,pos2));
    }
}
