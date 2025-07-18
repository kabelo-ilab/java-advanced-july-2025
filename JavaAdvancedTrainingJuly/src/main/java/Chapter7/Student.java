package Chapter7;

public class Student {
    private String studentNum;
    private String firstname;
    private String lastname;
    private String subject;
    private int age;
    private int testMark, assignment1, assignment2;

    public Student(String studentNum, String firstname, String lastname, String subject, int age) {
        setStudentNum(studentNum);
        setFirstname(firstname);
        setLastname(lastname);
        setSubject(subject);
        setAge(age);
    }

    public void setAssessments(int test, int assignment1, int assignment2){
        this.testMark = test;
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;
    }

    public double getSemesterMark(){
        //test * 34%, a1 * 33%, a2 * 33%
        return ((testMark * 0.34) + (assignment1 * 0.33) + (assignment2 * 0.33));
    }
    public String getStudentNum() {
        return studentNum;
    }

    private void setStudentNum(String studentNum) {
        this.studentNum = "ST-25" + studentNum;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("Student#: " + getStudentNum());
        System.out.println("Name: " + getFirstname() + " " + getLastname());
        System.out.println("Age: " + getAge());
        System.out.println("Subject: " + getSubject());
        System.out.println("=======Assessments=========");
        System.out.println("Test: " + this.testMark);
        System.out.println("Assignment 1: " + this.assignment1);
        System.out.println("Assignment 2: " + this.assignment2);
        System.out.println("Semester Mark: " + this.getSemesterMark());
    }
}
