package training.ideas.java.datatypes;

/**
 * Created by idnmao on 7/28/2014.
 */
public class WorkingwithArrays {

    public int[] interchangearrayvalues(int[] inputarray, int pos1, int pos2) {
        int tempvar = inputarray[pos1];
        inputarray[pos1]= inputarray[pos2];
        inputarray[pos2]= tempvar;
        return inputarray;
    }
}
