package training.ideas.java.decisions;

import java.util.List;

/**
 * Created by idnmao on 7/24/2014.
 */
public class FPLOS_OLD {
    public String fplosdate(double ratevalue, double[] lrVfor7days) {
        double sumofratevalue=0;
        double sumofLRV=0;
        String FPLOSpattern="";
        for(double LRVone:lrVfor7days){
            sumofratevalue+=ratevalue;
            sumofLRV+=LRVone;
            if (sumofratevalue>=sumofLRV) FPLOSpattern += "Y";
            else FPLOSpattern += "N";
        }
        return FPLOSpattern;
    }

    public String [] fplosdate(double[] inputRateSpectrum, double[] lrVfor7days) {
        FPLOS_OLD myfplos = new FPLOS_OLD();
        String [] fplosOutput = new String [inputRateSpectrum.length];
        for (int i=0;i<inputRateSpectrum.length;i++){
            fplosOutput[i]=myfplos.fplosdate(inputRateSpectrum[i], lrVfor7days);
        }
        return fplosOutput;
    }

}
