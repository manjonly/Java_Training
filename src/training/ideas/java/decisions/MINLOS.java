package training.ideas.java.decisions;

/**
 * Created by idnmao on 7/25/2014.
 */
public class MINLOS {
    public int calculateminlos(String Mystr) {
    //public int calculateminlos() {
        //String Mystr="YYYYYYY";
        //String[] res;
        //String[] res = Mystr.split("");

        String stringN="N";

        int minloscount = 0;
        minloscount=Mystr.indexOf(stringN);
        if (minloscount <0)  minloscount =7;

        //String delims = "[]";
        //String[] res = Mystr.split(delims);

        //System.out.println(res[0]);
        //THIS IS MY OLD CODE//
        /*
        char[] res = Mystr.trim().toCharArray();
        int minloscount = 0;
        for (char eachres : res){
            if (eachres == 'Y') minloscount=minloscount+1;
            else break;
        }
        */
       return minloscount;
    }
}
