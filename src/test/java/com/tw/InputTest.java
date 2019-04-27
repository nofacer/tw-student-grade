package com.tw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class InputTest {
    private Input inputOperation;

    @Before
    public void setUp() throws Exception {
        inputOperation = new Input();
    }

    @Test
    public void task1_should_return_null_if_input_format_is_wrong() throws Exception {
        Student result = inputOperation.addStudent("Tom,数学:1");
        Student expectedResult = null;

        assertEquals(expectedResult, result);
    }

    @Test
    public void task1_should_return_null_if_subject_is_wrong() throws Exception {
        Student result = inputOperation.addStudent("张三, 001, 数学: 80, 数学: 90, 英语: 70, 编程: 80");
        Student expectedResult = null;

        assertEquals(expectedResult, result);
    }

    @Test
    public void task1_should_return_student_object_if_everything_is_fine() throws Exception {
        Student student1 = inputOperation.addStudent("张三, 001, 数学: 80, 语文: 90, 英语: 70, 编程: 80");
        Student student2 = new Student("张三", "001", 80, 90, 70, 80);
        boolean result = student1.totallySame(student2);
        boolean expectedResult = true;

        assertEquals(expectedResult, result);
    }

    @Test
    public void task2_should_return_null_if_format_is_wrong() throws Exception {
        Student student1 = new Student("张三", "001", 75, 95, 80, 80);
        Student student2 = new Student("李四", "002", 85, 80, 70, 90);
        Klass klass = new Klass();
        klass.addOneStudent(student1);
        klass.addOneStudent(student2);

        ArrayList<Student> result = inputOperation.printStudent("001, 002, asd", klass);
        Student expectedResult = null;

        assertEquals(expectedResult, result);
    }

    @Test
    public void task2_should_return_student_list_if_format_is_right() throws Exception {
        Student student1 = new Student("张三", "001", 75, 95, 80, 80);
        Student student2 = new Student("李四", "002", 85, 80, 70, 90);
        Klass klass = new Klass();
        klass.addOneStudent(student1);
        klass.addOneStudent(student2);

        ArrayList<Student> studentList = inputOperation.printStudent("001, 002", klass);
        int expectedResult = 2;
        int result = studentList.size();

        assertEquals(expectedResult, result);
    }
}