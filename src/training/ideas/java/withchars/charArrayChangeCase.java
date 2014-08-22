package training.ideas.java.withchars;

/**
 * Created by idnmao on 8/18/2014.
 */
public class charArrayChangeCase {

    public char[] convertToGivenCase(char[] myInputCharArray, char UpperorLower) {
        char [] myOutputCharArray = new char [myInputCharArray.length];
        for (int i=0;i<myInputCharArray.length;i++){
            if (UpperorLower== 'U') {
                myOutputCharArray[i]=Character.toUpperCase(myInputCharArray[i]);
            } else {
                myOutputCharArray[i]=Character.toLowerCase(myInputCharArray[i]);
            }

        }
        return myOutputCharArray;
    }
}
