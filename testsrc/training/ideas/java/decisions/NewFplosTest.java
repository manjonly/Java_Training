package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Created by idnmao on 9/4/2014.
 */
public class NewFplosTest{
    private Map<String, Double> myRateMap = new TreeMap<String, Double>();

    @Test
    public void testFPLOSforMultiple_Rates_and_LRV(){
        Map<String, List<Double>> myDATELRVMap = new TreeMap<String, List<Double>>();

        List<Double> myLRVList = new ArrayList<Double>(Arrays.asList(10.1, 0.0, 13.9, 14.0, 8.10, 0.0, 17.0));
        myDATELRVMap.put("2014-09-01", myLRVList);

        myLRVList = new ArrayList<Double>(Arrays.asList(32.8, 5.8, 13.23, 12.4, 6.13, 28.28, 34.36));
        myDATELRVMap.put("2014-09-02", myLRVList);

        myRateMap.put("RATE1",20.0);
        myRateMap.put("RATE2",0.0);
        myRateMap.put("RATE3",10.0);

        Map<String, Map<String, String>> expectedFPLOSMapforDiffDatesAndRate = new TreeMap<String, Map<String, String>>();

        expectedFPLOSMapforDiffDatesAndRate= new TreeMap<String, Map<String, String>>() {{
                put("2014-09-01",new TreeMap<String,String>()
                        {{
                                put("RATE1","YYYYYYY");
                                put("RATE2","NNNNNNN");
                                put("RATE3","NYYYYYY");
                            }}
                );
                put("2014-09-02", new TreeMap<String, String>(){{
                    put("RATE1","NYYYYYY");
                    put("RATE2","NNNNNNN");
                    put("RATE3","NNNNNNN");
                }});
            }};

        FPLOS fplos = new FPLOS();
        Assert.assertEquals(expectedFPLOSMapforDiffDatesAndRate,fplos.calculate(myRateMap,myDATELRVMap));
    }



    private List<Double> LRVforADate = new ArrayList<Double>(Arrays.asList(10.1, 0.0, 13.9, 14.0, 8.10, 0.0, 17.0));
    private Map<String, String> expectedFPLOSMap = new TreeMap<String, String>();

    @Test
    public void testFPLOSforMultipleRates(){
        myRateMap.put("Rate1",20.0);
        myRateMap.put("Rate2",0.0);
        myRateMap.put("Rate3",10.0);

        expectedFPLOSMap.put("Rate1", "YYYYYYY");
        expectedFPLOSMap.put("Rate2", "NNNNNNN");
        expectedFPLOSMap.put("Rate3", "NYYYYYY");

        FPLOS fplos = new FPLOS();
        Assert.assertEquals(expectedFPLOSMap,fplos.calculate(myRateMap,LRVforADate));
    }

    Double givenRate;
    String expectedFPLOS;
    private List<Double> givenLRV = new ArrayList<Double>(Arrays.asList(10.1, 0.0, 13.9, 14.0, 8.10, 0.0, 17.0));

    @Test
    public void testRateIsOpenForAllLOS(){
        givenRate = 20.0;
        expectedFPLOS = "YYYYYYY";
        FPLOS fplos = new FPLOS();
        Assert.assertEquals(expectedFPLOS,fplos.calculate(givenRate,givenLRV));
    }
    @Test
    public void testRateIsClosedForAllLOS(){
        givenRate = 0.0;
        expectedFPLOS = "NNNNNNN";
        FPLOS fplos = new FPLOS();
        Assert.assertEquals(expectedFPLOS,fplos.calculate(givenRate,givenLRV));
    }

    @Test
    public void testRateIsClosedFor1LOSONLY(){
        givenRate = 10.0;
        expectedFPLOS = "NYYYYYY";
        FPLOS fplos = new FPLOS();
        Assert.assertEquals(expectedFPLOS,fplos.calculate(givenRate,givenLRV));
    }
}
