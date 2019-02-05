package ru.trandefil.tm.command.task;


import ru.trandefil.tm.command.AbstractCommand;
import ru.trandefil.tm.entity.Project;
import ru.trandefil.tm.entity.Task;
import ru.trandefil.tm.api.ServiceLocator;
import ru.trandefil.tm.api.ProjectService;
import ru.trandefil.tm.api.TaskService;
import ru.trandefil.tm.service.TerminalService;

import java.util.Date;

import static ru.trandefil.tm.util.UserInputUtil.getDate;
import static ru.trandefil.tm.util.UserInputUtil.getNotNullString;

public class TaskUpdateCommand extends AbstractCommand {

    public TaskUpdateCommand(ServiceLocator serviceLocator) {
        super(serviceLocator);
    }

    public TaskUpdateCommand() {
    }

    @Override
    public String command() {
        return "task-update";
    }

    @Override
    public String description() {
        return "update a project task";
    }

    @Override
    public void execute() {
        final TerminalService terminalService = getServiceLocator().getTerminalService();
        final String projectName =
                getNotNullString(terminalService, "Enter project name to update task : ");
        final ProjectService projectService = getServiceLocator().getProjectService();
        final Project project = projectService.getByName(projectName);
        if (project == null) {
            System.out.println("Wrong project name.");
            return;
        }
        final String taskName = getNotNullString(terminalService, "Enter task name for update : ");
        final TaskService taskService = getServiceLocator().getTaskService();
        final Task task = taskService.getByName(taskName);
        if (task == null) {
            System.out.println("Wrong task name");
            return;
        }
        final String newName = getNotNullString(terminalService, "Enter new task name : ");
        final String newDescription = getNotNullString(terminalService, "Enter new task description : ");
        final Date beginDate = getDate(terminalService, "begin date");
        Date endDate = null;
        if (beginDate != null) {
            endDate = getDate(terminalService, "end date");
        }
        final Task newTask = new Task(task.getId(), newName, newDescription, beginDate, endDate, project);
        taskService.deleteByName(task.getName());
        taskService.save(newTask);
    }

    @Override
    public boolean secure() {
        return true;
    }

}