/**
 * This class represents a simple picture. In this particular case, the picture
 * in question is of a castle, complete with towers, parapets, windows, and a
 * door, with a man standing in the parapets.
 * 
 * @author  Zach Theis
 * @version 2020.09.14
 */
public class Picture
{
    private Square castle;
    private Square left_tower;
    private Square right_tower;
    private Square upper_door;
    private Square lower_door;
    private Square parapet1;
    private Square parapet2;
    private Square parapet3;
    private Triangle left_tower_roof;
    private Triangle right_tower_roof;
    private Circle sun;
    private Circle window1;
    private Circle window2;
    private Circle window3;
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
        upper_door = new Square();
        lower_door = new Square();
        parapet1 = new Square();
        parapet2 = new Square();
        parapet3 = new Square();
        left_tower_roof = new Triangle();  
        right_tower_roof = new Triangle();
        window1 = new Circle();
        window2 = new Circle();
        window3 = new Circle();
        king = new Person();
        drawn = false;
    }

    /**
     * Draw this picture. It's a castle
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
            left_tower.changeColor("green");
            left_tower.makeVisible();
            
            right_tower.moveHorizontal(30);
            right_tower.moveVertical(-70);
            right_tower.changeSize(50);
            right_tower.changeColor("green");
            right_tower.makeVisible();
            
            king.moveVertical(-118);
            king.moveHorizontal(-35);
            king.changeSize(40,20);
            king.changeColor("magenta");
            king.makeVisible();
            
            parapet1.moveVertical(-40);
            parapet1.moveHorizontal(-85);
            parapet1.changeSize(20);
            parapet1.changeColor("blue");
            parapet1.makeVisible();
            
            parapet2.moveVertical(-40);
            parapet2.moveHorizontal(-45);
            parapet2.changeSize(20);
            parapet2.changeColor("blue");
            parapet2.makeVisible();
            
            parapet3.moveVertical(-40);
            parapet3.moveHorizontal(-5);
            parapet3.changeSize(20);
            parapet3.changeColor("blue");
            parapet3.makeVisible();
    
            left_tower_roof.changeSize(50, 50);
            left_tower_roof.moveHorizontal(-25);
            left_tower_roof.moveVertical(-140);
            left_tower_roof.makeVisible();
            
            right_tower_roof.changeSize(50, 50);
            right_tower_roof.moveHorizontal(155);
            right_tower_roof.moveVertical(-140);
            right_tower_roof.makeVisible();
            
            window1.changeSize(25);
            window1.changeColor("yellow");
            window1.moveVertical(40);
            window1.moveHorizontal(-30);
            window1.makeVisible();
            
            window2.changeSize(25);
            window2.changeColor("yellow");
            window2.moveVertical(40);
            window2.moveHorizontal(35);
            window2.makeVisible();
            
            window3.changeSize(25);
            window3.changeColor("yellow");
            window3.moveVertical(40);
            window3.moveHorizontal(95);
            window3.makeVisible();
            
            lower_door.changeSize(30);
            lower_door.changeColor("black");
            lower_door.moveVertical(150);
            lower_door.moveHorizontal(-50);
            lower_door.makeVisible();
            
            upper_door.changeSize(30);
            upper_door.changeColor("black");
            upper_door.moveVertical(120);
            upper_door.moveHorizontal(-50);
            upper_door.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        castle.changeColor("black");
        left_tower.changeColor("black");
        right_tower.changeColor("black");
        left_tower_roof.changeColor("black");
        right_tower_roof.changeColor("black");
        parapet1.changeColor("black");
        parapet2.changeColor("black");
        parapet3.changeColor("black");
        king.changeColor("black");
        window1.changeColor("white");
        window2.changeColor("white");
        window3.changeColor("white");
        lower_door.changeColor("white");
        upper_door.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        castle.changeColor("blue");
        left_tower.changeColor("green");
        right_tower.changeColor("green");
        left_tower_roof.changeColor("green");
        right_tower_roof.changeColor("green");
        parapet1.changeColor("blue");
        parapet2.changeColor("blue");
        parapet3.changeColor("blue");
        king.changeColor("magenta");
        window1.changeColor("yellow");
        window2.changeColor("yellow");
        window3.changeColor("yellow");
        lower_door.changeColor("black");
        upper_door.changeColor("black");
    }
}
