package Introduction;
import student.TestCase;


/**
 *  CalculatorTest will test all of the methods in Calculator to make
 *  sure that they run and perform as expected
 *
 * @author  Julian Nguyen  julian18
 * @version 8/26/16
 */

public class CalculatorTest extends TestCase
{
    private Calculator c;
    private Calculator b;
    
    /**
     * sets up each test method before it runs
     */
    public void setUp()
    {
        c = new Calculator(6, 2);
        b = new Calculator(6, 0);
    }
    
    /**
     * Tests the getFirstInput method
     */
    public void testGetFirstInput()
    {
        assertEquals(6, c.getFirstInput(), 0.01);
    }
    
    /**
     * Tests the getSecondInput method
     */
    public void testGetSecondInput()
    {
        assertEquals(2, c.getSecondInput(), 0.01);
    }
    
    /**
     * Tests the multiply method
     */
    public void testMultiply()
    {
        assertEquals(12, c.multiply(), 0.01);
    }
    
    /**
     * Tests the divide method
     */
    public void testDivide()
    {
        assertEquals(3, c.divide(), 0.01);
    }
    
    /**
     * Tests the divide method in instance of second input equaling zero
     */
    public void testDivideByZero()
    {
        assertEquals(Double.NaN, b.divide(), 0.01);
    }
    
    /**
     * Tests the add method
     */
    public void testAdd()
    {
        assertEquals(8, c.add(), 0.01);
    }
    
    /**
     * Tests the subtract method
     */
    public void testSubtract()
    {
        assertEquals(4, c.subtract(), 0.01);
    }
    
    /**
     * Tests the power method
     */
    public void testPower()
    {
        assertEquals(36, c.power(), 0.01);
    }

}
