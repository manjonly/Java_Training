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

    public int[] returnSubArray(int[] inputarray, int startpos, int endpos) {
        int myArrayCounter=0;
        int [] myoutputarray = new int [endpos-startpos+1];
        for (int i=startpos;i<=endpos;i++){
            myoutputarray[myArrayCounter]=inputarray[i];
            myArrayCounter++;
        }
        return myoutputarray;
    }

    public String[] returnArrayNamePyramid(String myName) {
        String [] myOutputNamePyramid=new String [myName.length()];
        int myNameCounter=0;
        int myeachStringSize=myName.length()*2;
        for (int i=0;i<myName.length();i++){
             for (int j=1; j<=myeachStringSize;j++){

             }

/*            for (int j=5-myNameCounter;j>=0;j--){
                myOutputNamePyramid[0]=myName.charAt(myNameCounter);
            }
*/
        }
        return myOutputNamePyramid;
    }
}
