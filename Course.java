public class Course {
    private String courseCode;
    private String courseTitle;
    private int credit;

    public Course(String courseCode, String courseTitle, int credit) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getCredit() {
        return credit;
    }
}

