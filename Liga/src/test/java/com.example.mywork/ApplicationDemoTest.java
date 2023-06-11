package com.example.mywork;

import com.example.mywork.controller.MyController;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.*;

@SpringBootTest
public class ApplicationDemoTest {
    @Mock
    private Set<String> str;
    public String Username;

    @Test
    public void writeToFile(){
        MyController s = mock(MyController.class);
        Mockito.doNothing().when(s).player(Username);
        s.player(Username);
        verify(s, times(1)).player(Username);
    }
    @Test
    public void testSave()throws Exception{
        try {
            str = new HashSet<>();
            str.add("Jeck");
            Username = "Jeck";
            Boolean control = MyController.save(str, "myList.txt", Username);
            assertNotNull(control);
        } catch (FileNotFoundException e){
            fail("File not found");
        }
    }



}
