package training.ideas.java.decisions;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by idnmao on 9/16/2014.
 */
public class MINLOSTEST {
    @Test
    public void testMINLOSis0(){
        MINLOS myminlos = new MINLOS();
        Assert.assertEquals(0, myminlos.calculate("NNNNNNN"));
    }

    @Test
    public void testMINLOSis7(){
        MINLOS myminlos = new MINLOS();
        Assert.assertEquals(7, myminlos.calculate("YYYYYYY"));
    }

    @Test
    public void testMINLOSis4(){
        MINLOS myminlos = new MINLOS();
        Assert.assertEquals(4, myminlos.calculate("YYYYNYY"));
    }

    @Test
    public void testMINLOSforDiffRates(){
        Map<String, String> myPatternMap = new TreeMap<String, String>();
        Map<String, Integer> myExpectedResultMap = new TreeMap<String, Integer>();

        MINLOS myminlos = new MINLOS();

        myPatternMap.put("RATE1","YNNYYNN");
        myPatternMap.put("RATE2","NYNNNYN");
        myPatternMap.put("RATE3","YYNYYYY");

        myExpectedResultMap.put("RATE1",1);
        myExpectedResultMap.put("RATE2",0);
        myExpectedResultMap.put("RATE3",2);

        Assert.assertEquals(myExpectedResultMap, myminlos.calculate(myPatternMap));
    }

    @Test
    public void testMINLOSforDiffDatesAndRates() throws ParseException {
        Map<Date,Map<String, String>> myPatternMap = new TreeMap<Date,Map<String, String>>();
        Map<Date,Map<String, Integer>> myExpectedResultMap = new TreeMap<Date,Map<String, Integer>>();

        SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate = myDateFormat.parse("2014-09-01");

        MINLOS myminlos = new MINLOS();
        myPatternMap.put(myDate, new TreeMap<String, String>());
        myPatternMap.get(myDate).put("RATE1", "YNNYYNN");
        myPatternMap.get(myDate).put("RATE2", "NYNNNYN");
        myPatternMap.get(myDate).put("RATE3", "YYNYYYY");

        myExpectedResultMap.put(myDate, new TreeMap<String, Integer>());
        myExpectedResultMap.get(myDate).put("RATE1", 1);
        myExpectedResultMap.get(myDate).put("RATE2", 0);
        myExpectedResultMap.get(myDate).put("RATE3", 2);

        Assert.assertEquals(myExpectedResultMap, myminlos.calculateFinal(myPatternMap));
    }
}
