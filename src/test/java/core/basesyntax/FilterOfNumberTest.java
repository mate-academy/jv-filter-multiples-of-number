package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class FilterOfNumberTest {
    @Test(expected = ArithmeticException.class)
    public void checkDivisionRemainder() {
        Random random = new Random();
        FilterOfNumber checkRemainder = new FilterOfNumber();
        for (int value = -5; value < 10; value++) {
            int size = random.nextInt(10 + 1) + 5;
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(40 + 1) - 20;
            }

            int[] actualResult = checkRemainder.filterMultiplesOfNumber(array, value);
            int[] expectedResult = correctFilterMultiplesOfNumber(array, value);
            Assert.assertArrayEquals("Test failed with array: " + printArray(actualResult)
                    + " exp: " + printArray(expectedResult)
                    + " and value: " + value, actualResult, expectedResult);
        }
    }

    private String printArray(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]).append(" ");
        }
        return builder.toString();
    }

    private int[] correctFilterMultiplesOfNumber(int[] array, int value) {
        return Arrays.stream(array).filter(a -> a % value == 0).toArray();
    }
}
