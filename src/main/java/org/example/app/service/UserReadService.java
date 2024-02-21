package org.example.app.service;

import org.example.app.database.DBCheck;
import org.example.app.entity.User;
import org.example.app.exeptions.DBException;
import org.example.app.repository.UserReadRepository;
import org.example.app.utils.Constants;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserReadService {

    UserReadRepository repository;
    private static final Logger LOGGER =
            Logger.getLogger( UserReadService.class.getName());

    public  UserReadService( UserReadRepository repository) {
        this.repository = repository;
    }

    public String readUser() {
        if (DBCheck.isDBExists()) {
            try {
                throw new DBException(Constants.DB_ABSENT_MSG);
            } catch (DBException e) {
                LOGGER.log(Level.SEVERE, Constants.LOG_DB_ABSENT_MSG);
                return e.getMessage();
            }
        }

        List<User> users = repository.readUser();

        if (users != null) {
            if (!users.isEmpty()) {
                AtomicInteger count = new AtomicInteger(0);
                StringBuilder stringBuilder = new StringBuilder();
                users.forEach((user) ->
                        stringBuilder.append(count.incrementAndGet())
                                .append(") ID ")
                                .append(user.getId())
                                .append("\n   Ім'я: ")
                                .append(user.getName())
                                .append("\n   Засоби зв'язку:")
                                .append("\n   ")
                                .append(user.getPhone())
                                .append("\n   ")
                                .append(user.getEmail())
                                .append("\n\n")
                );
                return stringBuilder.toString();
            } else {
                LOGGER.log(Level.WARNING, Constants.LOG_DATA_ABSENT_MSG);
                return Constants.DATA_ABSENT_MSG;
            }
        } else {
            LOGGER.log(Level.WARNING, Constants.LOG_DATA_ABSENT_MSG);
            return Constants.DATA_ABSENT_MSG;
        }
    }
}
