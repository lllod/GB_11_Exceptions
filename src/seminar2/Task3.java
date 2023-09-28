//Дан следующий код, исправьте его там, где требуется
//public static void main(String[] args) throws Exception {
//        try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = { 1, 2 };
//        abc[3] = 9;
//        } catch (Throwable ex) {
//        System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//        System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//        }
//        }
//public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//        }


package seminar2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter A: ");
                int a = Integer.parseInt(scanner.next());
                System.out.print("Enter B: ");
                int b = Integer.parseInt(scanner.next());
                int[] abc = {1, 2};
                System.out.print("Enter array element: ");
                int arrayElement = Integer.parseInt(scanner.next());
                printDivide(a, b);
                printSum(a, b);
                printArrayElement(abc, arrayElement);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Catching exception: " + e + "\nTry again");
            } catch (ArithmeticException ex) {
                System.out.println("Что-то пошло не так...");
            } catch (NullPointerException ex) {
                System.out.println("Указатель не может указывать на null!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера!");
            }
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println("Sum: " + a + b);
    }

    public static void printDivide(Integer a, Integer b) {
        System.out.println("Divide: " + (double) a / (double) b);
    }

    public static void printArrayElement(int[] array, int element) {
        System.out.println("Array element: " + array[element]);
    }

}
