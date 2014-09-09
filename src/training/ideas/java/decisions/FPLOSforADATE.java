package training.ideas.java.decisions;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by idnmao on 7/24/2014.
 */
public class FPLOSforADATE {
    private final List<Double> lrv;
    public FPLOSforADATE(List<Double> givenLRV) {
        this.lrv=givenLRV;
    }

    public Map<String,String> processFPLOS(Map<String, Double> myRateMap) {
        Map<String,String> myCalculatedFPLOS = new TreeMap<String, String>();
        Set<String> myRateCodes = myRateMap.keySet();
        for (String eachRateCode : myRateCodes){
            //String thisRateCode =  String() eachRateCode;
            myCalculatedFPLOS.put(eachRateCode,calculate(myRateMap.get(eachRateCode)));
        }
        return myCalculatedFPLOS;
    }

    public String calculate(Double givenRate) {
        double sumOfLRV=0.0;
        double sumofRate=0.0;
        String pattern="";

        for (double eachLRV : lrv){
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
