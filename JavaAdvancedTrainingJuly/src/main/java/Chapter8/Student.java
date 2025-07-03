package Chapter8;

import java.util.regex.Pattern;

/*Rules:1 - Student number should contain 8 digits
*       2 - Age should be >= 17
*       3 - Firstname should be at least 3 characters long*/
public class Student {
    private String studentNum;
    private String firstname;
    private String lastname;
    private String subject;
    private int age;
    private int testMark, assignment1, assignment2;
    private Pattern ptn = Pattern.compile("^-?\\d+$");//check for whole numbers

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
        boolean isValid = ptn.matcher(studentNum).matches();

        if (studentNum.length() != 8){
            throw new IllegalArgumentException("Student number should be 8 digits long." +
                    "\nCurrent Student number: [" + studentNum + "]");
        }
        if (!isValid){
            throw new IllegalArgumentException("Student number should only contain digits." +
                    "\nCurrent Student number: [" + studentNum + "]");
        }
        this.studentNum = "ST-25-" + studentNum;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if (firstname.length() < 3){
            throw new IllegalArgumentException("Name should be at least 3 characters long." +
                    "\nProvided name is (" + firstname + ")");
        }
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

    public void setAge(int age) {//15
        if (age < 17){
            throw new IllegalArgumentException("Age should be 17 or greater. " +
                    "\nThe current age is: (" + age + ")");
        }
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
