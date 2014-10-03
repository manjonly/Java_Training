package training.ideas.java.decisions;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by idnmao on 9/24/2014.
 */
public class Rates {

    int propertyid;
    private List<Rate> ratesList = new ArrayList<Rate>();
    Connection con;
    Statement stmt;

    public Rates(int propertyid) {
        this.propertyid=propertyid;
    }

    public List<Rate> getRates() throws SQLException, SeasonOverlapException, ClassNotFoundException {
        ResultSet rs = getResultSetForThisProperty();
        String curRateName="";
        Rate rate=null;
        //Season season=null;
        while (rs.next()) {
            String newRateName = rs.getString("shortname");
            Season season = new Season(new Date(rs.getDate("startDate").getTime()),new Date(rs.getDate("endDate").getTime()),rs.getDouble("sunday"));
            if(curRateName==""){
                curRateName=newRateName;
                rate = new Rate(newRateName);
            }
            if(curRateName.equals(newRateName)==false){
                ratesList.add(rate);
                rate = new Rate(newRateName);
            }
            rate.addSeason(season);
        }
        ratesList.add(rate);
        rs.close();
        stmt.close();
        con.close();
        return ratesList;
    }


    public ResultSet getResultSetForThisProperty() throws SQLException, ClassNotFoundException {
        ResultSet resultSetForThisProperty=null;
        con = getConnection();
        stmt = con.createStatement();
        resultSetForThisProperty = stmt.executeQuery("select shortname, startdate,enddate, sunday from propertyratebands1 A, propertyratedetails1 B where A.propertyrateid=B.propertyrateid and B.enddate>now() and A.propertyid=1;");
        return resultSetForThisProperty;
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/PNG1_71", "admin", "admin");
    }

}
