package training.ideas.java.withchars;

/**
 * Created by idnmao on 8/15/2014.
 */
public class findCharIndexAtOccurance {
    public int myIndexOF(char[] inputCharArray, char userFindChar, int atIndex) {
        boolean flagFound=false;
        int i=-1;
        for ( char eachelement:inputCharArray){
            i++;
            if (userFindChar==eachelement && i>=atIndex ) {
                flagFound=true;
                break;
            }
        }
        if (flagFound==false) i=-1;
        return i;
    }
}
