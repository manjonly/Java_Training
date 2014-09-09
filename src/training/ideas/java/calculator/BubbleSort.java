package training.ideas.java.calculator;

/**
 * Created by idnmao on 9/4/2014.
 */
public class BubbleSort implements Sort{
    public int[] asc(int[] integersValues) {
        sort(integersValues, VerifySortOrderAscOrDesc.sortOrder.ASC);
        return integersValues;
    }
    public int[] desc(int[] integersValues) {
        sort(integersValues, VerifySortOrderAscOrDesc.sortOrder.DESC);
        return integersValues;
    }

    private static void sort(int[] integersValues, VerifySortOrderAscOrDesc.sortOrder mySortOrder) {
        //VerifySortOrderAscOrDesc myCheck = new VerifySortOrderAscOrDesc();
        for (int sortingPassCounter = 0; sortingPassCounter < integersValues.length - 1; sortingPassCounter++) {
            for (int individualNumberCounter = 0; individualNumberCounter < integersValues.length - 1 - sortingPassCounter; individualNumberCounter++) {
                if (VerifySortOrderAscOrDesc.check(integersValues[individualNumberCounter], integersValues[individualNumberCounter + 1], mySortOrder)) {
                    int temp = integersValues[individualNumberCounter];
                    integersValues[individualNumberCounter] = integersValues[individualNumberCounter + 1];
                    integersValues[individualNumberCounter + 1] = temp;
                }
            }
        }
    }

}
