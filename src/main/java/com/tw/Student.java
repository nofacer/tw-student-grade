package com.tw;

public class Student {
    public String name;
    public String eyed;
    public int math;
    public int chinese;
    public int english;
    public int computer;

    public Student(String myName, String myId, int myMath, int myChinese, int myEnglish, int myComputer) {
        name=myName;
        eyed=myId;
        math=myMath;
        chinese=myChinese;
        english=myEnglish;
        computer=myComputer;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return eyed;
    }

    public int total(){
        return math+chinese+english+computer;
    }

    public double ave(){
        return total()/4.0;
    }

    public String render(){
        return name+"|"+math+"|"+chinese+"|"+english+"|"+computer+"|"+ave()+"|"+total()+"\n";
    }

    public boolean compare(Student anotherStudent){
        if(eyed==anotherStudent.eyed){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean totallySame(Student anotherStudent){
        if(name.equals(anotherStudent.name) && eyed.equals(anotherStudent.eyed) && math==anotherStudent.math && chinese==anotherStudent.chinese && english==anotherStudent.english && computer==anotherStudent.computer){
            return true;
        }
        else{
            return false;
        }

    }

}