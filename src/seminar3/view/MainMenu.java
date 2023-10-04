package seminar3.view;

import java.util.Scanner;

public class MainMenu {
    Scanner in = new Scanner(System.in);

    public String mainMenu() {

        System.out.println("Введите данные пользователя в формате " +
                "<Фамилия Имя Отчество ДатаРождения НомерТелефона Пол>");
        return in.next();
    }
}
