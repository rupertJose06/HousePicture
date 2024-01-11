public class Picture {
    private Square grass;
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square background;
    private boolean drawn;


    /**
     * Constructor for objects of class Picture
     */
    public Picture() {
        wall = new Square();
        window = new Square();
        roof = new Triangle();
        sun = new Circle();
        background = new Square();
        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw() {
        if(!drawn) {
            background.changeColor("blue");
            background.moveHorizontal(-350);
            background.moveVertical(-200);
            background.changeSize(5000);
            background.makeVisible();

            Square grass = new Square();
            grass.changeColor("green");
            grass.moveHorizontal(-350);
            grass.moveVertical(125);
            grass.changeSize(5000);
            grass.makeVisible();

            Triangle roof = new Triangle();
            roof.changeColor("lightgray");
            roof.moveHorizontal(0);
            roof.moveVertical(0);
            roof.changeSize(50, 100);
            roof.makeVisible();
/*
            Triangle roof2 = new Triangle();
            roof2.changeColor("gray");
            roof2.moveHorizontal(-350);
            roof2.moveVertical(125);
            roof2.changeSize(50, 100);
            roof2.makeVisible();
*/

            wall.moveHorizontal(-140);
            wall.moveVertical(60);
            wall.changeSize(400);
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

            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite() {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        background.changeColor("blue");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor() {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
        background.changeColor("blue");
    }
}
