package com.tw;

public class Render {

    public String renderMenu() {
        return "1. 添加学生\n" +
        "2. 生成成绩单\n" +
        "3. 退出\n" +
        "请输入你的选择（1～3）：";
    }

    public String renderFirstMenu(){
        return  "请输入学生信息（格式：姓名, 学号, 学科: 成绩, ...），按回车提交：";
    }

    public String renderFirstErrorMessage(){
        return "请按正确的格式输入（格式：姓名, 学号, 学科: 成绩, ...）：";
    }

    public String renderFirstSuccessMessage(String studentName){
        return "学生"+studentName+"的成绩被添加";
    }

    public String renderSecondMenu(){
        return  "请输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：";
    }

    public String renderSecondErrorMessage(){
        return "请按正确的格式输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：";
    }

    public String renderTable(Klass klass){
        String studentGrade="";
        for(Student student:klass.allStudents){
            studentGrade+=student.render();
        }

        return "成绩单\n"+
        "姓名|数学|语文|英语|编程|平均分|总分\n"+
        "========================\n"+
        studentGrade+
        "========================\n"+
        "全班总分平均数："+klass.ave()+"\n"+
        "全班总分中位数："+klass.median()+"\n";

    }
}