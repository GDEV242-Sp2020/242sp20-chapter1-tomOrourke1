/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 * 
 * 
 * This class now draws a planet with a square ring arround it
 * it can become black and white as well as color using methods
 * 
 * @author of these changes ~ Tom O'Rourke
 * 
 * 
 */
public class CopyOfPicture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;
    
    private Circle sun2;
    
    private Person person;
    
    
    /**
     * Constructor for objects of class CopyOfPicture
     */
    public CopyOfPicture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        drawn = false;
        sun2 = new Circle();
        person = new Person();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            /**
             *  CHANGE COLOR
             */
             wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("blue");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            
            
            
            sun2.changeColor("yellow");
            sun2.moveHorizontal(100);
            sun2.moveVertical(-40);
            sun2.changeSize(40);
            sun2.makeVisible();
            
            
            
            drawn = true;
        }
    }
    /**
     * sun sets
     */
    public void sunSet()
    {
        sun.slowMoveHorizontal(0);
        sun.slowMoveVertical(500);
        sun2.slowMoveHorizontal(-500);
        sun2.slowMoveVertical(0);
        
        
        person.changeColor("black");
        person.moveHorizontal(100);
        person.moveVertical(-40);
        person.changeSize(40, 20);
        person.makeVisible();
        
        
    }    
    
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
