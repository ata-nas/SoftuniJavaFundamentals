package softuni.javafundamentals.lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String result = "";

        while (list.size() > 0) {
            if (list.size() == 1) {
                result += list.get(0);
                break;
            }
            result += (list.get(0) + list.get(list.size() - 1)) + " ";
            list.remove(0);
            list.remove(list.size() -1);
        }
        System.out.println(result);
    }
}
