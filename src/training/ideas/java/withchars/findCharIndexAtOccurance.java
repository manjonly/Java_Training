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

    public int myIndexOF(char[] inputCharArray, char [] userFindCharArray, int atIndex) {
        boolean foundfirstoccurance=false;
        boolean endofCharArray=false;
        int i=-1;
        int returnindex=-1;
        int userFindArrayCounter=0;
        for (i=0; i<inputCharArray.length;i++){
            if (userFindArrayCounter==userFindCharArray.length) break;
            if (userFindCharArray[userFindArrayCounter]==inputCharArray[i] && i>=atIndex){
                if (returnindex==-1) returnindex=i;
                foundfirstoccurance=true;
                userFindArrayCounter++;
            }else if(userFindCharArray[userFindArrayCounter]!=inputCharArray[i] && foundfirstoccurance==true){
                foundfirstoccurance=false;
                userFindArrayCounter=0;
                returnindex=-1;
            }
        }
        //if (foundfirstoccurance==false) i=-1;
        return returnindex;
    }
}
