package org.example.app.utils;

public class Constants {

    public final static String DB_DRIVER = "jdbc:sqlite:";
    public final static String DB_BASE_URL = "src/main/resources/database/";
    public final static String DB_NAME = "users_db.db";
    public final static String TABLE_USERS = "users";
    public final static String DB_ABSENT_MSG = "\n\u2757 База даних відсутня";
    public final static String DATA_ABSENT_MSG = "\n\u2757 Дані відсутні";
    public final static String DATA_INSERT_MSG = "\n\u2705  Створено";
    public final static String DATA_UPDATE_MSG = "\n\u2705  Оновлено";
    public final static String DATA_DELETE_MSG = "\n\u2705  Видалено";
    public final static String APP_CLOSE_MSG = "\n\u2705  Додоток закрито";
    public final static String INPUT_REQ_MSG = " \u2757  Потрібно введення";
    public final static String INCORRECT_VALUE_MSG = "\u2757  Некоректне значення  \u2757  Спробуйте знов  \u2757";

    public final static String PHONE_RGX = "[0-9]{3}[\\ ][0-9]{3}-[0-9]{4}";
    public final static String WRONG_PHONE_MSG = "\u2757  Невірний формат номеру телефону";

    public final static String EMAIL_RGX = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    public final static String WRONG_EMAIL_MSG = "\u2757  Невірний формат електронної пошти";

    public final static String ID_RGX = "[0-9]";
    public final static String WRONG_ID_MSG = "\u2757  Невірне значення ID";
    public final static String ID_NO_EXISTS_MSG = "\u2757  Відсутнє вказане ID";

    public final static String LOG_DB_ABSENT_MSG = "\u2757 База даних відсутня";
    public final static String LOG_DATA_INPTS_WRONG_MSG = " \u2757 Некорректні дані";
    public final static String LOG_DATA_ABSENT_MSG = "\u2757 Відсутні дані";
    public final static String LOG_DB_ERROR_MSG = "\u2757  Помилка маніпуляцій з базою даних";
}
