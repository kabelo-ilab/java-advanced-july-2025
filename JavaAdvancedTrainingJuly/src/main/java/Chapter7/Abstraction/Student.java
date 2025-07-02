package Chapter7.Abstraction;
/**
 * This class defines the following functions:
 * calculateSemesterMark(): double
 * calculateFinalMark(): double
 * assignGrade(finalMark): void
 * You need to define a variable 'grade'
 */
public abstract class Student {
    /**
     *
     * @param test
     * @param assignment1
     * @param assignment2
     * @return The semester mark
     */
    public abstract double calculateSemesterMark(int test, int assignment1, int assignment2);

    /**
     * Calculate and return the final mark of a student
     * @param semesterMark
     * @param examMark
     * @return The final mark
     */
    public abstract double calculateFinalMark(double semesterMark, double examMark);

    /**
     * Assign grade based on the final mark
     * @param finalMark
     */
    public abstract void assignGrade(double finalMark);
}
