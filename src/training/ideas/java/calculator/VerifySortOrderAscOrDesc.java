package training.ideas.java.calculator;

/**
 * Created by idnmao on 9/4/2014.
 */
public class VerifySortOrderAscOrDesc {
    public enum sortOrder {ASC,DESC}
    public static boolean check(int lhs, int rhs, sortOrder sortOrder) {
//        return sortOrder == sortOrder.ASC ? lhs>rhs : lhs < rhs;

        if(sortOrder==sortOrder.ASC){
            return lhs>rhs;
        }else{
            return lhs<rhs;
        }
    }


}
