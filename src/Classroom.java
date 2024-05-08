
import java.util.*;
public class Classroom {
    private String className;
    private List<Student> students;
    public Classroom(String className){
        this.className = className;
        this.students = new ArrayList<>();
    }
    public String getClassName(){
        return className;
    }
    public void addStudent(String name){
        students.add(new Student(name));
    }
    public List<Student> getStudents(){
        return students;
    }
    public void removeStudent(String name){
        students.removeIf(student -> student.getName().equals(name));
    }

}
