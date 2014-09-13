package training.ideas.java.decisions;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by idnmao on 7/24/2014.
 */
public class FPLOS {
/*
    private final List<Double> lrv;
    public FPLOS(List<Double> givenLRV) {
        this.lrv=givenLRV;
    }
*/
public Map<String, Map<String, String>> calculate(Map<String, Double> myRateMap, Map<String, List<Double>> myDATELRVMap) {
        Map<String,String> myTempFPLOSMap = new TreeMap<String, String>();
        Map<String, Map<String, String>> myFinalFPLOSMap = new TreeMap<String, Map<String, String>>();
        Set<String> myOccDates = myDATELRVMap.keySet();
        for (String eachOccDate : myOccDates){
            myTempFPLOSMap=calculate(myRateMap, myDATELRVMap.get(eachOccDate));
            myFinalFPLOSMap.put(eachOccDate,myTempFPLOSMap);
        }
        return myFinalFPLOSMap;
    }

    public Map<String,String> calculate(Map<String, Double> myRateMap, List<Double> givenLRV) {
        Map<String,String> myCalculatedFPLOS = new TreeMap<String, String>();
        Set<String> myRateCodes = myRateMap.keySet();
        for (String eachRateCode : myRateCodes){
            myCalculatedFPLOS.put(eachRateCode,calculate(myRateMap.get(eachRateCode),givenLRV));
        }
        return myCalculatedFPLOS;
    }

    public String calculate(Double givenRate, List<Double> givenLRV) {
        double sumOfLRV=0.0;
        double sumofRate=0.0;
        String pattern="";

        for (double eachLRV : givenLRV){
            sumOfLRV+=eachLRV;
            sumofRate+=givenRate;
            if(sumofRate>=sumOfLRV){
                pattern+="Y";
            }else {
                pattern+="N";
            }
        }
        return pattern;
    }

}
