package com.tw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;


public class RenderTest {
    private Render renderObj;

    @Before
    public void setUp() throws Exception {
        renderObj = new Render();
    }

    @Test
    public void should_return_menu_string() throws Exception {
        String result = renderObj.renderMenu();
        String expectedResult = "1. 添加学生\n" + "2. 生成成绩单\n" + "3. 退出\n" + "请输入你的选择（1～3）：";

        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_first_menu_detail() throws Exception {
        String result = renderObj.renderFirstMenu();
        String expectedResult = "请输入学生信息（格式：姓名, 学号, 学科: 成绩, ...），按回车提交：";

        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_error_message_if_first_menu_input_is_wrong() throws Exception {
        String result = renderObj.renderFirstErrorMessage();
        String expectedResult = "请按正确的格式输入（格式：姓名, 学号, 学科: 成绩, ...）：";

        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_success_message_if_first_menu_input_is_right() throws Exception {
        String result = renderObj.renderFirstSuccessMessage("Tom");
        String expectedResult = "学生Tom的成绩被添加";

        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_second_menu_detail() throws Exception {
        String result = renderObj.renderSecondMenu();
        String expectedResult = "请输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：";

        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_error_message_if_second_menu_input_is_wrong() throws Exception {
        String result = renderObj.renderSecondErrorMessage();
        String expectedResult = "请按正确的格式输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：";

        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_grade_table() throws Exception {
        Student student1=new Student("张三", "001", 75, 95, 80, 80);
        Student student2=new Student("李四", "002", 85, 80, 70, 90);
        Klass klass =new Klass();
        klass.addOneStudent(student1);
        klass.addOneStudent(student2);
        String result = renderObj.renderTable(klass);
        String expectedResult = "成绩单\n"+
        "姓名|数学|语文|英语|编程|平均分|总分\n"+
        "========================\n"+
        "张三|75|95|80|80|82.5|330\n"+
        "李四|85|80|70|90|81.25|325\n"+
        "========================\n"+
        "全班总分平均数：327.5\n"+
        "全班总分中位数：327.5\n";

        assertEquals(expectedResult, result);
    }

}