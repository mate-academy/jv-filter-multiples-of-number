package core.basesyntax;

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
        return IntStream.of(array).filter(i -> i % multiplier == 0).toArray();
    }
}
