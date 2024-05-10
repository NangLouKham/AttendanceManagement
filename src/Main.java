
import java.util.*;

public class Main {
    public static void main(String[] args){
        AttendanceManager attendanceManager = new AttendanceManager();
        ClassroomManager classroomManager = new ClassroomManager();

        classroomManager.addClassroom("Myanmar");
        classroomManager.addClassroom("English");
        classroomManager.addClassroom("Maths");
        classroomManager.addClassroom("Geography");
        classroomManager.addClassroom("History");
        classroomManager.addClassroom("Science");

        Classroom mathClass = classroomManager.getClassroom("Myanmar");
        mathClass.addStudent("B4G8-7");
        mathClass.addStudent("B4G8-11");
        mathClass.addStudent("B4G8-15");
        mathClass.addStudent("B4G8-18");


        classroomManager.addClassroom("English");
        mathClass.addStudent("B4G8-7");
        mathClass.addStudent("B4G8-11");
        mathClass.addStudent("B4G8-15");
        mathClass.addStudent("B4G8-18");


        Classroom mathClass = classroomManager.getClassroom("Math");
        mathClass.addStudent("B4G8-7");
        mathClass.addStudent("B4G8-11");
        mathClass.addStudent("B4G8-15");
        mathClass.addStudent("B4G8-18");


        Classroom geographyClass = classroomManager.getClassroom("Geography");
        mathClass.addStudent("B4G8-7");
        mathClass.addStudent("B4G8-11");
        mathClass.addStudent("B4G8-15");
        mathClass.addStudent("B4G8-18");

        classroomManager.addClassroom("History");
        mathClass.addStudent("B4G8-7");
        mathClass.addStudent("B4G8-11");
        mathClass.addStudent("B4G8-15");
        mathClass.addStudent("B4G8-18");

        classroomManager.addClassroom("Science");
        mathClass.addStudent("B4G8-7");
        mathClass.addStudent("B4G8-11");
        mathClass.addStudent("B4G8-15");
        mathClass.addStudent("B4G8-18");


    }
}