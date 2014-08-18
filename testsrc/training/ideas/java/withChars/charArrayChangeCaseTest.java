package training.ideas.java.withChars;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.withchars.charArrayChangeCase;

/**
 * Created by idnmao on 8/18/2014.
 */
public class charArrayChangeCaseTest {
    @Test
    public void returnUpperCharTest(){
        charArrayChangeCase charArrayUpperCaseClass=new charArrayChangeCase();
        char [] myInputCharArray = {'r','t','u'};
        char [] myOutputCharArray = {'R','T','U'};

        Assert.assertArrayEquals(myOutputCharArray, charArrayUpperCaseClass.convertToGivenCase(myInputCharArray, 'U'));
    }

    @Test
    public void returnLowerCharTest(){
        charArrayChangeCase charArrayLowerCaseClass=new charArrayChangeCase();
        char [] myInputCharArray = {'R','T','U'};
        char [] myOutputCharArray = {'r','t','u'};

        Assert.assertArrayEquals(myOutputCharArray, charArrayLowerCaseClass.convertToGivenCase(myInputCharArray, 'L'));
    }

}
