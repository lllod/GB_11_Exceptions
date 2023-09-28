// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
// значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
// запросить у пользователя ввод данных.

package seminar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(enterFloat());
    }

    public static float enterFloat() {
        while (true) {
            System.out.print("Enter a floating point number: ");
            try {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Error!");
            }
        }
    }
}
