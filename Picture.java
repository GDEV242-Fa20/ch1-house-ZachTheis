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
    private Square castle;
    private Square left_tower;
    private Square right_tower;
    private Square parapet1;
    private Square parapet2;
    private Square parapet3;
    //private Square window;
    private Triangle left_tower_roof;
    private Triangle right_tower_roof;
    private Circle sun;
    private Circle window1;
    private Circle window2;
    private Person king;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        castle = new Square();
        left_tower = new Square();
        right_tower = new Square();
        parapet1 = new Square();
        parapet2 = new Square();
        parapet3 = new Square();
        //window = new Square();
        left_tower_roof = new Triangle();  
        right_tower_roof = new Triangle();
        //sun = new Circle();
        window1 = new Circle();
        window2 = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            castle.moveHorizontal(-150);
            castle.moveVertical(-20);
            castle.changeSize(230);
            castle.changeColor("blue");
            castle.makeVisible();
            
            left_tower.moveHorizontal(-150);
            left_tower.moveVertical(-70);
            left_tower.changeSize(50);
            left_tower.changeColor("blue");
            left_tower.makeVisible();
            
            right_tower.moveHorizontal(30);
            right_tower.moveVertical(-70);
            right_tower.changeSize(50);
            right_tower.changeColor("blue");
            right_tower.makeVisible();
            
            parapet3.moveVertical(-30);
            parapet3.moveHorizontal(-10);
            parapet3.changeSize(20);
            parapet3.changeColor("magenta");
            parapet3.makeVisible();
            
            // window.changeColor("black");
            // window.moveHorizontal(-120);
            // window.moveVertical(40);
            // window.changeSize(40);
            // window.makeVisible();
    
            left_tower_roof.changeSize(50, 50);
            left_tower_roof.moveHorizontal(-25);
            left_tower_roof.moveVertical(-140);
            left_tower_roof.makeVisible();
            
            right_tower_roof.changeSize(50, 50);
            right_tower_roof.moveHorizontal(155);
            right_tower_roof.moveVertical(-140);
            right_tower_roof.makeVisible();
    
            // sun.changeColor("yellow");
            // sun.moveHorizontal(100);
            // sun.moveVertical(-40);
            // sun.changeSize(80);
            // sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        castle.changeColor("black");
        //window.changeColor("white");
        left_tower_roof.changeColor("black");
        //sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        castle.changeColor("red");
        //window.changeColor("black");
        left_tower_roof.changeColor("green");
        //sun.changeColor("yellow");
    }
}
