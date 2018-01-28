package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When

        board.doneList.addTask("Zadanko nr1");
       // board.toDoList.addTask("Zadanko do zrobienia");
        board.inProgressList.addTask("Zadanko ciężkie");

        //Then

        System.out.println("Wykonano zadań: " + board.doneList.getTasks().size());
        System.out.println("Wykonano zadanie: " + board.doneList.getTasks().get(0));
        System.out.println("Do zrobienia: " + board.toDoList.getTasks().size());
        System.out.println("W trakcie zadań: " + board.inProgressList.getTasks().size());
        System.out.println("W trakcie zadania: " + board.inProgressList.getTasks().get(0));
    }
}
