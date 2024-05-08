import java.util.*;
public class ClassroomManager {
    private List<Classroom> classrooms;
    public ClassroomManager(){
        this.classrooms = new ArrayList<>();
    }
    public void addClassroom( String className){
        classrooms.add(new Classroom(className));
    }
    public void deleteClassroom(String className){
        classrooms.removeIf(classroom -> classroom.getClassName().equals(className));
    }
    public Classroom getClassroom(String className){
        for (Classroom classroom: classrooms){
            if(classroom.getClassName().equals(className)){
                return classroom;
            }
        }
        return null;
    }
    public List<Classroom> getAllClassrooms(){
        return classrooms;
    }
}
