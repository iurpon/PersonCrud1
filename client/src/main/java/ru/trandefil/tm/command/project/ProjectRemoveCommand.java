package ru.trandefil.tm.command.project;

import ru.trandefil.tm.api.ProjectService;
import ru.trandefil.tm.api.ServiceLocator;
import ru.trandefil.tm.command.AbstractCommand;
import ru.trandefil.tm.entity.Project;
import ru.trandefil.tm.service.TerminalService;

import static ru.trandefil.tm.util.UserInputUtil.getNotNullString;

public class ProjectRemoveCommand extends AbstractCommand {

    public ProjectRemoveCommand(ServiceLocator serviceLocator) {
        super(serviceLocator);
    }

    public ProjectRemoveCommand() {
    }

    @Override
    public String command() {
        return "project-remove";
    }

    @Override
    public String description() {
        return "remove project";
    }

    @Override
    public void execute() {
        final TerminalService terminalService = getServiceLocator().getTerminalService();
        final String projectName = getNotNullString(terminalService,
                "Plz enter project name you want to delete : ");
        final ProjectService projectService = getServiceLocator().getProjectService();
        final Project project = projectService.getById(projectName);
        if (!project.getUser().equals(getServiceLocator().getLoggedUser())) {
            System.out.println("have no permition to delete this project.");
            return;
        }
        projectService.deleteByName(projectName);
    }

    @Override
    public boolean secure() {
        return true;
    }

}