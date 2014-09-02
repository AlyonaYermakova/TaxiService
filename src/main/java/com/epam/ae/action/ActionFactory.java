package com.epam.ae.action;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {
    private final static Map<String, Action> actions = new HashMap<>();

    static {
        actions.put("GET/", new ShowPageAction("index"));
        actions.put("GET/index", new ShowPageAction("index"));

        actions.put("GET/login", new ShowPageAction("login"));
        actions.put("POST/login", new LogInAction());

        actions.put("GET/home", new ShowPageAction("home"));

        actions.put("GET/successRegister", new ShowPageAction("successRegister"));

        actions.put("GET/logout", new ShowPageAction("index"));

        actions.put("GET/successOrder", new ShowPageAction("index"));

        actions.put("GET/register", new ShowPageAction("register"));
        actions.put("POST/register", new RegistrationAction());

        actions.put("GET/makeOrder", new ShowPageAction("makeOrder"));
        actions.put("POST/makeOrder", new MakeOrderAction());

        actions.put("GET/test", new ShowPageAction("test"));
    }

    public static Action getAction(String actionName) {
        return actions.get(actionName);
    }
}

