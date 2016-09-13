/**
 * 
 */
package project1;

import bag.Bag;
import bag.BagInterface;
import java.util.Random;

/**
 * @author  Julian Nguyen  julian18
 * @version 8/30/16
 *
 */
public class DisplayCollection {
    
    /**
     * Contains possible strings for bag.
     */
    public static final String[] STRINGS = 
    {"red circle", "blue circle", "red square", "blue square"};
    
    /**
     * The bag that strings are pulled from.
     */
    public BagInterface<String> itemBag;
    
    /**
     * Keeps track of how many strings are in the bag at any given time.
     */
    public int count;
    
    /**
     * Keeps track of which index of STRINGS is to be used for the random string
     */
    int randIndex;
    
    /**
     * Default Constructor for DisplayCollection class
     */
    public DisplayCollection()
    {
        this.itemBag = new Bag<>();
        Random random = new Random();
        count = random.nextInt(11) + 5;
        for (int i = 0; i < count; i++)
        {
            randIndex = random.nextInt(4);
            itemBag.add(STRINGS[randIndex]);
        }
    }
    
    /**
     * @return A DisplayCollection's Bag
     */
    public BagInterface<String> getItemBag()
    {
        return itemBag;
    }

}
