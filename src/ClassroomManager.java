import java.util.*;
public class ClassroomManager {
    private List<Classroom> classrooms;
    public ClassroomManager(){
        this.classrooms = new ArrayList<>();
    }
    public void addClassroom( String Legendary ){classrooms.add(new Classroom(Legendary));
    }
    public void deleteClassroom(String Legendary ){
        classrooms.removeIf(classroom -> classroom.getClassName().equals(Legendary));
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
