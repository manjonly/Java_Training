package training.ideas.java.decisions;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by idnmao on 7/24/2014.
 */
public class FPLOSTest {

    @Test
    public void test1(){
        FPLOS myfplos = new FPLOS();
        MINLOS myminlos = new MINLOS();
        double [] LRVfor7days = {2.5,3.1,5.5,6.7,8.3,9.2,10.4};
        Assert.assertEquals("YYYYYYY", myfplos.fplosdate(40.0, LRVfor7days));
        Assert.assertEquals(2, myminlos.calculateminlos("YYNNNNN"));
    }

    @Test
    public void test2(){
        FPLOS myfplos = new FPLOS();
        double [] LRVfor7days = {94.58,75.96,43.73,13.4,33.9,46.13,32.42};
        Assert.assertEquals("NNNNNNN", myfplos.fplosdate(8.22, LRVfor7days));
        MINLOS myminlos = new MINLOS();
        Assert.assertEquals(0, myminlos.calculateminlos("NNNNNNN"));
    }

    @Test
    public void test3(){
        FPLOS myfplos = new FPLOS();
        double [] LRVfor7days = {67.62,80.98,17.28,93.79,22.62,33.79,57};
        Assert.assertEquals("YYYYYYY", myfplos.fplosdate(80.85, LRVfor7days));
        MINLOS myminlos = new MINLOS();
        Assert.assertEquals(7, myminlos.calculateminlos("YYYYYYY"));
    }
    @Test
    public void test4(){
        FPLOS myfplos = new FPLOS();
        double [] LRVfor7days = {91.74,67.3,58.04,64.38,83.78,35.93,17};
        Assert.assertEquals("NYYYYYY", myfplos.fplosdate(89.79, LRVfor7days));
        MINLOS myminlos = new MINLOS();
        Assert.assertEquals(0, myminlos.calculateminlos("NYYYYYY"));
    }

    @Test
    public void test5(){
        FPLOS myfplos = new FPLOS();
        double [] LRVfor7days = {69.31,60.68,8.04,38.3,29.66,35.36,65.1};
        Assert.assertEquals("NNNNNNN", myfplos.fplosdate(14.2, LRVfor7days));
    }

    @Test
    public void testFplosForMultipleRates(){
        FPLOS myfplos = new FPLOS();
        double [] LRVfor7days = {69.31,60.68,8.04,38.3,29.66,35.36,65.1};
        double [] multipleRateSpectrum={2.56,39.98,33.81,62.36,16.100};
        String [] expectedOutputArray = new String [multipleRateSpectrum.length];
        for (int i=0;i<multipleRateSpectrum.length;i++){
            expectedOutputArray[i]=myfplos.fplosdate(multipleRateSpectrum[i], LRVfor7days);
        }
        Assert.assertArrayEquals(expectedOutputArray, myfplos.fplosdate(multipleRateSpectrum, LRVfor7days));
    }

    @Test
    public void testFplosForMultipleRatesTest2(){
        FPLOS myfplos = new FPLOS();
        double [] LRVfor7days = {68.13,81.5,25.21,11.16,11.8,27.82,85.41};
        double [] multipleRateSpectrum={70.66,37.95,48.31,27.86,38.36,64.72,69.96,48.10,63.58,45.70};
        String [] expectedOutputArray = new String [multipleRateSpectrum.length];
        for (int i=0;i<multipleRateSpectrum.length;i++){
            expectedOutputArray[i]=myfplos.fplosdate(multipleRateSpectrum[i], LRVfor7days);
        }
        Assert.assertArrayEquals(expectedOutputArray, myfplos.fplosdate(multipleRateSpectrum, LRVfor7days));
    }

    @Test
    public void testFplosForMultipleRatesTest3(){
        FPLOS myfplos = new FPLOS();
        double [] LRVfor7days = {94.89,59.77,25.47,27.66,55.12,40.59,16.34};
        double [] multipleRateSpectrum={47.7,95.64,64.38,3.76,90.22,91.99,13.83,75.5};
        String [] expectedOutputArray = new String [multipleRateSpectrum.length];
        for (int i=0;i<multipleRateSpectrum.length;i++){
            expectedOutputArray[i]=myfplos.fplosdate(multipleRateSpectrum[i], LRVfor7days);
        }
        Assert.assertArrayEquals(expectedOutputArray, myfplos.fplosdate(multipleRateSpectrum, LRVfor7days));
    }

}
