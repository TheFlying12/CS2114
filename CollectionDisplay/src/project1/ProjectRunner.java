/**
 * 
 */
package project1;

import bag.Bag;
import bag.BagInterface;
import CS2114.TextShape;
import java.util.Random;
import CS2114.Window;
import CS2114.Button;
import CS2114.WindowSide;

/**
 * @author JulianNguyen
 *
 */
public class ProjectRunner {
    
    public ProjectRunner()
    {
        
    }
    
    public static void main(String[] args)
    {
        DisplayCollection d = new DisplayCollection();
        ShapeWindow s = new ShapeWindow(d.itemBag);
    }

}