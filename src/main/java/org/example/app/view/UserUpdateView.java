package org.example.app.view;

import java.util.Scanner;

public class UserUpdateView {

    public String[] getData() {

        Scanner scanner = new Scanner(System.in);

        String title = "Введіть ID користувача: ";
        System.out.print(title);
        String id = scanner.nextLine().trim();

        title = "Введіть оновлений номер телефону у форматі example@mail.com:  xxx xxx-xxxx: ";
        System.out.print(title);
        String phone = scanner.nextLine().trim();

        title = "Введіть оновлену електронну адресу у форматі example@mail.com: ";
        System.out.print(title);
        String email = scanner.nextLine().trim();

        return new String[]{id, phone, email};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
