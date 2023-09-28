// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package seminar2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String userEnter = scanner.nextLine();
        if (userEnter.isEmpty()) {
            throw new IllegalArgumentException("Empty lines cannot be entered!");
        } else {
        System.out.println(userEnter);
        }
    }
}
