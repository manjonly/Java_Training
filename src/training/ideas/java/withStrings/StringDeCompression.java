package training.ideas.java.withStrings;

/**
 * Created by idnmao on 8/11/2014.
 */
public class StringDeCompression {
    public String decompressGivenString(String myInputString) {
        String myOutputString = "";
        char myChar = myInputString.charAt(0);
        int myCounter=0;
        char myNextChar ;
        int i=1;
        for(;i<=myInputString.length();i++){
           if (i==myInputString.length()){
               myNextChar=myInputString.charAt(0);
           } else {
               myNextChar = myInputString.charAt(i);
           }
            if (Character.isDigit(myNextChar)){
               if (myCounter>0) {
                   String myTempString =Integer.toString(myCounter) + Integer.toString(Character.getNumericValue(myNextChar));
                   myCounter = Integer.parseInt(myTempString);
               }else {myCounter = Character.getNumericValue(myNextChar);
               }
           }else{
               //int pos = i + 1;
               for (int j=0;j<myCounter;j++) myOutputString = myOutputString + myChar;
               myCounter=0;
               myChar=myNextChar;
           }
        }
        return myOutputString;
    }
}
