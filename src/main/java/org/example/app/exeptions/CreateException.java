package org.example.app.exeptions;

import java.util.HashMap;
import java.util.Map;

public class CreateException extends RuntimeException {

    Map<String, String> errors;

    public CreateException(String message, Map<String, String> errors) {
        super(message);
        this.errors = errors;
    }

    public String getErrors(Map<String, String> errors) {
        this.errors = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        errors.forEach((key, value) ->
                stringBuilder.append("\n\u2757  ")
                        .append(key)
                        .append(": ")
                        .append(value)

        );
        return stringBuilder.toString();
    }
}
