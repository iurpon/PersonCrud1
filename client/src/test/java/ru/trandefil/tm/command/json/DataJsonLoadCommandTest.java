package ru.trandefil.tm.command.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import ru.trandefil.tm.command.Domain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataJsonLoadCommandTest {

    @Test
    public void execute() throws IOException {

            String xmlString = new String(Files.readAllBytes(Paths.get("data.json")));
            ObjectMapper objectMapper = new ObjectMapper();
            Domain objectFactory = objectMapper.readValue(xmlString, Domain.class);
            objectFactory.getProjectList().forEach(System.out::println);
//        objectFactory.getTaskList().forEach(System.out::println);
            objectFactory.getUserList().forEach(System.out::println);
    }
}