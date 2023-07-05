package org.task3.view.template.impl;

import org.task3.exception.InputDataFormatException;
import org.task3.exception.InvalidNameException;
import org.task3.view.template.Template;
import java.util.Optional;
import java.util.regex.Pattern;

public class AddContactTemplate implements Template {
    @Override
    public void output() {
        ui.output("\nAdd contact\n");

        while (true){
            Optional<String> contact = ui.input("Enter the last name, first name, patronymic, phone number " +
                "\nseparated by a space or enter an empty string to cancel: \n", String::toString);

            if(contact.isEmpty()){
                ui.output("\nCancelled\n");
                return;
            }

            try {
                isContactValid(contact.get());
            } catch (InputDataFormatException | InvalidNameException e) {
                ui.output("\n" + e.getMessage() + "\n");
                continue;
            }

            break;
        }



        ui.pressEnterToContinue();
    }

    private static boolean isContactValid(String contact) throws InputDataFormatException, InvalidNameException {
        String[] data = contact.split(" ");

        int checkDataFormat = checkDataFormat(data.length);

        if (checkDataFormat == -1){
            throw new InputDataFormatException("Not enough data, try again");
        }

        if (checkDataFormat == -2){
            throw new InputDataFormatException("More data entered than required, try again");
        }


        Pattern pattern = Pattern.compile("^[A-Za-zА-Яа-я]{2,20}$");

        if(!pattern.matcher(data[0]).matches()){
            throw new InvalidNameException("Surname error, try again");
        }

        if(!pattern.matcher(data[1]).matches()){
            throw new InvalidNameException("Name error, try again");
        }

        if(!pattern.matcher(data[2]).matches()){
            throw new InvalidNameException("Patronymic error, try again");
        }

        return true;

    }

    //Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки
    private static int checkDataFormat(long fieldsNumber){
        if(fieldsNumber < 4){
            return -1;
        }

        if(fieldsNumber > 4){
            return -2;
        }

        return 0;
    }
}
