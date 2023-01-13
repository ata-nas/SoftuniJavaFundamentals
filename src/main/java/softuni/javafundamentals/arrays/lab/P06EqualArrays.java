package softuni.javafundamentals.arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (identicalArrays(firstArr, secondArr)) {
            identicalArraysAction(firstArr);
        } else {
            nonIdenticalArraysAction(firstArr, secondArr);
        }
    }

    public static boolean identicalArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void identicalArraysAction(int[] a) {
        int sum = Arrays.stream(a).sum();

        System.out.printf("Arrays are identical. Sum: %d", sum);
    }

    public static void nonIdenticalArraysAction(int[] a, int[] b) {
        int maxIndexLen = Math.min(a.length, b.length);

        int targetIndex = maxIndexLen;

        for (int i = 0; i < maxIndexLen; i++) {
            if (a[i] != b[i]) {
                targetIndex = i;
                break;
            }
        }

        System.out.printf("Arrays are not identical. Found difference at %d index.", targetIndex);
    }
}
