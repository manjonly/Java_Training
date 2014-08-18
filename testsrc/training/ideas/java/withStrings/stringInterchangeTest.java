import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.withStrings.stringInterchange;

/**
 * Created by idnmao on 8/17/2014.
 */
public class stringInterchangeTest {
    @Test
    public void stringInterchangeTest1(){
        stringInterchange myStringClass = new stringInterchange();
        String myInputString="ABC";
        String myOutputString="ABCBCACAB";
        Assert.assertEquals(myOutputString, myStringClass.interchangeGivenString(myInputString));
    }

    @Test
    public void stringInterchangeTest2(){
        stringInterchange myStringClass = new stringInterchange();
        String myInputString="MANJARI";
        String myOutputString="MANJARIANJARIMNJARIMAJARIMANARIMANJRIMANJAIMANJAR";
        Assert.assertEquals(myOutputString, myStringClass.interchangeGivenString(myInputString));
    }
}
