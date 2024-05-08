import java.util.*;

import java.util.*;
public class AttendanceManager {
    private Map<Classroom, List<Student>> attendanceRecords;
    public AttendanceManager(){
        this.attendanceRecords = new HashMap<>();
    }
    public void takeAttendance(Classroom classroom, List<String> presentStudents){
    List<Student> students = classroom.getStudents();
    for(Student student: students){
        student.setPresent((presentStudents.contains(student.getName())));
    }
    attendanceRecords.put(classroom, students);
    }

    public Map<Classroom, List<Student>> getAttendanceRecords(){
        return attendanceRecords;
    }
}
