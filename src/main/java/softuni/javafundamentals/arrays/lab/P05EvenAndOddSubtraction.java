package softuni.javafundamentals.arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumEvens = 0;
        int sumOdds = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                sumEvens += num;
            } else {
                sumOdds += num;
            }
        }

        System.out.println(sumEvens - sumOdds);
    }
}
