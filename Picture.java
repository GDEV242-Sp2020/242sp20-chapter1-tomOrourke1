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
    
    
    
    
    private Circle ring01;
    private Circle ring02;
    private Circle ring03;
    private Circle ring04;
    private Circle ring05;
    
    
    
    
    
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
        
        
        ring01 = new Circle();
        ring02 = new Circle();
        ring03 = new Circle();
        ring04 = new Circle();
        ring05 = new Circle();
        
        
        
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
            //space
            backG.changeColor("space");
            //planet
            planet01.changeColor("orange01");
            planet02.changeColor("orange02");
            planet03.changeColor("orange03");
            planet04.changeColor("orange04");
            planet05.changeColor("orange05");
            planet06.changeColor("orange06");
            planet07.changeColor("orange07");
            planet08.changeColor("orange08");
            planet09.changeColor("orange09");
            planet10.changeColor("orange10");
            //rings
            ring01.changeColor("white");
            ring02.changeColor("white");
            ring03.changeColor("white");
            ring04.changeColor("white");
            ring05.changeColor("white");
            
            /**
             * CHANGE SIZE
             */
            //background in space
            backG.changeSize(500);
            //planet
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
            // now the ring
            ring01.changeSize(10);
            ring02.changeSize(10);
            ring03.changeSize(10);
            ring04.changeSize(10);
            ring05.changeSize(10);
            
            /**
             * Move IT
             */
            //planet movement
            backG.moveHorizontal(-310);
            backG.moveVertical(-190);
            planet01.moveHorizontal(15);
            planet01.moveVertical(15);
            planet02.moveHorizontal(12);
            planet02.moveVertical(12);
            planet03.moveHorizontal(10);
            planet03.moveVertical(10);
            planet04.moveHorizontal(9);
            planet04.moveVertical(9);
            planet05.moveHorizontal(7);   
            planet05.moveVertical(7);  
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
            
            // ring move
            
            ring01.moveHorizontal(-40);
            ring01.moveVertical(100);
            ring02.moveHorizontal(18);
            ring02.moveVertical(90);
            ring03.moveHorizontal(70);
            ring03.moveVertical(70);
            ring04.moveHorizontal(100);
            ring04.moveVertical(-20);
            ring05.moveHorizontal(90);
            ring05.moveVertical(18);
            
            
            /**
             * ORDER OF VISUALS
             */
            //backvis
            backG.makeVisible();
            //planet vis
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
            //ring vis
            ring01.makeVisible();
            ring02.makeVisible();
            ring03.makeVisible();
            ring04.makeVisible();
            ring05.makeVisible();
            
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
