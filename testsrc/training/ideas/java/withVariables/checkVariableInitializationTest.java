package training.ideas.java.withVariables;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnmao on 8/21/2014.
 */
public class checkVariableInitializationTest {
    @Test
    public void checkIntegerInitializationTest(){
        CheckVariableInitialization myVarClass= new CheckVariableInitialization();
        Assert.assertEquals(0, myVarClass.checkIntegerInitialization());

    }

}
