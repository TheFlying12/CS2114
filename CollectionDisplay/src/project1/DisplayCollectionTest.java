/**
 * 
 */
package project1;

import bag.BagInterface;
import student.TestCase;
/**
 * @author JulianNguyen
 * @version 8/30/2016
 *
 */
public class DisplayCollectionTest extends TestCase {

    /**
     * Defines/Instantiates anything used in 
     * multiple/most tests for convenience.
     */
    public void setUp()
    {
        //Intentionally left blank
    }
    
    /**
     * Tests to see if every item in Bag belongs to STRINGS[]
     */
    public void testBagContents()
    {
        for (int x = 0; x < 20; x++)
        {
            DisplayCollection test = new DisplayCollection();
            BagInterface<String> b = test.getItemBag();
            for (int i = 0; i < b.getCurrentSize(); i++)
            {
                String s = b.remove();
                assertTrue(s.equals(DisplayCollection.STRINGS[0]) 
                    || s.equals(DisplayCollection.STRINGS[1]) 
                    || s.equals(DisplayCollection.STRINGS[2]) 
                    || s.equals(DisplayCollection.STRINGS[3]));
            }
        }
    }
    
    /**
     * Tests to see if each Bag has between 5 to 15 items (inclusive)
     */
    public void testBagSize()
    {
        for (int x = 0; x < 20; x++)
        {
            DisplayCollection test = new DisplayCollection();
            BagInterface<String> b = test.getItemBag();
            assertTrue(b.getCurrentSize() <= 15 && b.getCurrentSize() >= 5);
        }
    }
    
}
