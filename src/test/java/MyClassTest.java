import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyClassTest {

    @BeforeAll
    static void init() {}

    @BeforeEach
    void setUp() {}

    @Test
    void testMyMethod1_Scenario1() {
        MyClass myClass = new MyClass();
        String actual = myClass.myMethod1(10);
        String expected = "The value is "+10;
        assertEquals(expected, actual);
    }

    @Test
    void testMyMethod2_Scenario1() {
        MyClass myClass = new MyClass();
        int  actual = myClass.myMethod2("10");
        int expected = 110;
        assertEquals(expected, actual);
    }
}
