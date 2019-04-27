package com.tw;

import java.util.ArrayList;
import java.util.Scanner;

public class GUI {

    public static void main(String[] args) {
        Render render = new Render();
        Scanner sc = new Scanner(System.in);
        Input inputCheck = new Input();
        Klass klass = new Klass();
        while(true){
        System.out.println(render.renderMenu());
        String selection = sc.nextLine();
        if (selection.equals("1")) {
            System.out.println(render.renderFirstMenu());
            while (true) {
                String studentInfo = sc.nextLine();
                Student newStudent = inputCheck.addStudent(studentInfo);
                if (newStudent != null) {
                    klass.addOneStudent(newStudent);
                    System.out.println(render.renderFirstSuccessMessage(newStudent.name));
                    break;
                } else {
                    System.out.println(render.renderFirstErrorMessage());
                }
            }
        } else if (selection.equals("2")) {
            System.out.println(render.renderSecondMenu());
            while(true){
            String studentIds = sc.nextLine();
            ArrayList<Student> printStudent = inputCheck.printStudent(studentIds, klass);
            if (printStudent != null) {
                System.out.println(render.renderTable(klass, printStudent));
                break;
            } else {
                System.out.println(render.renderSecondErrorMessage());
            }
        }
        }
        else if(selection.equals("3")){
            break;
        }
    }

    }

}