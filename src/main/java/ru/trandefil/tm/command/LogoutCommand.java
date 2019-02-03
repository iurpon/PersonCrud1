package ru.trandefil.tm.command;

import ru.trandefil.tm.api.ServiceLocator;

public class LogoutCommand extends AbstractCommand {

    public LogoutCommand(ServiceLocator serviceLocator) {
        super(serviceLocator);
    }

    @Override
    public String command() {
        return "logout";
    }

    @Override
    public String description() {
        return "logout user from system.";
    }

    @Override
    public void execute() {
        serviceLocator.setLoggedUser(null);
    }

    @Override
    public boolean secure() {
        return false;
    }

}