package training.ideas.java.withchars;

/**
 * Created by idnmao on 8/15/2014.
 */
public class findChar {
    public int findCharReturnIndexChar(char[] userInputCharArray, char userFindChar) {
        findCharIndexAtOccurance findCharIndexMethod=new findCharIndexAtOccurance();
        int myCharIndex=findCharIndexMethod.myIndexOF(userInputCharArray,userFindChar,0);
        return myCharIndex;
    }

    public int findCharReturnIndexChar(char[] userInputCharArray, char userFindChar, int atIndex) {
        findCharIndexAtOccurance findCharIndexMethod=new findCharIndexAtOccurance();
        int myCharIndex=findCharIndexMethod.myIndexOF(userInputCharArray,userFindChar,atIndex);
        return myCharIndex;
    }

}
