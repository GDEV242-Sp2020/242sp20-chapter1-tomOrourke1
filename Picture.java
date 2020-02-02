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
    
    private Person inRing;
    
    
    private Circle ring01;
    private Circle ring02;
    private Circle ring03;
    private Circle ring04;
    private Circle ring05;
    private Circle ring06;
    private Circle ring07;
    private Circle ring08;
    
    private Circle ring09;
    private Circle ring10;
    private Circle ring11;
    private Circle ring12;
    private Circle ring13;
    private Circle ring14;
    private Circle ring15;
    private Circle ring16;
    
    private Square inSquare;
    private Triangle inTriangle;
    
    private int offsetx = -5;
    private int offsety = -5;
    
    
    
    
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
        
        inRing = new Person();
        
        ring01 = new Circle();
        ring02 = new Circle();
        ring03 = new Circle();
        ring04 = new Circle();
        ring05 = new Circle();
        ring06 = new Circle();
        ring07 = new Circle();
        ring08 = new Circle();
        
        ring09 = new Circle();
        ring10 = new Circle();
        ring11 = new Circle();
        ring12 = new Circle();
        ring13 = new Circle();
        ring14 = new Circle();
        ring15 = new Circle();
        ring16 = new Circle();
        
        inSquare = new Square();
        inTriangle = new Triangle();
        
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
            ring06.changeColor("white");
            ring07.changeColor("white");
            ring08.changeColor("white");
            ring09.changeColor("white");
            ring10.changeColor("white");
            ring11.changeColor("white");
            ring12.changeColor("white");
            ring13.changeColor("white");
            ring14.changeColor("white");
            ring15.changeColor("white");
            ring16.changeColor("white");
            
            inRing.changeColor("blue");
            
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
            ring06.changeSize(10);
            ring07.changeSize(10);
            ring08.changeSize(10);
            
            ring09.changeSize(5);
            ring10.changeSize(5);
            ring11.changeSize(5);
            ring12.changeSize(5);
            ring13.changeSize(5);
            ring14.changeSize(5);
            ring15.changeSize(5);
            ring16.changeSize(5);
            
            inTriangle.changeSize(10,10);
            inSquare.changeSize(10);
            
            /**
             * Move IT
             */
            //planet movement
            backG.moveHorizontal(-310 + offsetx);
            backG.moveVertical(-190 + offsety);
            planet01.moveHorizontal(15 + offsetx);
            planet01.moveVertical(15 + offsety);
            planet02.moveHorizontal(12 + offsetx);
            planet02.moveVertical(12 + offsety);
            planet03.moveHorizontal(10 + offsetx);
            planet03.moveVertical(10 + offsety);
            planet04.moveHorizontal(9 + offsetx);
            planet04.moveVertical(9 + offsety);
            planet05.moveHorizontal(7 + offsetx);   
            planet05.moveVertical(7 + offsety);  
            planet06.moveHorizontal(5 + offsetx);   
            planet06.moveVertical(5 + offsety);   
            planet07.moveHorizontal(4 + offsetx);   
            planet07.moveVertical(4 + offsety);  
            planet08.moveHorizontal(2 + offsetx);   
            planet08.moveVertical(2 + offsety);   
            planet09.moveHorizontal(1 + offsetx);   
            planet09.moveVertical(1 + offsety);   
            planet10.moveHorizontal(0 + offsetx);   
            planet10.moveVertical(0 + offsety);   
            
            // ring move
            
            ring01.moveHorizontal(-40);
            ring01.moveVertical(95);
            ring02.moveHorizontal(18);
            ring02.moveVertical(80);
            ring03.moveHorizontal(70);
            ring03.moveVertical(65);
            ring04.moveHorizontal(100);
            ring04.moveVertical(-20);
            ring05.moveHorizontal(87);
            ring05.moveVertical(24);
            ring06.moveHorizontal(-20);
            ring06.moveVertical(43);
            ring07.moveHorizontal(50);
            ring07.moveVertical(-12);
            ring08.moveHorizontal(0);
            ring08.moveVertical(0);
            
            ring09.moveHorizontal(-30);
            ring09.moveVertical(72);
            ring10.moveHorizontal(-10);
            ring10.moveVertical(24);
            
            ring11.moveHorizontal(-10);
            ring11.moveVertical(90);
            ring12.moveHorizontal(49);
            ring12.moveVertical(75);
            ring13.moveHorizontal(83);
            ring13.moveVertical(47);
            ring14.moveHorizontal(96);
            ring14.moveVertical(4);
            
            inRing.moveHorizontal(-21);
            inRing.moveVertical(-102);
            
            ring15.moveHorizontal(25);
            ring15.moveVertical(-4);
            ring16.moveHorizontal(76);
            ring16.moveVertical(-14);
            
            inSquare.moveHorizontal(7);
            inSquare.moveVertical(-5);
            inTriangle.moveHorizontal(6);
            inTriangle.moveVertical(-5);
            
            /**
             * ORDER OF VISUALS
             */
            //backvis
            backG.makeVisible();
            //rings behind
            //ring06.makeVisible();
            ring07.makeVisible();
            ring08.makeVisible();
            ring09.makeVisible();
            ring10.makeVisible();
            //ring15.makeVisible();
            ring16.makeVisible();
            inRing.makeVisible();
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
            //ring05.makeVisible();
            
            inTriangle.makeVisible();
            inSquare.makeVisible();
            
            //small; ring
            ring11.makeVisible();
            ring12.makeVisible();
            ring13.makeVisible();
            ring14.makeVisible();
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
        //space
            backG.changeColor("white");
            //planet
            planet01.changeColor("black");
            planet02.changeColor("black");
            planet03.changeColor("black");
            planet04.changeColor("black");
            planet05.changeColor("black");
            planet06.changeColor("black");
            planet07.changeColor("black");
            planet08.changeColor("black");
            planet09.changeColor("black");
            planet10.changeColor("black");
            //rings
            ring01.changeColor("black");
            ring02.changeColor("white");
            ring03.changeColor("white");
            ring04.changeColor("black");
            ring05.changeColor("white");
            ring06.changeColor("black");
            ring07.changeColor("black");
            ring08.changeColor("black");
            ring09.changeColor("black");
            ring10.changeColor("black");
            ring11.changeColor("black");
            ring12.changeColor("white");
            ring13.changeColor("white");
            ring14.changeColor("black");
            //ring15.changeColor("black");
            inRing.changeColor("black");
            ring16.changeColor("black");
            inSquare.changeColor("white");
            inTriangle.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        //space
            backG.changeColor("space");
            //rings back
            //ring15.changeColor("white");
            inRing.changeColor("blue");
            ring06.changeColor("white");
            ring07.changeColor("white");
            ring08.changeColor("white");
            inTriangle.changeColor("green");
            
            //planet
            planet10.changeColor("orange10");
            planet09.changeColor("orange09");
            planet08.changeColor("orange08");
            planet07.changeColor("orange07");
            planet06.changeColor("orange06");
            planet05.changeColor("orange05");
            planet04.changeColor("orange04");
            planet03.changeColor("orange03");
            planet02.changeColor("orange02");
            planet01.changeColor("orange01");
            //rings
            ring01.changeColor("white");
            ring02.changeColor("white");
            ring03.changeColor("white");
            ring04.changeColor("white");
            ring05.changeColor("white");
            
            inSquare.changeColor("red");
            
            ring09.changeColor("white");
            ring10.changeColor("white");
            ring11.changeColor("white");
            ring12.changeColor("white");
            ring13.changeColor("white");
            ring14.changeColor("white");
            
            ring16.changeColor("white");
    }
}
