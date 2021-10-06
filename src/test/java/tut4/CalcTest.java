package tut4;
import tut4.Calc;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalcTest{

    Calc calc = new Calc();

    @Test
    void testAdd() {
        int a = calc.add(2, 3);
        assertTrue(a==5);
    }

    @Test
    void testSubtract() {
        int a = calc.add(5, 3);
        assertTrue(a==2);
    }

}
//    extends TestCase
//{
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public CalcTest(String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( CalcTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//}
