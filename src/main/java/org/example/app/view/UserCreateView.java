package org.example.app.view;

import java.util.Scanner;

public class UserCreateView {

    public String[] getData() {

        Scanner scanner = new Scanner(System.in);

        String title = "Ведіть ім'я: ";
        System.out.print(title);
        String name = scanner.nextLine().trim();

        title = "Введіть номер телефону у форматі xxx xxx-xxxx: ";
        System.out.print(title);
        String phone = scanner.nextLine().trim();

        title = "Введіть електронну пошту у форматі example@mail.com: ";
        System.out.print(title);
        String email = scanner.nextLine().trim();

        return new String[]{name, phone, email};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
