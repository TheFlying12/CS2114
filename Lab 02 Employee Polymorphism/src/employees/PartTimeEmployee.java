/**
 * 
 */
package employees;

/**
 * @author JulianNguyen
 * @version 09.02.2016
 *
 */
public class PartTimeEmployee extends Employee {

    //~ Fields ................................................................

    private int hours;

    //~ Constructor ...........................................................
    /**
     * New PartTimeEmployee object.
     *
     * @param name Name of PartTimeEmployee
     * @param hourlyRate Pay rate of PartTimeEmployee (per hour).
     * @param hours Number of hours worked per week
     */

    public PartTimeEmployee(String name, double hourlyRate, int hours)
    {
        super(name, hourlyRate);
        this.hours = hours;
    }

    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Gets the PartTimeEmployee's weekly hours.
     * @return the PartTimeEmployee's hours
     */
    public int getHoursWorked()
    {
        return hours;
    }

    // ----------------------------------------------------------
    /**
     * Overrides Employee's weeklyPay() method to instead calculate
     * pay based off of their hours worked.
     * @return PartTimeEmployee's Weekly Pay
     * 
     */
    public double weeklyPay()
    {
        return super.getHourlyRate() * hours;
    }
}
