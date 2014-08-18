package training.ideas.java.withChars;

import junit.framework.Assert;
import org.junit.Test;
import training.ideas.java.withchars.findChar;

/**
 * Created by idnmao on 8/15/2014.
 */
public class findCharIndexReturnCharTest {
    @Test
    public void findCharTest1(){
        findChar myFindCharClass=new findChar();
        char [] myInputCharArray = {'M','A','N','J','A','R','I','N','I','K','I','T','A'};
        int expectedOutputIndex = 6;

        Assert.assertEquals(expectedOutputIndex, myFindCharClass.findCharReturnIndexChar(myInputCharArray, 'I'));
    }
    @Test
    public void findCharTest2(){
        findChar myFindCharClass=new findChar();
        char [] myInputCharArray = {'M','A','N','J','A','R','I','N','I','K','I','T','A'};
        int expectedOutputIndex = -1;

        Assert.assertEquals(expectedOutputIndex, myFindCharClass.findCharReturnIndexChar(myInputCharArray, 'Q'));
    }
    @Test
    public void findCharTest3(){
        findChar myFindCharClass=new findChar();
        char [] myInputCharArray = {'M','A','N','J','A','R','I','N','I','K','I','T','A'};
        int expectedOutputIndex = 9;

        Assert.assertEquals(expectedOutputIndex, myFindCharClass.findCharReturnIndexChar(myInputCharArray, 'K'));
    }
    @Test
    public void findCharTest4(){
        findChar myFindCharClass=new findChar();
        char [] myInputCharArray = {'M','A','N','J','A','R','I','N','I','K','I','T','A'};
        int expectedOutputIndex = 0;

        Assert.assertEquals(expectedOutputIndex, myFindCharClass.findCharReturnIndexChar(myInputCharArray, 'M'));
    }
    @Test
    public void findCharTest5(){
        findChar myFindCharClass=new findChar();
        char [] myInputCharArray = {'M','A','N','J','A','R','I','N','I','K','I','T','A'};
        int expectedOutputIndex = 1;

        Assert.assertEquals(expectedOutputIndex, myFindCharClass.findCharReturnIndexChar(myInputCharArray, 'A'));
    }
}
