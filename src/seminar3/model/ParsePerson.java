package seminar3.model;

import seminar3.exceptions.PersonDataException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ParsePerson {
    public void saveUserData(String surname, String name, String patronymic,
                             String birthday, long phoneNumber, char gender) throws PersonDataException {
        if (!isValidData(birthday, phoneNumber, gender)) {
            throw new PersonDataException("Ошибка: неверный формат данных");
        }

        String fileName = surname + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("<" + surname + "> <" + name + "> <" + patronymic + "> <" + birthday + "> <" + phoneNumber
                    + "> <" + gender + ">");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isValidData(String birthday, long phoneNumber, char gender) {
        if (!birthday.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            return false;
        }

        if (gender != 'f' && gender != 'm') {
            return false;
        }

        return phoneNumber > 0;
    }

}
