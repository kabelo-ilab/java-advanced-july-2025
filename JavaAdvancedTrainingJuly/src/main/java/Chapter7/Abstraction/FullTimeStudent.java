package Chapter7.Abstraction;

public class FullTimeStudent extends Student {
    /**
     * @param test
     * @param assignment1
     * @param assignment2
     * @return The semester mark
     */
    @Override
    public double calculateSemesterMark(int test, int assignment1, int assignment2) {
        return 0;
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
        return 0;
    }

    /**
     * Assign grade based on the final mark
     *
     * @param finalMark
     */
    @Override
    public void assignGrade(double finalMark) {

    }
}
