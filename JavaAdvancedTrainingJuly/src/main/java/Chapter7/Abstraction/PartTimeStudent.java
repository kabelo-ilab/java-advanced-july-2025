package Chapter7.Abstraction;

public class PartTimeStudent extends Student {

    private int test, assignment1, assignment2;
    private String grade;
    private double semesterMark, finalMark;

    public PartTimeStudent(int test, int assignment1, int assignment2, double exam) {
        this.test = test;
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;

        this.semesterMark = calculateSemesterMark(test,assignment1,assignment2);
        this.finalMark = calculateFinalMark(this.semesterMark, exam);
    }

    /**
     * @param test
     * @param assignment1
     * @param assignment2
     * @return The semester mark
     */
    @Override
    public double calculateSemesterMark(int test, int assignment1, int assignment2) {
        return ((test * 0.4) + (assignment1 * 0.25) + (assignment2 * 0.35));
    }

    /**
     * Calculate and return the final mark of a student
     *
     * @param semesterMark
     * @param examMark
     * @return The final mark
     */
    @Override
    public double calculateFinalMark(double semesterMark, double examMark) {
        return (semesterMark + examMark) / 2;
    }

    /**
     * Assign grade based on the final mark
     *
     * @param finalMark
     */
    @Override
    public void assignGrade(double finalMark) {

    }

    @Override
    public String toString() {
        return "PartTimeStudent{" +
                "Test = " + test +
                ", \nAssignment 1 = " + assignment1 +
                ", \nAssignment 2 = " + assignment2 +
                ", \nGrade = '" + grade + '\'' +
                ", \nSemester Mark = " + semesterMark +
                ", \nFinal Mark = " + finalMark +
                '}';
    }
}
