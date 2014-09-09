package training.ideas.java.pracCollections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by idnmao on 8/27/2014.
 */
public class PracArrayListTest {
    @Test
    public void pracArrayListStringOnlyTestAddItem(){
        PracArrayList MyPracArrayClass = new PracArrayList();
        String Item1 = "Ramesh";
        //int Item2 = 4;
        String Item2 = "4";
        String Item3 = "Mahesh";
        Assert.assertEquals(3, MyPracArrayClass.pracArrayAddStringONLY(Item1, Item2, Item3));
    }

    @Test
    public void pracArrayListStringOnlyTestRemoveItem(){
        PracArrayList MyPracArrayClass = new PracArrayList();
        String Item1 = "Ramesh";
        String Item2 = "4";
        String Item3 = "Mahesh";
        String Item4 = "Ram";
        String Item5 = "Gopal";
        String [] myOutputArray ={Item2,Item3,Item4,Item5};
        Assert.assertArrayEquals(myOutputArray, MyPracArrayClass.pracArrayRemoveItemAtIndex(Item1, Item2, Item3, Item4,Item5,0));
    }

    @Test
    public void pracArrayListStringOnlyTestRemoveItem2(){
        PracArrayList MyPracArrayClass = new PracArrayList();
        String Item1 = "Ramesh";
        String Item2 = "4";
        String Item3 = "Mahesh";
        String Item4 = "Ram";
        String Item5 = "Gopal";
        String [] myOutputArray ={Item1,Item2,Item3,Item4};
        Assert.assertArrayEquals(myOutputArray, MyPracArrayClass.pracArrayRemoveItemAtIndex(Item1, Item2, Item3, Item4,Item5,4));
    }

    @Test
    public void pracArrayListStringOnlyTestRemoveItem3(){
        ArrayList MyPracArray = new ArrayList();
        MyPracArray.add("Ramesh");
        MyPracArray.add("4");
        MyPracArray.add("Mahesh");
        MyPracArray.add("Ram");
        MyPracArray.add("Gopal");
        MyPracArray.remove(4);

        ArrayList MyOutputArray = new ArrayList();
        MyOutputArray.add("Ramesh");
        MyOutputArray.add("4");
        MyOutputArray.add("Mahesh");
        MyOutputArray.add("Ram");
        //String [] myOutputArray ={Item1,Item2,Item3,Item4};
        Assert.assertEquals(MyOutputArray, MyPracArray);
    }
}
