package seminar3.controller;

import seminar3.exceptions.PersonDataException;
import seminar3.model.ParsePerson;
import seminar3.view.MainMenu;


public class Controller {
    private final ParsePerson parsePerson = new ParsePerson();
    private final MainMenu mainMenu = new MainMenu();

    public Controller() {
    }

    public void collectUserData() throws PersonDataException {
        try {
            mainMenu.displayMessage("Введите данные через пробел (Фамилия Имя Отчество Дата_рождения " +
                    "Номер_телефона Пол(f или m):");
            String input = mainMenu.getInput();
            String[] data = input.split(" ");

            if (data.length != 6) {
                mainMenu.displayMessage("Ошибка: неверное количество данных");
                return;
            }

            String surname = data[0];
            String name = data[1];
            String patronymic = data[2];
            String birthday = data[3];
            long phoneNumber = Long.parseLong(data[4]);
            char gender = data[5].charAt(0);

            parsePerson.saveUserData(surname, name, patronymic, birthday, phoneNumber, gender);
            mainMenu.displayMessage("Данные успешно записаны.");
        } catch (NumberFormatException e) {
            mainMenu.displayMessage("Ошибка: неверный формат номера телефона");
            e.printStackTrace();
        } catch (PersonDataException e) {
            mainMenu.displayMessage(e.getMessage());
            e.printStackTrace();
        }
    }
}
