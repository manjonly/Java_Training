package training.ideas.java.decisions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by idnmao on 9/22/2014.
 */
public class Rate {
    String rateName;
    private List<Season> seasonList = new ArrayList<Season>();

    public Rate(String rateName) {
        this.rateName=rateName;
    }

    public String rateName() {
        return rateName;
    }

    public boolean addSeason(Season season) throws SeasonOverlapException {
        for (Season eachSeason: seasonList){
            if (eachSeason.overlaps(season)){
                return false;
            }
        }
        seasonList.add(season);
        return true;
    }


    public Double rateValue(Date occupancyDate) {
        for(Season eachSeason: seasonList){
            if (eachSeason.isDateInSeason(occupancyDate)) return eachSeason.rateValue();
        }
        return 0.00;
    }
}
