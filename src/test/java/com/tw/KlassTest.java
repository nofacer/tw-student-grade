package com.tw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KlassTest {
    private Klass klass;

    @Before
    public void setUp() throws Exception {
        klass = new Klass();
        Student student = new Student("Tom", "123", 85, 80, 70, 90);
        klass.allStudents.add(student);
    }

    @Test
    public void should_return_false_if_new_student_already_in_list() throws Exception {
        Student newStudent = new Student("Tom", "123", 85, 80, 70, 90);
        boolean result = klass.check(newStudent);
        boolean expectedResult = false;
        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_true_if_new_student_not_in_list() throws Exception {
        Student newStudent = new Student("Jerry", "234", 85, 80, 70, 90);
        boolean result = klass.check(newStudent);
        boolean expectedResult = true;
        assertEquals(expectedResult, result);
    }

    @Test
    public void should_not_add_if_new_student_already_in_list() throws Exception {
        Student newStudent = new Student("Jerry", "123", 85, 80, 70, 90);
        klass.addOneStudent(newStudent);
        int result=klass.allStudents.size();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

    @Test
    public void should_add_if_new_student_not_in_list() throws Exception {
        Student newStudent = new Student("Jerry", "234", 75, 95, 80, 80);
        klass.addOneStudent(newStudent);
        int result=klass.allStudents.size();
        int expectedResult = 2;
        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_average_grade_of_class() throws Exception {
        Student newStudent = new Student("Jerry", "234", 75, 95, 80, 80);
        klass.addOneStudent(newStudent);
        double result=klass.ave();
        double expectedResult = 327.5;
        assertEquals(expectedResult, result,0.01);
    }

    @Test
    public void should_return_median_grade_of_class() throws Exception {
        Student newStudent = new Student("Jerry", "234", 75, 95, 80, 80);
        klass.addOneStudent(newStudent);
        double result=klass.median();
        double expectedResult = 327.5;
        assertEquals(expectedResult, result,0.01);
    }
}