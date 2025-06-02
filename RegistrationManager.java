import java.util.ArrayList;

public class RegistrationManager {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Registration> registrations = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void registerCourse(Student student, Course course) {
        Registration registration = new Registration(student, course);
        registrations.add(registration);
        registration.printDetails();
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}

