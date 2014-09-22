package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by idnmao on 9/18/2014.
 */
public class SeasonTest {
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    Double rateValue = 200.00;
    Season season = null;

    public SeasonTest() throws ParseException {
        Date startDate = df.parse("2014-01-01");
        Date endDate = df.parse("2014-03-30");
        season =new Season(startDate,endDate,rateValue);
    }

    @Test
    public void testToGetRateValue() throws ParseException {
        Assert.assertEquals(rateValue,season.rateValue(),0);
    }

    @Test
    public void testToDateExistsinGivenRange() throws ParseException {
        Date occupancyDate = df.parse("2014-02-28");
        Assert.assertTrue(season.isDateInSeason(occupancyDate));
    }

    @Test
    public void testDateEqualsStartDate() throws ParseException {
        Date occupancyDate = df.parse("2014-01-01");
        Assert.assertTrue(season.isDateInSeason(occupancyDate));
    }

    @Test
    public void testDateEqualsEndDate() throws ParseException {
        Date occupancyDate = df.parse("2014-03-30");
        Assert.assertTrue(season.isDateInSeason(occupancyDate));
    }

    @Test
    public void testDateBeforeStartDate() throws ParseException {
        Date occupancyDate = df.parse("2013-12-31");
        Assert.assertFalse(season.isDateInSeason(occupancyDate));
    }

    @Test
    public void testDateAfterEndDate() throws ParseException {
        Date occupancyDate = df.parse("2016-04-01");
        Assert.assertFalse(season.isDateInSeason(occupancyDate));
    }

    @Test
    public void testOverlapWhenNewSeasonStartDateBetweenExistingSeason() throws ParseException, SeasonOverlapException {
        Season newSeason = new Season(df.parse("2014-02-01"),df.parse("2014-04-01"),200.00);
        Assert.assertTrue(season.overlaps(newSeason));
    }

    @Test
    public void testOverlapWhenNewSeasonEndDateBetweenExistingSeason() throws ParseException, SeasonOverlapException {
        Season newSeason = new Season(df.parse("2013-12-01"),df.parse("2014-01-20"),200.00);
        Assert.assertTrue(season.overlaps(newSeason));
    }


    @Test
    public void testNoOverlapOfSeasons() throws ParseException, SeasonOverlapException {
        Season newSeason = new Season(df.parse("2013-12-01"),df.parse("2013-12-31"),200.00);
        Assert.assertFalse(season.overlaps(newSeason));
    }

    @Test
    public void testOverlapWhenNewSeasonWithinExistingSeason() throws ParseException, SeasonOverlapException {
        Season newSeason = new Season(df.parse("2014-02-01"),df.parse("2014-02-20"),200.00);
        Assert.assertTrue(season.overlaps(newSeason));
    }

    @Test
    public void testOverlapWhenExistingSeasonWithinNewSeason() throws ParseException, SeasonOverlapException {
        Season newSeason = new Season(df.parse("2013-12-01"),df.parse("2014-06-20"),200.00);
        Assert.assertTrue(season.overlaps(newSeason));
    }

}
