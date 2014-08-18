package training.ideas.java.withChars;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.withchars.findChar;

/**
 * Created by idnmao on 8/17/2014.
 */
public class findCharIndexAtOccuranceTest {
    @Test
    public void findCharAtOccuranceTest1(){
        findChar myFindCharClass=new findChar();
        char [] myInputCharArray = {'M','A','N','J','A','R','I','N','I','K','I','T','A'};
        int expectedOutputIndex = 8;

        Assert.assertEquals(expectedOutputIndex, myFindCharClass.findCharReturnIndexChar(myInputCharArray, 'I', 7));
    }

    @Test
    public void findCharAtOccuranceTest2(){
        findChar myFindCharClass=new findChar();
        char [] myInputCharArray = {'M','A','N','J','A','R','I','N','I','K','I','T','A'};
        int expectedOutputIndex = -1;

        Assert.assertEquals(expectedOutputIndex, myFindCharClass.findCharReturnIndexChar(myInputCharArray, 'Q',5));
    }

    @Test
    public void findCharAtOccuranceTest3(){
        findChar myFindCharClass=new findChar();
        char [] myInputCharArray = {'M','A','N','J','A','R','I','N','I','K','I','T','A'};
        int expectedOutputIndex = -1;

        Assert.assertEquals(expectedOutputIndex, myFindCharClass.findCharReturnIndexChar(myInputCharArray, 'K',10));
    }

    @Test
    public void findCharAtOccuranceTest31(){
        findChar myFindCharClass=new findChar();
        char [] myInputCharArray = {'M','A','N','J','A','R','I','N','I','K','I','T','A'};
        int expectedOutputIndex = 9;

        Assert.assertEquals(expectedOutputIndex, myFindCharClass.findCharReturnIndexChar(myInputCharArray, 'K',9));
    }

    @Test
    public void findCharAtOccuranceTest4(){
        findChar myFindCharClass=new findChar();
        char [] myInputCharArray = {'M','A','N','J','A','R','I','N','I','K','I','T','A'};
        int expectedOutputIndex = 0;

        Assert.assertEquals(expectedOutputIndex, myFindCharClass.findCharReturnIndexChar(myInputCharArray, 'M',0));
    }

    @Test
    public void findCharAtOccuranceTest5(){
        findChar myFindCharClass=new findChar();
        char [] myInputCharArray = {'M','A','N','J','A','R','I','N','I','K','I','T','A'};
        int expectedOutputIndex = 12;

        Assert.assertEquals(expectedOutputIndex, myFindCharClass.findCharReturnIndexChar(myInputCharArray, 'A',7));
    }
}
