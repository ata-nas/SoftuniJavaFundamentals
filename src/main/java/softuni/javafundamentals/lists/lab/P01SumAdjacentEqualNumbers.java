package softuni.javafundamentals.lists.lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> list = Arrays
                .stream(sc.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < list.size() - 1; i++) {
            if (Objects.equals(list.get(i), list.get(i + 1))) {
                list.set(i, (list.get(i) + list.get(i + 1)));
                list.remove(list.get(i + 1));
                i = -1;
            }
        }

        String result = joinElements(" ", list);
        System.out.println(result);
    }

    public static <T> String joinElements(String delimiter, List<T> target) {
        String resultString = "";

        for (T item : target) {
            String formatted = new DecimalFormat("0.#").format(item);

            resultString += formatted + delimiter;
        }

        return resultString;
    }
}
