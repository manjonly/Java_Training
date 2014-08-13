package training.ideas.java.withStrings;

/**
 * Created by idnmao on 8/11/2014.
 */
public class StringCompression {
    public String compressGivenString(String myInputString) {
        char[] myStringArray = myInputString.trim().toCharArray();
        int myStringCount = 0;
        String myOutputString="";
        char initializedChar=myStringArray[0];

        for (char eachchar : myStringArray){
            if (initializedChar!= eachchar){
                myOutputString=myOutputString+initializedChar+myStringCount;
                initializedChar=eachchar;
                myStringCount=1;
            } else {
                myStringCount=myStringCount+1;
            }
        }
        myOutputString=myOutputString+initializedChar+myStringCount;
        return myOutputString;
    }

}
