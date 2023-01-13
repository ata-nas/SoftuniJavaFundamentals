package softuni.javafundamentals.datatypesandvariables.lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputAmount = Integer.parseInt(sc.nextLine());

        BigDecimal result = new BigDecimal(0);

        for (int i = 0; i < inputAmount; i++) {
            BigDecimal currentNumber = new BigDecimal(sc.nextLine());

            result = result.add(currentNumber);
        }
        System.out.println(result);
    }
}
