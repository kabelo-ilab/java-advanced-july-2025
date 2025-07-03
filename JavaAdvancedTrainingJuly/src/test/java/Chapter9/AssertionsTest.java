package Chapter9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    @DisplayName("Test the sum of two numbers")
    void testSumOfTwoNumbers(){
        //Arrange - define initial and expected values / results
        int num1 = 5;
        int num2 = 7;
        int expected = 12;

        //Actual - actual processing done by the system
        int actual = num1 + num2;

        //Assert - compare expected results with actual results
        assertEquals(expected, actual, "The sum of " + num1 + " + " + num2 +
                " should be: " + (num1 + num2));
    }

    @Test
    @DisplayName("Test The difference of two numbers")
    void testDiffOfTwoNumbers(){
        //Arrange
        int num1 = 2;
        int num2 = 5;
        int expected = -3;//-3
        //Actual
        int actual = num1 - num2;//-3

        //Assert
        assertTrue(expected == actual);

    }

    @Test
    @DisplayName("Compute Sum, Product, Difference, Quotient")
    void testComputationOfTwoNumbers(){
        //Arrange
        int num1 = 6;
        int num2 = 3;
        int expectedSum = 9;
        int expectedDiff = 3;
        int expectedProduct = 18;
        double expectedQuotient = 2.0;

        //Actual
        int actualSum = num1 + num2 + 1;
        int actualDiff = num1 - num2 + 2;
        int actualProduct = num1 * num2;
        double actualQuotient = num1 / num2;

        //Assert - use assertAll to execute all assertions as a group

        assertAll(
                () -> assertEquals(expectedSum, actualSum, "Sum failed"),
                () -> assertEquals(expectedProduct, actualProduct, "Product failed"),
                () -> assertEquals(expectedDiff, actualDiff, "Difference failed"),
                () -> assertEquals(expectedQuotient, actualQuotient, "Quotient failed")
        );
    }
}
