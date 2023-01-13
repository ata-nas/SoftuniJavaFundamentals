package softuni.javafundamentals.arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .filter(a -> a % 2 == 0)
                .sum();

        System.out.println(sum);
    }
}