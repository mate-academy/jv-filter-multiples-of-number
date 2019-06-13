package core.basesyntax;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class FilterOfNumberTest {
    private int[] array;

    @Before
    public void arrayInitializing() {
        array = new int[40];
        for (int i = 0; i < array.length; i++) {
            array[i] = i - array.length / 2;
        }
    }

    @Test(expected = ArithmeticException.class)
    public void checkDivisionRemainder() {

        FilterOfNumber checkRemainder = new FilterOfNumber();
        for (int value = -5; value < 10; value++) {
            int[] actualResult = checkRemainder.filterMultiplesOfNumber(array, value);
            int[] expectedResult = correctFilterMultiplesOfNumber(array, value);
            Assert.assertArrayEquals("Test failed with array: " + actualResult.toString()
                    + "\nexpected array: " + expectedResult.toString()
                    + "\nand value: " + value, actualResult, expectedResult);
        }
    }

    private int[] correctFilterMultiplesOfNumber(int[] array, int value) {
        return Arrays.stream(array).filter(a -> a % value == 0).toArray();
    }
}
