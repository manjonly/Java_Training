package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Created by idnmao on 9/4/2014.
 */
public class NewFplosTest{
    List<Double> givenLRV = new ArrayList<Double>(Arrays.asList(10.1, 0.0, 13.9, 14.0, 8.10, 0.0, 17.0));
    Map<String, Double> myRateMap = new TreeMap<String, Double>();
    Map<String, String> expectedFPLOS = new TreeMap<String, String>();

    @Test
    public void testRateIsOpenForAllLOS(){
        myRateMap.put("Rate1",20.0);
        myRateMap.put("Rate2",0.0);
        myRateMap.put("Rate3",10.0);

        expectedFPLOS.put("Rate1","YYYYYYY");
        expectedFPLOS.put("Rate2","NNNNNNN");
        expectedFPLOS.put("Rate3","NYYYYYY");

        FPLOSforADATE fplos = new FPLOSforADATE(givenLRV);
        Assert.assertEquals(expectedFPLOS,fplos.processFPLOS(myRateMap));
    }

    /*
    //Double givenRate;
    //String expectedFPLOS;
    @Test
    public void testRateIsOpenForAllLOS(){
        givenRate = 20.0;
        expectedFPLOS = "YYYYYYY";
        FPLOS fplos = new FPLOS(givenLRV);
        Assert.assertEquals(expectedFPLOS,fplos.calculate(givenRate));
    }
    @Test
    public void testRateIsClosedForAllLOS(){
        givenRate = 0.0;
        expectedFPLOS = "NNNNNNN";
        FPLOS fplos = new FPLOS(givenLRV);
        Assert.assertEquals(expectedFPLOS,fplos.calculate(givenRate));
    }

    @Test
    public void testFPLOSIsNYYYYYYY(){
        givenRate = 10.0;
        expectedFPLOS = "NYYYYYY";
        FPLOS fplos = new FPLOS(givenLRV);
        Assert.assertEquals(expectedFPLOS,fplos.calculate(givenRate));
    }*/

}
