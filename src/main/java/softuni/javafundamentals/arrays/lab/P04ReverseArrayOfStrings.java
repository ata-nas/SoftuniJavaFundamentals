package softuni.javafundamentals.arrays.lab;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        reverseArray(arr);
        printArray(arr);
    }

    public static <T> void reverseArray(T[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            T tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
        }
    }

    public static <T> void printArray(T[] a) {
        for (T item : a) {
            System.out.printf("%s ", item);
        }
    }
}
