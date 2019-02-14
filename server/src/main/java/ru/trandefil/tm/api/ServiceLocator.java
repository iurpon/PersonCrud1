package ru.trandefil.tm.api;

public interface ServiceLocator {

    ProjectService getProjectService();

    TaskService getTaskService();

    UserService getUserService();

    SessionService getSessionService();

    ConnectionService getConnectionService();

}
