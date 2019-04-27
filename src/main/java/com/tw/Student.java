package com.tw;

public class Student {
    private String name;
    private String eyed;
    private int math;
    private int chinese;
    private int english;
    private int computer;

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

}