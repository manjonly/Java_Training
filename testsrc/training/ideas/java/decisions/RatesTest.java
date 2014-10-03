package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by idnmao on 9/24/2014.
 */
public class RatesTest {

    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    List<Rate> rateList = new ArrayList<Rate>(1);

    @Test
    public void test_addRates() throws ParseException, SeasonOverlapException, SQLException, ClassNotFoundException {
        int propertyid = 1;
        Rates rates = new Rates(propertyid);
        rateList=getRatesforPNG_PID1();
        Assert.assertEquals(rateList, rates.getRates());
    }

    public List<Rate> getRatesforPNG_PID1() throws ParseException, SeasonOverlapException {
        Rate rate = new Rate("Rack");
        Season season = new Season(df.parse("2014-01-01"),df.parse("2014-12-31"),349.0);
        rate.addSeason(season);
        season = new Season(df.parse("2015-01-01"), df.parse("2015-12-31"), 449.0);
        rate.addSeason(season);
        rateList.add(rate);
        return rateList;
    }

}
