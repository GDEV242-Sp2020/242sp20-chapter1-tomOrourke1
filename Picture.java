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
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;

    
    
    private Circle planet01;
    private Circle planet02;
    private Circle planet03;
    private Circle planet04;
    private Circle planet05;
    
    
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        drawn = false;
        
        
        planet01 = new Circle();
        planet02 = new Circle();
        planet03 = new Circle();
        planet04 = new Circle();
        planet05 = new Circle();
        
        
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            /*
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.changeColor("blue");
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
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            */
            
            /**
             *  CHANGE COLOR
             */
            planet01.changeColor("orange01");
            planet02.changeColor("orange02");
            planet03.changeColor("orange03");
            planet04.changeColor("orange04");
            planet05.changeColor("orange05");
            
            
            /**
             * CHANGE SIZE
             */
            
            planet01.changeSize(10);
            planet02.changeSize(20);
            planet03.changeSize(30);
            planet04.changeSize(40);
            planet05.changeSize(50);
            
            
            /**
             * Move IT
             */
            planet01.moveHorizontal(4);
            planet01.moveVertical(4);
            
            planet02.moveHorizontal(3);
            planet02.moveVertical(3);
            
            planet03.moveHorizontal(2);
            planet03.moveVertical(2);
            
            planet04.moveHorizontal(1);
            planet04.moveVertical(1);
            
            planet05.moveHorizontal(0);   
            planet05.moveVertical(0);   
            /**
             * ORDER OF VISUALS
             */
           
            planet05.makeVisible();
            planet04.makeVisible();
            planet03.makeVisible();
            planet02.makeVisible();
            planet01.makeVisible();
           
            /**
             *  DRAW BOOLEAN
             */
            drawn = true;
        }
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
