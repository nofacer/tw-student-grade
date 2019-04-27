package com.tw;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {

    public Student addStudent(String s) {

        String inputFormat = "([\\u4E00-\\u9FA5]+),\\s*(\\d{3}),\\s*([\\u4E00-\\u9FA5]{2}\\:\\s*(\\d{1,3}),?\\s*){4}";
        String gradeFormat = "([\\u4E00-\\u9FA5]{2})\\:\\s*(\\d{1,3}),?\\s*";
        Pattern inputPattern = Pattern.compile(inputFormat);
        Pattern gradePattern = Pattern.compile(gradeFormat);

        Matcher m = inputPattern.matcher(s);
        if (!m.matches()) {
            return null;
        }

        String name = m.group(1);
        String eyed = m.group(2);

        int math = 0;
        int chinese = 0;
        int english = 0;
        int computer = 0;

        m = gradePattern.matcher(s);

        while (m.find()) {
            switch (m.group(1)) {
            case "数学":
                math = Integer.parseInt(m.group(2));
                break;

            case "语文":
                chinese = Integer.parseInt(m.group(2));
                break;

            case "英语":
                english = Integer.parseInt(m.group(2));
                break;

            case "编程":
                computer = Integer.parseInt(m.group(2));
                break;
            }
        }
        if (math * chinese * english * computer == 0) {
            return null;
        }

        return new Student(name, eyed, math, chinese, english, computer);
    }

    public ArrayList<Student> printStudent(String s, Klass klass) {
        String idListFormat = "((\\d{3}),?\\s*)+";
        String idFormat = "(\\d{3}),?\\s*";
        Pattern idListPattern = Pattern.compile(idListFormat);
        Pattern idPattern = Pattern.compile(idFormat);

        Matcher m = idListPattern.matcher(s);
        if (!m.matches()) {
            return null;
        }
        

        ArrayList<Student> chosenStudents=new ArrayList<Student>();
        m = idPattern.matcher(s);
        while (m.find()) {
            String curId=m.group(1);
            for (Student student : klass.allStudents){
                if(curId.equals(student.eyed)){
                    chosenStudents.add(student);
                }
            }
        }
        return chosenStudents;

    }
}