import java.util.*;

public abstract class Course {

    protected List<CourseModule> modules = new ArrayList<>();

    public Course(){
        this.createCourse();
    }

    public List<CourseModule> getCourseModules(){
        return modules;
    }

    public abstract void createCourse();
    
}