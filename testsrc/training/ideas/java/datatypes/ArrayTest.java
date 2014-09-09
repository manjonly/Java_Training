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

    @Test
    public void returnSubArraygivenEndIndex1(){
        WorkingwithArrays newarrayclass = new WorkingwithArrays();
        int [] inputarray = {12,80,77,58,100,83,41,98,65,58,79,99,92};
        int [] outputarray = {12,80,77,58,100};
        Assert.assertArrayEquals(outputarray, newarrayclass.returnSubArray(inputarray,0,4));
    }

    @Test
    public void returnSubArraygivenEndIndex2(){
        WorkingwithArrays newarrayclass = new WorkingwithArrays();
        int [] inputarray = {12,80,77,58,100,83,41,98,65,58,79,99,92};
        int [] outputarray = {12,80,77,58,100,83,41,98,65,58,79,99,92};
        Assert.assertArrayEquals(outputarray, newarrayclass.returnSubArray(inputarray,0,12));
    }

    @Test
    public void returnSubArraygivenEndIndex3(){
        WorkingwithArrays newarrayclass = new WorkingwithArrays();
        int [] inputarray = {12,80,77,58,100,83,41,98,65,58,79,99,92};
        int [] outputarray = {12,80,77,58,100,83,41,98,65,58,79,99};
        Assert.assertArrayEquals(outputarray, newarrayclass.returnSubArray(inputarray,0,11));
    }

    @Test
    public void returnSubArraygivenStartnEndIndexs1(){
        WorkingwithArrays newarrayclass = new WorkingwithArrays();
        int [] inputarray = {12,80,77,58,100,83,41,98,65,58,79,99,92};
        int [] outputarray = {100,83,41,98};
        Assert.assertArrayEquals(outputarray, newarrayclass.returnSubArray(inputarray,4,7));
    }
}
