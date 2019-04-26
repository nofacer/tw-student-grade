package com.tw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RenderTest {
    private Render renderObj;

    @Before
    public void setUp() throws Exception {
        renderObj = new Render();
    }

    @Test
    public void should_return_menu_string() throws Exception {
        String result = renderObj.renderMenu();
        String expectedResult = "1. 添加学生\n" +
                                "2. 生成成绩单\n" +
                                "3. 退出\n" +
                                "请输入你的选择（1～3）：";

        assertEquals(expectedResult, result);
    }

    
}