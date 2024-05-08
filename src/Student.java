import java.util.*;

public class Student {
    private String name;
    private boolean present;
    public Student(String name){
        this.name = name;
        this.present = false;
    }
    public String getName(){
        return name;
    }
    public boolean isPresent(){
        return present;
    }
    public void setPresent(boolean present){
        this.present= present;
    }

}
