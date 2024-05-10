import java.util.*;

public class Student {
    private String name;
    private boolean present;
    private String grade;
    private  String gmail;
    private String phone;
    private String dob;


    public Student(String name){
        this.name = name;
        this.present = false;
        this.grade = grade;
        this.gmail = gmail;
        this.phone = phone;
        this.dob   = dob;
    }
    public String getName(){
        return name;
    }
    public boolean isPresent(){
        return present;
    }
    public String getGrade(){return grade; }
    public String getGmail(){return gmail; }
    public String getPhone(){return phone; }
    public void setPresent(boolean present){
        this.present= present;
    }

    public void dercribe () {

        System.out.println("Name:" + this.name);
        System.out.println("present:" + this.name);
        System.out.println("grade:" + this.name);
        System.out.println("Phone" + this.phone);
        System.out.println("Date of Birth:" + this.dob);

        System.out.println("------------------------------------------");
    }






}
