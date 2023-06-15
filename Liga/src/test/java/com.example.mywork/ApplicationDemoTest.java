package com.example.mywork;

import com.example.mywork.controller.AjaxController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.*;

@SpringBootTest
public class ApplicationDemoTest {

    @Test
    public void readToFile() {
        AjaxController control = Mockito.mock(AjaxController.class);
        Mockito.when(control.setFile()).thenReturn(new File("myList.txt"));
        File file = control.setFile();
        Assertions.assertNotNull(file);
        Mockito.when(control.list("TestName")).thenReturn(new ResponseEntity<>(HttpStatus.OK));
        ResponseEntity<?> answer = control.list("TestName");
        Assertions.assertEquals(200, answer.getStatusCodeValue());
    }
}
