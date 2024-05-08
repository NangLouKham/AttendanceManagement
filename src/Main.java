
import java.util.*;

public class Main {
    public static void main(String[] args){
        AttendanceManager attendanceManager = new AttendanceManager();
        ClassroomManager classroomManager = new ClassroomManager();


        classroomManager.addClassroom("Maths");
        classroomManager.addClassroom("Geography");

        Classroom mathClass = classroomManager.getClassroom("Math");
        mathClass.addStudent("B4G8-11");

        Classroom geographyClass = classroomManager.getClassroom("Geography");
        mathClass.addStudent("B4G8-7");

    }
}