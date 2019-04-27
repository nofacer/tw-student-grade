package com.tw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() throws Exception {
        student = new Student("Tom", "123", 85, 80, 70, 90);
    }

    @Test
    public void should_return_name() throws Exception {
        String result = student.getName();
        String expectedResult = "Tom";

        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_id() throws Exception {
        String result = student.getId();
        String expectedResult = "123";

        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_total_grade() throws Exception {
        int result = student.total();
        int expectedResult = 325;

        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_average_grade() throws Exception {
        double result = student.ave();
        double expectedResult = 81.25;

        assertEquals(expectedResult, result, 0.01);
    }

    @Test
    public void should_render_grade() throws Exception {
        String result = student.render();
        String expectedResult = "Tom|85|80|70|90|81.25|325";

        assertEquals(expectedResult, result);
    }
}