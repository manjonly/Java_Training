package training.ideas.java.withStrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnmao on 8/11/2014.
 */
public class stringDecompressionTest {
    @Test
    public void deCompressStringAABBBCCCCCCCCCCC(){
        StringDeCompression myStringClass=new StringDeCompression();
        String myInputString = "A2B3C11";
        String myExpectedOutput="AABBBCCCCCCCCCCC";

        Assert.assertEquals(myExpectedOutput,myStringClass.decompressGivenString(myInputString));
    }

    @Test
    public void decompressStringAAABB(){
        StringDeCompression myStringClass=new StringDeCompression();
        String myInputString = "A3B2";
        String myExpectedOutput="AAABB";

        Assert.assertEquals(myExpectedOutput, myStringClass.decompressGivenString(myInputString));
    }

    @Test
    public void deCompressStringAABBBCCC(){
        StringDeCompression myStringClass=new StringDeCompression();
        String myInputString = "A2B3C3";
        String myExpectedOutput="AABBBCCC";

        Assert.assertEquals(myExpectedOutput, myStringClass.decompressGivenString(myInputString));
    }


}
