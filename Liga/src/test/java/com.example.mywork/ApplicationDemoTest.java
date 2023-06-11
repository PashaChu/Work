package com.example.mywork;

import com.example.mywork.controller.MyController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.io.*;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.*;

@SpringBootTest
public class ApplicationDemoTest {
    @Mock
    private ObjectMapper objectMapper;

    @Test
    public void writeToFile(){
        try {
            Set<String>  str = new HashSet<>();
            Path dataPath = Files.createTempFile("data", "json");
            Mockito.doNothing().when(objectMapper).writeValue(any(File.class), any(MyController.class));
            Mockito.verify(objectMapper, Mockito.times(0)).writeValue((dataPath).toFile(), MyController.save(str, "myList.txt", "TestName"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
