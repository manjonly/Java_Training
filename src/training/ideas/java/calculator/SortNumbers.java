package training.ideas.java.calculator;

import training.ideas.java.datatypes.WorkingwithArrays;

/**
 * Created by idnmao on 7/28/2014.
 */
public class SortNumbers {
    public static int[] sortusingbubblesort(String givenorder, int[] inputarray) {
        if (givenorder == "asc") sortusingbubblesortasc(inputarray);
        else sortusingbubblesortdesc(inputarray);
        return inputarray;
    }

    private static int[] sortusingbubblesortasc(int[] inputarray) {
        WorkingwithArrays NewArrayClass = new WorkingwithArrays();
        boolean swap=false;
        int lengthofarrayminusone=inputarray.length-1;
        do {
             swap=false;
             int pos1=0;
             int pos2=0;
             for (;pos1<lengthofarrayminusone;pos1++){
                 pos2=pos1+1;
                 if (inputarray[pos1] > inputarray[pos2]) {
                     NewArrayClass.interchangearrayvalues(inputarray,pos1,pos2);
                     swap=true;
                 }
             }
           } while (swap);
        return inputarray;
    }

    private static int[] sortusingbubblesortdesc(int[] inputarray) {
        WorkingwithArrays NewArrayClass = new WorkingwithArrays();
        boolean swap=false;
        int lengthofarrayminusone=inputarray.length-1;
        do {
            swap=false;
            int pos1=0;
            int pos2=0;
            for (;pos1<lengthofarrayminusone;pos1++){
                pos2=pos1+1;
                if (inputarray[pos1] < inputarray[pos2]) {
                    NewArrayClass.interchangearrayvalues(inputarray,pos1,pos2);
                    swap=true;
                }
            }
        } while (swap);
        return inputarray;
 }

    public int[] sortusinginsertionsort(String givenorder, int[] inputarray) {
        WorkingwithArrays NewArrayClass = new WorkingwithArrays();
        boolean repeatloop=false;
        int lengthofarrayminusone=inputarray.length-1;
        do{
            repeatloop=false;
            int pos1=0;
            int pos2=0;
            for (;pos1<lengthofarrayminusone;pos1++){
                pos2=pos1+1;
                if (inputarray[pos1] > inputarray[pos2]) {
                    NewArrayClass.interchangearrayvalues(inputarray,pos1,pos2);
                    repeatloop=true;
                    //break;
                }
            }
        } while (repeatloop);
        return inputarray;
    }

    public int[] sortusingselectionsort(String givenorder, int[] inputarray) {
        WorkingwithArrays NewArrayClass = new WorkingwithArrays();
        int firstloop=0;
        int secondloop=0;
        int min=0;
        //int posatmin=0;
        for (;firstloop<inputarray.length;firstloop++){
            int posatmin=0;
            secondloop=firstloop+1;
            min=inputarray[firstloop];
            for (;secondloop<inputarray.length;secondloop++){
                if (min > inputarray[secondloop]) {
                    min=inputarray[secondloop];
                    posatmin=secondloop;
                }
            }
            if(posatmin>0) NewArrayClass.interchangearrayvalues(inputarray,firstloop,posatmin);
        }
        return inputarray;
    }
}