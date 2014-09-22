package training.ideas.java.decisions;

import java.util.Date;

/**
 * Created by idnmao on 9/18/2014.
 */
public class Season {


    private final Date startDate;
    private final Date endDate;
    private final Double rateValue ;

    public Season(Date startDate, Date endDate, Double rateValue) {
        this.startDate=startDate;
        this.endDate=endDate;
        this.rateValue=rateValue;
    }

    public double rateValue() {
        return rateValue;
    }

    public boolean isDateInSeason(Date occupancyDate) {
        return ((occupancyDate.equals(startDate)||occupancyDate.after(startDate)) && (occupancyDate.before(endDate)||occupancyDate.equals(endDate)));
    }

    public boolean overlaps(Season season) throws SeasonOverlapException {
        if(isDateInSeason(season.startDate)||isDateInSeason(season.endDate)||season.isDateInSeason(startDate)){
            throw new SeasonOverlapException();
        }
        return false;
    }
}
