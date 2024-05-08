import java.util.*;

public class Student {
    private String name;
    private boolean present;
    private String grade;
    private  String gmail;



    public Student(String name){
        this.name = name;
        this.present = false;
        this.grade = grade;
        this.gmail = gmail;
    }
    public String getName(){
        return name;
    }
    public boolean isPresent(){
        return present;
    }
    public String getGrade(){return grade; }
    public String getGmail(){return gmail; }
    public void setPresent(boolean present){
        this.present= present;
    }


}
