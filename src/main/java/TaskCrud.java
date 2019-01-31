import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class TaskCrud {

    public static void taskProcess(String[] choice, BufferedReader reader) throws IOException {
        int choiceSize = choice.length;
        if(choiceSize < 2 ){
            badCommand();
        }else{
            String secondStep = choice[1].toLowerCase().trim();
            switch (secondStep){
                case "list" :  taskList(reader);break;
                case "update" : taskUpdate(reader);break;
                case "create" : taskCreate(reader);break;
                case "delete" : taskDelete(reader);break;
                default: badCommand();
            }
        }
    }

    private static void taskUpdate(BufferedReader reader) throws IOException {
        System.out.println("You are trying to update project tasks");
        Project project = getProject(reader);
        String taskName = getNotNullString("name",reader);
        Task task = AppRun.tasks.get(taskName);
        String name = getNotNullString("new name",reader);
        String description = getNotNullString("new description",reader);
        Date start = getDate(reader,"new start");
        Date end = getDate(reader,"new end");
        Task newTask = new Task(task.getId(),name,description,start,end,project);
        AppRun.tasks.remove(task);
        AppRun.tasks.put(newTask.getName(),newTask);

    }

    private static void taskDelete(BufferedReader reader) throws IOException {
        System.out.println("You are trying to delete project tasks");
        Project project = getProject(reader);
        String taskName = getNotNullString("name",reader);
        AppRun.tasks.remove(taskName);
    }

    private static void taskCreate(BufferedReader reader) throws IOException {
        System.out.println("You are trying to create project tasks");
        Project project = getProject(reader);
        Task task = getTask(reader,project);
        AppRun.tasks.put(task.getName(),task);

    }

    private static Task getTask(BufferedReader reader,Project project) throws IOException {

        String name = getNotNullString("name",reader);
        String description = getNotNullString("description",reader);
        Date start = getDate(reader,"start");
        Date end = getDate(reader,"end");
        Task task = new Task(UUID.randomUUID().toString(),name,description,start,end,project);
        return   task;

    }

    private static Date getDate(BufferedReader reader,String str) throws IOException {
        System.out.format("Enter the %s date with format dd-MM-yyyy : ",str);
        boolean correctDate = false;
        Date date = null;
        while (!correctDate){

            String dateString = reader.readLine();
            if(dateString.isEmpty()){
                return null;
            }else{
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                try {
                    date = formatter.parse(dateString);
                    correctDate = true;
                } catch (ParseException e) {
                    System.out.println("Incorrect date format");
                }
            }
        }
        return date;
    }

    private static String getNotNullString(String requestedStringName, BufferedReader reader) throws IOException {
        System.out.format("Enter Task %s : ",requestedStringName);
        boolean notNull = false;
        String requestString = null;
        while (!notNull){
            requestString = reader.readLine();
            if(requestString.isEmpty()){
                System.out.println("String must be not empty");
            }else{
                notNull = true;
            }
        }
        return requestString;
    }

    private static Project getProject(BufferedReader reader) throws IOException {
        boolean correctName = false;
        Project project = null;
        while(!correctName){
            System.out.print("Enter correct project name : ");
            String projectName = reader.readLine();
            if(projectName.isEmpty()){
                badCommand();
                continue;
            }
            project = AppRun.projects.get(projectName);
            if(project == null){
                badCommand();
                continue;
            }else{
                correctName = true;
            }
        }
        return project;
    }

    private static void taskList(BufferedReader reader) throws IOException {
        Project project = getProject(reader);
        List<Task> collect = AppRun.tasks.values().stream()
                .filter(t -> t.getProject().equals(project))
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    private static void badCommand(){
        System.out.println("Bad command");
    }
}
