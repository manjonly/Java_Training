package training.ideas.java.withchars;

/**
 * Created by idnmao on 8/17/2014.
 */
public class joinTwoCharArray {
    public char[] joinGivenCharArray(char[] myInputCharArray1, char[] myInputCharArray2) {
        int totLength=myInputCharArray1.length+myInputCharArray2.length;
        char [] myOutputChar=new char [totLength];

        for(int i=0;i<myInputCharArray1.length;i++){
            myOutputChar[i]=myInputCharArray1[i];
        }

        for(int i=myInputCharArray1.length;i<totLength;i++){
            int pos=i-myInputCharArray1.length;
            myOutputChar[i]=myInputCharArray2[pos];
        }
        return myOutputChar;
    }
}
