package core.basesyntax;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterOfNumber {

    /**
     * <p>Реализуйте метод filterMultiplesOfNumber(int[] array, int multiplier), принимающий
     * в качестве аргумента массив целых чисел `array` и число `multiplier`
     * остаток от деления на которое необходимо проверить.</p>
     *
     * <p>Ваш метод, должен вернуть массив, состоящий из чисел, которые делятся
     * без остатка на `multiplier`</p>
     */
    public int[] filterMultiplesOfNumber(int[] array, int multiplier) {
        /*int number = 0;
        for (int i: array) {
            if (i % multiplier == 0) {
                number++;
            }
        }
        int[] result = new int[number];
        int index = 0;
        for (int i: array) {
            if (i % multiplier == 0) {
                result[index] = i;
                index++;
            }
        }
        return result*/
        return IntStream.of(array).filter(i -> i % multiplier == 0).toArray();
    }
}
