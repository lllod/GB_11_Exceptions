package seminar3.view;

import seminar3.exceptions.PersonDataException;
import java.util.Scanner;

public class MainMenu {
    public void displayMessage(String message) throws PersonDataException {
        System.out.println(message);
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
