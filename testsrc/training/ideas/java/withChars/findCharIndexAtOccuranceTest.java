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

    @Test
    public void findCharAtOccuranceTest6(){
        findChar myFindCharClass=new findChar();
        char [] myInputCharArray = {'M','A','N','J','A','R','I','N','I','K','I','T','A'};
        char [] findArray ={'J','K','R','I'};
        int expectedOutputIndex = -1;

        Assert.assertEquals(expectedOutputIndex, myFindCharClass.findCharReturnIndexChar(myInputCharArray,findArray,0));
    }

    @Test
    public void findCharAtOccuranceTest7(){
        findChar myFindCharClass=new findChar();
        char [] myInputCharArray = {'M','A','N','J','A','R','I','N','I','K','I','T','A'};
        char [] findArray ={'J','A','R','I'};
        int expectedOutputIndex = 3;

        Assert.assertEquals(expectedOutputIndex, myFindCharClass.findCharReturnIndexChar(myInputCharArray,findArray,0));
    }

    @Test
    public void findCharAtOccuranceTest8(){
        findChar myFindCharClass=new findChar();
        char [] myInputCharArray = {'M','A','R','J','A','R','I','N','I','K','I','T','A'};
        char [] findArray ={'A','R'};
        int expectedOutputIndex = 4;

        Assert.assertEquals(expectedOutputIndex, myFindCharClass.findCharReturnIndexChar(myInputCharArray,findArray,3));
    }

    @Test
    public void findCharAtOccuranceTest9(){
        findChar myFindCharClass=new findChar();
        char [] myInputCharArray = {'M','A','K','J','A','R','I','N','I','K','I','T','A'};
        char [] findArray ={'A','R'};
        int expectedOutputIndex = 4;

        Assert.assertEquals(expectedOutputIndex, myFindCharClass.findCharReturnIndexChar(myInputCharArray,findArray,0));
    }
}
