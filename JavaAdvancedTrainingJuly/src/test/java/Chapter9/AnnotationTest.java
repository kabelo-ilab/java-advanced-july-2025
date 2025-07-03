package Chapter9;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class AnnotationTest {

    @BeforeAll
    static void setup(){
        System.err.println("Getting things ready....");

    }

    @AfterAll
    static void finish(){
        System.err.println("\nAll tests are completed...");
    }

    @Test
    @DisplayName("TC1 - First Test")
    void firstTest(){
        System.out.println("First Test");
    }
    @BeforeEach
    void beforeEachMethod(){
        System.err.println("Before Each...");
    }
    @AfterEach
    void afterEachMethod(){
        System.err.println("After Each...");
    }
    @Test
    @DisplayName("TC2 - Second Test")
    void secondTest(){
        System.out.println("Second Test");
    }
    @Test
    @DisplayName("TC3 - Third Test")
    void thirdTest(){
        System.out.println("Third Test");
    }
}
