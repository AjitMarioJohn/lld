package org.example.lld.commons;

import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public class GameUtils {

    public static final String UNDO = "Undo";

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

}
