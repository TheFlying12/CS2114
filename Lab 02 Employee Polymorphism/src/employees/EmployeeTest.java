/**
 * 
 */
package employees;

import student.TestCase;

/**
 * @author JulianNguyen
 * @version 2016.09.01
 *
 */
public class EmployeeTest extends TestCase {

    private Employee a;
    private Employee b;
    private Employee aa;
    private Employee n;

    /**
     * Defines/Instantiates anything used in 
     * multiple/most tests for convenience.
     */
    public void setUp()
    {
        a = new Employee("Alex", 10.0);
        b = new Employee("Brian", 9.50);
        aa = new Employee("Alex", 5.50);
        n = null;
    }

    /**
     * Tests the getName method
     */
    public void testGetName()
    {
        assertTrue(a.getName().equals("Alex"));
        assertTrue(b.getName().equals("Brian"));
    }

    /**
     * Tests the getHourlyRate method
     */
    public void testGetHourlyRate()
    {
        assertEquals(10.0, a.getHourlyRate(), 0.01);
        assertEquals(9.50, b.getHourlyRate(), 0.01);
    }

    /**
     * Tests the weeklyPay method
     */
    public void testWeeklyPay()
    {
        assertEquals(10.0 * 40, a.weeklyPay(), 0.01);
        assertEquals(9.50 * 40, b.weeklyPay(), 0.01);
    }

    /**
     * Tests the overridden equals method
     */
    public void testEquals()
    {
        assertTrue(a.equals(a));
        assertFalse(a.equals(b));
        assertTrue(a.equals(aa));
        assertFalse(a.equals("Hello"));
        assertFalse(a.equals(n));
    }

}
