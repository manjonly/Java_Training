package training.ideas.java.withStrings;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnmao on 8/11/2014.
 */
public class stringCompressionTest {

    @Test
    public void compressStringAAABB(){
        StringCompression myStringClass=new StringCompression();
        String myInputString = "AAABB";
        String myExpectedOutput="A3B2";

        Assert.assertEquals(myExpectedOutput,myStringClass.compressGivenString(myInputString));
    }

    @Test
    public void compressStringAABBBCCC(){
        StringCompression myStringClass=new StringCompression();
        String myInputString = "AABBBCCC";
        String myExpectedOutput="A2B3C3";

        Assert.assertEquals(myExpectedOutput,myStringClass.compressGivenString(myInputString));
    }

    @Test
    public void compressStringAABBBCCCCCCCCCCC(){
        StringCompression myStringClass=new StringCompression();
        String myInputString = "AABBBCCCCCCCCCCC";
        String myExpectedOutput="A2B3C11";

        Assert.assertEquals(myExpectedOutput,myStringClass.compressGivenString(myInputString));
    }

}
