package com.tw;

import java.util.ArrayList;
import java.util.Collections;

public class Klass {
    public ArrayList<Student> allStudents = new ArrayList<Student>();

    public boolean check(Student student) {
        for (Student existStudent : allStudents) {
            if (student.compare(existStudent)) {
                return false;
            }
        }
        return true;
    }

    public void addOneStudent(Student student) {
        if (check(student)) {
            allStudents.add(student);
        }
    }

    public double ave() {
        int sumGrade = 0;
        for (Student student : allStudents) {
            sumGrade += student.total();
        }
        return (double) sumGrade / allStudents.size();
    }

    public double median(){
        ArrayList<Integer> gradeList=new ArrayList<Integer>();
        for (Student student : allStudents) {
            gradeList.add(student.total());
        }
        Collections.sort(gradeList);

        int length=gradeList.size();
        if (length%2==0){
            return (double)(gradeList.get(length/2-1)+gradeList.get(length/2))/2;
        }
        else{
            return (double)gradeList.get(length/2);
        }

        
    }
}