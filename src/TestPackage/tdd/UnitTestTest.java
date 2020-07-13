package TestPackage.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UnitTestTest {
    // this is original testing for examine the main code in my own package MathUtils
    // we don't simply use sout but rgb color
    // this class will contain a lot of main() methods
    // use annotation to declare main method
    // If there are lot of @Test in this class which means all main() methods will run sequentially

    @Test
    public void testSuccessfulCases() {
        assertEquals(120, new org.niin.utils.MathUtils().computeFactorial(5));
    }
}