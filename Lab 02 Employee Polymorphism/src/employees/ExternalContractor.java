/**
 * 
 */
package employees;

/**
 * @author JulianNguyen
 * @version 09.02.2016
 *
 */
public class ExternalContractor extends Employee {

    //~ Constructor ...........................................................
    /**
     * New ExternalContractor object.
     *
     * @param name Name of Contractor
     * @param hourlyRate Pay rate of Contractor (per hour).
     */
    public ExternalContractor(String name, double hourlyRate)
    {
        super(name, hourlyRate);
    }

    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Overrides Employee's getHourlyRate() method to instead calculate
     * pay based off of their hours worked or by project.
     * @Override Employee's getHourlyRate()
     * @precondition custRank must be a positive integer
     * @param custRank The customer's rank (1 - 3)
     * @return Hourly Rate
     */
    public double getHourlyRate(int custRank)
    {
        if (custRank == 1)
        {
            return 38.5;
        }
        else if (custRank == 2)
        {
            return 41.75;
        }
        else if (custRank >= 3)
        {
            return 45.5;
        }
        else
        {
            return 0.0;
        }
    }

    // ----------------------------------------------------------
    /**
     * The amount paid per week.
     * @precondition custRank must be positive
     * @param hours The number of hours worked per week.
     * @param custRank The customer's rank (1 - 3)
     * @return Returns the amount paid for a certain week.
     * @Override Employee's weeklyPay() method
     */
    public double weeklyPay(int hours, int custRank)
    {
        return getHourlyRate(custRank) * hours;
    }
}
