package training.ideas.java.withStrings;

/**
 * Created by idnmao on 8/17/2014.
 */
public class stringInterchange {
    public String interchangeGivenString(String myInputString) {
        String strOutput = myInputString;
        String strinput=myInputString;
        for (int i=1;i<myInputString.length();i++){
            strinput=stringPushFirstCharToBack(strinput);
            strOutput=strOutput+strinput;
        }
        return strOutput;
    }

    private String stringPushFirstCharToBack(String myInputString) {
        char[] myStringArray = myInputString.trim().toCharArray();
        String str1="";
        Boolean flag=false;
        for (char eachElement : myStringArray){
            if (flag==true){
                str1=str1+eachElement;
            }else{
                flag=true;
            }
        }
        str1=str1+myStringArray[0];
        return str1;
    }
}
