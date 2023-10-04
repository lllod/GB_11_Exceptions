package seminar3.controller;

import seminar3.view.MainMenu;
import seminar3.model.ParsePerson;

public class Controller {

    public void run() {
        MainMenu mainMenu = new MainMenu();
        String userData = mainMenu.mainMenu();
        ParsePerson parsePerson = new ParsePerson();
        String[] userDataArray = userData.split(" ");
    }
}
