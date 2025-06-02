public class Registration {
    private Student student;
    private Course course;

    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void printDetails() {
        System.out.println("Student: " + student.getName() +
                " registered for course: " + course.getCourseTitle());
    }
}

