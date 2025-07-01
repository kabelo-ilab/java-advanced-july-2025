package Chapter7;

public class StudentRunner {
    public static void main(String[] args) {
        Student objStudent = new Student("123456","Tom", "Smith", "SQL", 22);
        objStudent.setAssessments(75,65,78);

        Student objStudent2 = new Student("246811","Jessica", "Jones", "Java", 21);
        objStudent2.setAssessments(88,65,45);

        System.out.println("===========Student 1 Data==============");
        objStudent.display();
        System.out.println("\n===========Student 2 Data==============");
        objStudent2.display();
    }
}
