package ru.trandefil.tm.command.user;

import ru.trandefil.tm.api.ServiceLocator;
import ru.trandefil.tm.command.AbstractCommand;
import ru.trandefil.tm.generated.Role;
import ru.trandefil.tm.generated.Session;
import ru.trandefil.tm.generated.UserDTO;
import ru.trandefil.tm.generated.UserEndPoint;
import ru.trandefil.tm.service.TerminalService;

import static ru.trandefil.tm.util.UserInputUtil.getNotNullString;

public class UserUpdateCommand extends AbstractCommand {

    public UserUpdateCommand(ServiceLocator serviceLocator) {
        super(serviceLocator);
    }

    public UserUpdateCommand() {
    }

    @Override
    public String command() {
        return "user-update";
    }

    @Override
    public String description() {
        return "update user";
    }

    @Override
    public void execute() {
        final UserEndPoint userEndPoint = getServiceLocator().getUserEndPoint();
        final Session session = getServiceLocator().getSession();
        final TerminalService terminalService = getServiceLocator().getTerminalService();
        final String userName = getNotNullString(terminalService, "enter user name to update");
        final UserDTO updating = userEndPoint.getUserByName(userName, session);
        if (updating == null) {
            System.out.println("Wrong user name.");
            return;
        }
        String newPass = null;
        if (updating.getId().equals(session.getUserId())) {
            final String newName = getNotNullString(terminalService, "enter new name");
            newPass = getNotNullString(terminalService, "enter new pass");
            updating.setName(newName);
        }
        if (session.getRole().equals(Role.ADMIN)) {
            String role = getNotNullString(terminalService, "enter Role(ADMIN/USER)");
            role = role.trim().toUpperCase();
            if (!role.equals("ADMIN") && !role.equals("USER")) {
                System.out.println("bad role.");
                return;
            }
            updating.setRole(Enum.valueOf(Role.class, role));
        }
        UserDTO updated = userEndPoint.updateUser(updating, newPass == null ? "" : newPass, session);
        if (updated == null) {
            System.out.println("bad updating.");
            return;
        }
        System.out.println("update succesfull.");

    }

    @Override
    public boolean secure() {
        return true;
    }

    @Override
    public boolean isAdmin() {
        return true;
    }

}
