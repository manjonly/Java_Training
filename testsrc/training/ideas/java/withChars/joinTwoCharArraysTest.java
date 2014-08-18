package training.ideas.java.withchars;

import org.junit.Assert;
import org.junit.Test;
//import training.ideas.java.withchars.joinTwoCharArray;

/**
 * Created by idnmao on 8/17/2014.
 */
public class joinTwoCharArraysTest {
    @Test
    public void joinCharArrTest1(){
        joinTwoCharArray myJoinCharClass=new joinTwoCharArray();
        char [] myInputCharArray1 = {'A','B','C'};
        char [] myInputCharArray2 = {'D','E','F'};
        char [] myOutputCharArray = {'A','B','C','D','E','F'};

        Assert.assertArrayEquals(myOutputCharArray, myJoinCharClass.joinGivenCharArray(myInputCharArray1, myInputCharArray2));
    }
    @Test
    public void joinCharArrTest2(){
        joinTwoCharArray myJoinCharClass=new joinTwoCharArray();
        char [] myInputCharArray1 = {'M','A','N','J','A','R','I'};
        char [] myInputCharArray2 = {'A','X','Z'};
        char [] myOutputCharArray = {'M','A','N','J','A','R','I','A','X','Z'};

        Assert.assertArrayEquals(myOutputCharArray, myJoinCharClass.joinGivenCharArray(myInputCharArray1, myInputCharArray2));
    }
}
