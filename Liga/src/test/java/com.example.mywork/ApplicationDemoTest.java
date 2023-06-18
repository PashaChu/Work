package com.example.mywork;

import com.example.mywork.controller.AjaxController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.io.*;

@SpringBootTest
public class ApplicationDemoTest {

    @Mock
    private AjaxController control;

    @Test
    public void readToFile() {
        Mockito.when(control.getFile()).thenCallRealMethod();
        Mockito.doCallRealMethod().when(control).setFile("testFile");
        control.setFile("testFile");
        File file = control.getFile();
        Assertions.assertNotNull(file);
        Mockito.when(control.list("TestName")).thenCallRealMethod();
        ResponseEntity<?> answer = control.list("TestName");
        Assertions.assertEquals(200, answer.getStatusCodeValue());
    }
}