/**
 * 
 */
package employees;

import student.TestCase;

/**
 * @author JulianNguyen
 * @version 09.02.2016
 *
 */
public class ExternalContractorTest extends TestCase {

    private ExternalContractor a;
    private ExternalContractor b;
    private ExternalContractor aa;
    private ExternalContractor c;

    /**
     * Defines/Instantiates anything used in 
     * multiple/most tests for convenience.
     */
    public void setUp()
    {
        a = new ExternalContractor("Alex", 10.0);
        b = new ExternalContractor("Brian", 9.50);
        aa = new ExternalContractor("Alex", 5.50);
        c = new ExternalContractor("Charlie", 4.50);
    }

    /**
     * Tests the getHourlyRate method
     */
    public void testGetHourlyRate()
    {
        assertEquals(38.5, a.getHourlyRate(1), 0.01);
        assertEquals(41.75, b.getHourlyRate(2), 0.01);
        assertEquals(45.5, aa.getHourlyRate(3), 0.01);
        assertEquals(0.0, c.getHourlyRate(-4), 0.01);
    }

    /**
     * Tests the weeklyPay method
     */
    public void testWeeklyPay()
    {
        assertEquals(192.5, a.weeklyPay(5, 1), 0.01);
        assertEquals(208.75, b.weeklyPay(5, 2), 0.01);
        assertEquals(227.5, aa.weeklyPay(5, 3), 0.01);
        assertEquals(0.0, c.weeklyPay(5, -4), 0.01);
    }

}
