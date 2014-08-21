package com.epam.ae.action;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {
    private final static Map<String, Action> actions = new HashMap<>();

    static {
        actions.put("login", new LoginAction());
        actions.put("registration", new RegistrationAction());
    }

    public static Action getAction(String actionName) {
        return actions.get(actionName);
    }
}

