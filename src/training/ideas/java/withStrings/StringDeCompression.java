package training.ideas.java.withStrings;

/**
 * Created by idnmao on 8/11/2014.
 */
public class StringDeCompression {
    public String decompressGivenString(String myInputString) {
        String myOutputString = "";
        for(int i=0;i<myInputString.length();i=i+2){
           int pos=i+1;
           int myCounter = Character.getNumericValue(myInputString.charAt(pos));
           char myChar = myInputString.charAt(i);
           for (int j=0;j<myCounter;j++) myOutputString=myOutputString+myChar;
        }
        return myOutputString;
    }
}
