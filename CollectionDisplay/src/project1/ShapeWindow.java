/**
 * 
 */
package project1;

import bag.Bag;
import bag.BagInterface;
import CS2114.TextShape;

import java.awt.Color;
import java.util.Random;
import CS2114.Window;
import CS2114.Button;
import CS2114.WindowSide;

/**
 * @author JulianNguyen
 *
 */
public class ShapeWindow {
    
    public Window window;
    public TextShape textShape;
    public Button quitButton;
    public Button chooseButton;
    public BagInterface<String> itemBag;
    public String current;
    public boolean isEmpty;

    public ShapeWindow(BagInterface<String> bag)
    {
        window = new Window();
        window.setTitle("Project1");
        itemBag = bag;
        quitButton = new Button("Quit");
        quitButton.onClick(this, "clickedQuit");
        window.addButton(quitButton, WindowSide.NORTH);
        chooseButton = new Button("Choose");
        chooseButton.onClick(this, "clickedChoose");
        window.addButton(chooseButton, WindowSide.SOUTH);
        textShape = new TextShape(0, 0, "");
        window.addShape(textShape);
    }
    
    public void clickedQuit(Button button)
    {
        System.exit(0);
    }
    
    public void clickedChoose(Button button)
    {
        if (!itemBag.isEmpty())
        {
            current = itemBag.remove();
            textShape.setText(current);
        }
        else
        {
            textShape.setText("No more items.");
            isEmpty = true;
        }
        colorText();
        centerText();
    }
    
    public void colorText()
    {
        if (current.contains("red") && !isEmpty)
        {
            textShape.setForegroundColor(Color.RED);
        }
        else if (current.contains("blue") && !isEmpty)
        {
            textShape.setForegroundColor(Color.BLUE);
        }
        else
        {
            textShape.setForegroundColor(Color.BLACK);
        }
    }
    
    public void centerText()
    {
        int winHeight = window.getGraphPanelHeight();
        int winWidth = window.getGraphPanelWidth();
        int sHeight = textShape.getHeight();
        int sWidth = textShape.getWidth();
        textShape.moveTo((winWidth - sWidth)/2, (winHeight - sHeight)/2);
    }
}

