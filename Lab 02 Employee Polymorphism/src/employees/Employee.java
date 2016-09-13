package employees;
//-------------------------------------------------------------------------
/**
 *  Represents an average employee working 40 hours per week.
 *
 *  @author  Julian Nguyen
 *  @version 2016.09.01
 */
public class Employee
{
    //~ Fields ................................................................

    private String name;
    private double hourlyRate;

    //~ Constructor ...........................................................
    /**
     * New Employee object.
     *
     * @param name Name of Employee
     * @param hourlyRate Pay rate of Employee (per hour).
     **/
    public Employee(String name, double hourlyRate)
    {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Gets the employee's name.
     * @return the employee's name
     */
    public String getName()
    {
        return name;
    }


    // ----------------------------------------------------------
    /**
     * Gets the pay rate (per hour).
     * @return the pay rate
     */
    public double getHourlyRate()
    {
        return hourlyRate;
    }

    // ----------------------------------------------------------
    /**
     * Amount paid to the employee for an average 40 hour work week.
     * @return weekly Weekly pay for employee
     */
    public double weeklyPay()
    {
        return hourlyRate * 40;
    }

    // ----------------------------------------------------------
    /**
     * Overrides the equals() method to instead see if two employees 
     * share the same name
     * @return boolean
     * @param obj Object to be compared
     */

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() == obj.getClass())
        {
            Employee e = (Employee) obj;
            return this.getName().equals(e.getName());
        }
        else
        {
            return false;
        }
    }
}