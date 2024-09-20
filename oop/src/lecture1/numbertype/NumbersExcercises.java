package lecture1.numbertype;

import java.util.*;
import java.util.stream.Collectors;

public class NumbersExcercises {
    public static void main(String[] args) {
        Map<Class<? extends Number>, List<? extends Number>> numberMap = new HashMap<>();

        numberMap.put(Double.class, Arrays.asList(10.0, 1.1, 24.2, -8.0));
        numberMap.put(Integer.class, Arrays.asList(1, 1, 24, -8));

        for (Class<? extends Number> key : numberMap.keySet()) {
            List<? extends Number> numbers = numberMap.get(key);

            if (key.equals(Integer.class)) {
                System.out.println(numbers.stream().map(x -> x.intValue() * 2).collect(Collectors.toList()));
            } else if (key.equals(Double.class)) {
                System.out.println(numbers.stream().map(x -> x.doubleValue() * 2).collect(Collectors.toList()));
            }

            if (numbers.get(0) instanceof Integer) {
                multiplyBy2(numbers);
            }
        }

    }

    private static void multiplyBy2(List<? extends Number> numbers) {
        for (Number number : numbers) {
            int i1 = (int) (number) * 2;
            System.out.println(i1);
        }
    }

    private class ParametrizedMethod {
        public static <T extends Number> List<T> multiplyByTwo(List<? extends Number> numberList) {
            List<T> resultList = new ArrayList<>();

            for (Number number : numberList) {
                T castedNumber = (T) number;
            }
            return resultList;
        }
    }
}


