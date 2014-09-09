package training.ideas.java.pracCollections;

import java.util.ArrayList;

/**
 * Created by idnmao on 8/27/2014.
 */
public class PracArrayList {
    public int pracArrayAddStringONLY(String Item1, String Item2, String Item3){
        ArrayList<String> myStringOnlyList = new ArrayList<String>();
        myStringOnlyList.add(Item1);
        myStringOnlyList.add(Item2);
        myStringOnlyList.add(Item3);
        return myStringOnlyList.size();
    }

    public String[] pracArrayRemoveItemAtIndex(String item1, String item2, String item3, String item4, String item5, int removeatthisindex) {
        ArrayList<String> myStringOnlyList = new ArrayList<String>();
        myStringOnlyList.add(item1);
        myStringOnlyList.add(item2);
        myStringOnlyList.add(item3);
        myStringOnlyList.add(item4);
        myStringOnlyList.add(item5);
        myStringOnlyList.remove(removeatthisindex);
        String [] myStringArray = new String [myStringOnlyList.size()];
        return (myStringOnlyList.toArray(myStringArray));
    }

    public ArrayList<String> pracArrayRemoveItemAtIndex(ArrayList<String> myInputArrayList, int removeatthisindex) {
        /*ArrayList<String> myStringOnlyList = new ArrayList<String>();
        myStringOnlyList.add(item1);
        myStringOnlyList.add(item2);
        myStringOnlyList.add(item3);
        myStringOnlyList.add(item4);
        myStringOnlyList.add(item5);
        myStringOnlyList.remove(removeatthisindex);*/
        myInputArrayList.remove(removeatthisindex);
        //String [] myStringArray = new String [myStringOnlyList.size()];
        //return (myStringOnlyList.toArray(myStringArray));
        return myInputArrayList;
    }

}
