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

    
    private Square backG;
    
    private Circle planet01;
    private Circle planet02;
    private Circle planet03;
    private Circle planet04;
    private Circle planet05;
    private Circle planet06;
    private Circle planet07;
    private Circle planet08;
    private Circle planet09;
    private Circle planet10;
    
    
    
    
    
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
        
        backG = new Square();
        
        planet01 = new Circle();
        planet02 = new Circle();
        planet03 = new Circle();
        planet04 = new Circle();
        planet05 = new Circle();
        
        planet06 = new Circle();
        planet07 = new Circle();
        planet08 = new Circle();
        planet09 = new Circle();
        planet10 = new Circle();
        
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
            backG.changeColor("space");
            
            planet01.changeColor("orange01");
            planet02.changeColor("orange02");
            planet03.changeColor("orange03");
            planet04.changeColor("orange04");
            planet05.changeColor("orange05");
            
            planet06.changeColor("orange01");
            planet07.changeColor("orange02");
            planet08.changeColor("orange03");
            planet09.changeColor("orange04");
            planet10.changeColor("orange05");
            
            
            /**
             * CHANGE SIZE
             */
            backG.changeSize(500);
            
            planet01.changeSize(10);
            planet02.changeSize(20);
            planet03.changeSize(30);
            planet04.changeSize(40);
            planet05.changeSize(50);
            
            planet06.changeSize(60);
            planet07.changeSize(70);
            planet08.changeSize(80);
            planet09.changeSize(90);
            planet10.changeSize(100);
            
            /**
             * Move IT
             */
            backG.moveHorizontal(-310);
            backG.moveVertical(-190);
            
            planet01.moveHorizontal(14);
            planet01.moveVertical(14);
            
            planet02.moveHorizontal(10);
            planet02.moveVertical(10);
            
            planet03.moveHorizontal(9);
            planet03.moveVertical(9);
            
            planet04.moveHorizontal(8);
            planet04.moveVertical(8);
            
            planet05.moveHorizontal(6);   
            planet05.moveVertical(6);   
            
            planet06.moveHorizontal(5);   
            planet06.moveVertical(5);   
            
            planet07.moveHorizontal(4);   
            planet07.moveVertical(4);   
            
            
            planet08.moveHorizontal(2);   
            planet08.moveVertical(2);   
            
            planet09.moveHorizontal(1);   
            planet09.moveVertical(1);   
            
            planet10.moveHorizontal(0);   
            planet10.moveVertical(0);   
            
            /**
             * ORDER OF VISUALS
             */
            
            backG.makeVisible();
            
            planet10.makeVisible();
            planet09.makeVisible();
            planet08.makeVisible();
            planet07.makeVisible();
            planet06.makeVisible();
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
