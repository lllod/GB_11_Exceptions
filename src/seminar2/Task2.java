// Если необходимо, исправьте данный код
//try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }


package seminar2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(1, 10);
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter d: ");
            try {
                int d = Integer.parseInt(scanner.next());
                if (d != 0) {
                    try {
                        double catchedRes1 = intArray[8] / d;
                        System.out.println("catchedRes1 = " + catchedRes1);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Catching exception: " + e);
                    }
                    break;
                }
                System.out.println("The number cannot be zero! Try again");
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Catching exception: " + e + "\nTry again");
            }
        }
    }
}
