package softuni.javafundamentals.basicsyntax.lab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (int i = 0; i <= n * 2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
