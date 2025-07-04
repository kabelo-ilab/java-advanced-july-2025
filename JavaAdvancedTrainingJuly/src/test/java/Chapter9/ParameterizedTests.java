package Chapter9;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTests {
    @ParameterizedTest(name = "Test pass mark - Run: [{index}] : {arguments}")
    @ValueSource(doubles = {77.8, 45.6, 50, 89.3, 23.5, 46.8})
    void testPassMark(double testMark){
        //Arrange
        boolean expected = true;
        //Act
        boolean actual = testMark >= 65;
        //Assert
        assertEquals(expected, actual, "Pass mark should be >= 65. [" + testMark + "]");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Jake", "Kate", "Jessica", "Tom", "John", "Carol", "Kabelo"})
    void testStartsWithJ(String name){
        assertTrue(name.startsWith("J"), name + " doesn't start with 'J'");
    }

    @ParameterizedTest
    @CsvSource(value = {"Milk,20.55,100","Bread,18.50,50","Cheese,89.99,75","Eggs,78.95,70"})
    void testLowStockProducts(String name, double price, int qtyInStock){
       assertTrue(qtyInStock < 75, "There is enough stock [" + qtyInStock + "] for " + name);
    }
}
