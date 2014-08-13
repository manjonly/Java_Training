package training.ideas.java.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnmao on 7/28/2014.
 */
public class SortNumbersTest {
    @Test
    public void sorttestusingbubblesort(){
        SortNumbers newsortobj = new SortNumbers();
        int [] myarray = {5,94,98,90,3};
        int [] myoutput ={3,5,90,94,98};
        Assert.assertArrayEquals(myoutput,newsortobj.sortusingbubblesort("asc", myarray));
    }

    //sorttestdescusingbubblesort
    //sortTestDescendingBubbleSort
    @Test
    public void sorttestdescusingbubblesort(){
        SortNumbers newsortobj = new SortNumbers();
        int [] myarray = {7,10,9,8,7,5,6,5,9};
        int [] myoutput ={10,9,9,8,7,7,6,5,5};
        Assert.assertArrayEquals(myoutput,newsortobj.sortusingbubblesort("desc", myarray));
    }

    @Test
    public void sorttestusinginsertionsort(){
        SortNumbers newsortobj = new SortNumbers();
        int [] myarray = {8,10,5,8,9};
        int [] myoutput ={5,8,8,9,10};
        Assert.assertArrayEquals(myoutput,newsortobj.sortusinginsertionsort("asc", myarray));
    }

    @Test
    public void sorttestusingselectionsort(){
        SortNumbers newsortobj = new SortNumbers();
        int [] myarray = {4,1,14,20,17,9,12,20};
        int [] myoutput ={1,4,9,12,14,17,20,20};
        Assert.assertArrayEquals(myoutput,newsortobj.sortusingselectionsort("asc", myarray));
    }

}
