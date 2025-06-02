public class Main {
    public static void main(String[] args) {
        RegistrationManager manager = new RegistrationManager();

        Account acc1 = new Account("john123", "pass123");
        Student student1 = new Student("S001", "John Doe", acc1);
        manager.addStudent(student1);

        Course course1 = new Course("CSE101", "Introduction to Programming", 3);
        Course course2 = new Course("MAT101", "Calculus I", 3);
        manager.addCourse(course1);
        manager.addCourse(course2);

        manager.registerCourse(student1, course1);
        manager.registerCourse(student1, course2);
    }
}

