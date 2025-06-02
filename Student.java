public class Student {
    private String studentId;
    private String name;
    private Account account;

    public Student(String studentId, String name, Account account) {
        this.studentId = studentId;
        this.name = name;
        this.account = account;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}

