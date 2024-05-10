
import java.util.*;

public class Main {
    public static void main(String[] args){
        AttendanceManager attendanceManager = new AttendanceManager();
        ClassroomManager classroomManager = new ClassroomManager();
        Scanner
                r
        classroomManager.addClassroom("Myanmar");
        classroomManager.addClassroom("English");
        classroomManager.addClassroom("Maths");
        classroomManager.addClassroom("Geography");
        classroomManager.addClassroom("History");
        classroomManager.addClassroom("Science");

        Classroom myanmarClass = classroomManager.getClassroom("Myanmar");
        myanmarClass.addStudent("B4G8-7");
        myanmarClass.addStudent("B4G8-11");
        myanmarClass.addStudent("B4G8-15");
        myanmarClass.addStudent("B4G8-18");
        List<Student> myanmarClassStudents = myanmarClass.getStudents();
        for(Student s: myanmarClassStudents) {
            s.dercribe();
        }

        Classroom englishClass = classroomManager.getClassroom("English");
        englishClass.addStudent("B4G8-7");
        englishClass.addStudent("B4G8-11");
        englishClass.addStudent("B4G8-15");
        englishClass.addStudent("B4G8-18");


        Classroom mathClass = classroomManager.getClassroom("Maths");
        mathClass.addStudent("B4G8-7");
        mathClass.addStudent("B4G8-11");
        mathClass.addStudent("B4G8-15");
        mathClass.addStudent("B4G8-18");


        Classroom geographyClass = classroomManager.getClassroom("Geography");
        geographyClass.addStudent("B4G8-7");
        geographyClass.addStudent("B4G8-11");
        geographyClass.addStudent("B4G8-15");
        geographyClass.addStudent("B4G8-18");

        Classroom historyClass = classroomManager.getClassroom("History");
        historyClass.addStudent("B4G8-7");
        historyClass.addStudent("B4G8-11");
        historyClass.addStudent("B4G8-15");
        historyClass.addStudent("B4G8-18");

        Classroom scienceClass = classroomManager.getClassroom("Science");
        scienceClass.addStudent("B4G8-7");
        scienceClass.addStudent("B4G8-11");
        scienceClass.addStudent("B4G8-15");
        scienceClass.addStudent("B4G8-18");





    }
}