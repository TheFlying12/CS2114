/**
 * 
 */
package employees;

import student.TestCase;

/**
 * @author JulianNguyen
 * @version 2016.09.02
 *
 */
public class PartTimeEmployeeTest extends TestCase {

    private PartTimeEmployee a;
    private PartTimeEmployee b;
    private PartTimeEmployee aa;

    /**
     * Defines/Instantiates anything used in 
     * multiple/most tests for convenience.
     */
    public void setUp()
    {
        a = new PartTimeEmployee("Alex", 10.0, 5);
        b = new PartTimeEmployee("Brian", 9.50, 6);
        aa = new PartTimeEmployee("Alex", 5.50, 7);
    }

    /**
     * Tests the getHoursWorked method
     */
    public void testGetHoursWorked()
    {
        assertEquals(5, a.getHoursWorked(), 0.01);
        assertEquals(6, b.getHoursWorked(), 0.01);
        assertEquals(7, aa.getHoursWorked(), 0.01);
    }

    /**
     * Tests the weeklyPay method
     */
    public void testWeeklyPay()
    {
        assertEquals(50.0, a.weeklyPay(), 0.01);
        assertEquals(57.0, b.weeklyPay(), 0.01);
        assertEquals(38.50, aa.weeklyPay(), 0.01);
    }

}
