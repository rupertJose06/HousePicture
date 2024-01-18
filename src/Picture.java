import org.w3c.dom.css.Rect;

public class Picture {
    private Square grass;
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Rectangles background;
    private Rectangles houseStructure;
    private boolean drawn;


    /**
     * Constructor for objects of class Picture
     */
    public Picture() {
        background = new Rectangles();
        wall = new Square();
        window = new Square();
        roof = new Triangle();
        sun = new Circle();
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
            background.changeSize(750,750);
            background.makeVisible();

            Square grass = new Square();
            grass.changeColor("green");
            grass.moveHorizontal(-350);
            grass.moveVertical(125);
            grass.changeSize(5000);
            grass.makeVisible();

            Triangle roof = new Triangle();
            roof.changeColor("verylightgray");
            roof.moveHorizontal(37);
            roof.moveVertical(-120);
            roof.changeSize(125, 400);
            roof.makeVisible();

            Rectangles houseStructure = new Rectangles();
            houseStructure.changeColor("kindaWhite");
            houseStructure.moveHorizontal(-250);
            houseStructure.moveVertical(25);
            houseStructure.changeSize(175, 100);
            houseStructure.makeVisible();

            Rectangles driveway = new Rectangles();
            driveway.changeColor("driveway");
            driveway.moveHorizontal(-250);
            driveway.moveVertical(125);
            driveway.changeSize(175, 60);
            driveway.makeVisible();

            Triangle roof2 = new Triangle();
            roof2.changeColor("verylightgray");
            roof2.moveHorizontal(-63);
            roof2.moveVertical(-50);
            roof2.changeSize(55, 210);
            roof2.makeVisible();

            Rectangles houseStructure2 = new Rectangles();
            houseStructure2.changeColor("lightgray");
            houseStructure2.moveHorizontal(-75);
            houseStructure2.moveVertical(25);
            houseStructure2.changeSize(200, 100);
            houseStructure2.makeVisible();

            Rectangles garageBox1 = new Rectangles();
            garageBox1.changeColor("verylightgray");
            garageBox1.moveHorizontal(-240);
            garageBox1.moveVertical(65);
            garageBox1.changeSize(35, 23);
            garageBox1.makeVisible();

            Rectangles garageBox2 = new Rectangles();
            garageBox2.changeColor("verylightgray");
            garageBox2.moveHorizontal(-200);
            garageBox2.moveVertical(65);
            garageBox2.changeSize(35, 23);
            garageBox2.makeVisible();

            Rectangles garageBox3 = new Rectangles();
            garageBox3.changeColor("verylightgray");
            garageBox3.moveHorizontal(-160);
            garageBox3.moveVertical(65);
            garageBox3.changeSize(35, 23);
            garageBox3.makeVisible();

            Rectangles garageBox4 = new Rectangles();
            garageBox4.changeColor("verylightgray");
            garageBox4.moveHorizontal(-120);
            garageBox4.moveVertical(65);
            garageBox4.changeSize(35, 23);
            garageBox4.makeVisible();

            Rectangles garageBox5 = new Rectangles();
            garageBox5.changeColor("verylightgray");
            garageBox5.moveHorizontal(-240);
            garageBox5.moveVertical(95);
            garageBox5.changeSize(35, 23);
            garageBox5.makeVisible();

            Rectangles garageBox6 = new Rectangles();
            garageBox6.changeColor("verylightgray");
            garageBox6.moveHorizontal(-200);
            garageBox6.moveVertical(95);
            garageBox6.changeSize(35, 23);
            garageBox6.makeVisible();

            Rectangles garageBox7 = new Rectangles();
            garageBox7.changeColor("verylightgray");
            garageBox7.moveHorizontal(-160);
            garageBox7.moveVertical(95);
            garageBox7.changeSize(35, 23);
            garageBox7.makeVisible();

            Rectangles garageBox8 = new Rectangles();
            garageBox8.changeColor("verylightgray");
            garageBox8.moveHorizontal(-120);
            garageBox8.moveVertical(95);
            garageBox8.changeSize(35, 23);
            garageBox8.makeVisible();

            Rectangles garageWindow1 = new Rectangles();
            garageWindow1.changeColor("windows");
            garageWindow1.moveHorizontal(-240);
            garageWindow1.moveVertical(35);
            garageWindow1.changeSize(35, 23);
            garageWindow1.makeVisible();

            Rectangles garageWindow2 = new Rectangles();
            garageWindow2.changeColor("windows");
            garageWindow2.moveHorizontal(-200);
            garageWindow2.moveVertical(35);
            garageWindow2.changeSize(35, 23);
            garageWindow2.makeVisible();

            Rectangles garageWindow3 = new Rectangles();
            garageWindow3.changeColor("windows");
            garageWindow3.moveHorizontal(-160);
            garageWindow3.moveVertical(35);
            garageWindow3.changeSize(35, 23);
            garageWindow3.makeVisible();

            Rectangles garageWindow4 = new Rectangles();
            garageWindow4.changeColor("windows");
            garageWindow4.moveHorizontal(-120);
            garageWindow4.moveVertical(35);
            garageWindow4.changeSize(35, 23);
            garageWindow4.makeVisible();

            Rectangles frontdoor = new Rectangles();
            frontdoor.changeColor("doorPillar");
            frontdoor.moveHorizontal(-66);
            frontdoor.moveVertical(35);
            frontdoor.changeSize(50, 85);
            frontdoor.makeVisible();

            Rectangles doorstep = new Rectangles();
            doorstep.changeColor("doorstep");
            doorstep.moveHorizontal(-70);
            doorstep.moveVertical(118);
            doorstep.changeSize(58, 10);
            doorstep.makeVisible();

            Rectangles doorWindow = new Rectangles();
            doorWindow.changeColor("windows");
            doorWindow.moveHorizontal(-60);
            doorWindow.moveVertical(35);
            doorWindow.changeSize(38, 50);
            doorWindow.makeVisible();

            Rectangles doorWindowMiddle = new Rectangles();
            doorWindowMiddle.changeColor("doorPillar");
            doorWindowMiddle.moveHorizontal(-42);
            doorWindowMiddle.moveVertical(35);
            doorWindowMiddle.changeSize(2, 50);
            doorWindowMiddle.makeVisible();

            Rectangles doorframe = new Rectangles();
            doorframe.changeColor("doorPillar");
            doorframe.moveHorizontal(-60);
            doorframe.moveVertical(35);
            doorframe.changeSize(40, 15);
            doorframe.makeVisible();

            Rectangles doorWindowMiddle2 = new Rectangles();
            doorWindowMiddle2.changeColor("doorPillar");
            doorWindowMiddle2.moveHorizontal(-60);
            doorWindowMiddle2.moveVertical(65);
            doorWindowMiddle2.changeSize(40, 2);
            doorWindowMiddle2.makeVisible();

            Circle doorhandle = new Circle();
            doorhandle.changeColor("doorstep");
            doorhandle.moveHorizontal(50);
            doorhandle.moveVertical(120);
            doorhandle.changeSize(10);
            doorhandle.makeVisible();

            Rectangles roofwindowframe = new Rectangles();
            roofwindowframe.changeColor("roofwindowframe");
            roofwindowframe.moveHorizontal(-80);
            roofwindowframe.moveVertical(-60);
            roofwindowframe.changeSize(40, 50);
            roofwindowframe.makeVisible();

            Rectangles roofwindow = new Rectangles();
            roofwindow.changeColor("windows");
            roofwindow.moveHorizontal(-74);
            roofwindow.moveVertical(-55);
            roofwindow.changeSize(28, 38);
            roofwindow.makeVisible();

            Rectangles roofwindowmiddle1 = new Rectangles();
            roofwindowmiddle1.changeColor("roofwindowframe");
            roofwindowmiddle1.moveHorizontal(-61);
            roofwindowmiddle1.moveVertical(-60);
            roofwindowmiddle1.changeSize(2, 50);
            roofwindowmiddle1.makeVisible();

            Rectangles roofwindowmiddle2 = new Rectangles();
            roofwindowmiddle2.changeColor("roofwindowframe");
            roofwindowmiddle2.moveHorizontal(-80);
            roofwindowmiddle2.moveVertical(-37);
            roofwindowmiddle2.changeSize(35, 2);
            roofwindowmiddle2.makeVisible();

            Rectangles mainwindowframe = new Rectangles();
            mainwindowframe.changeColor("roofwindowframe");
            mainwindowframe.moveHorizontal(10);
            mainwindowframe.moveVertical(35);
            mainwindowframe.changeSize(90, 77);
            mainwindowframe.makeVisible();

            Rectangles mainwindow1 = new Rectangles();
            mainwindow1.changeColor("windows");
            mainwindow1.moveHorizontal(15);
            mainwindow1.moveVertical(39);
            mainwindow1.changeSize(35, 69);
            mainwindow1.makeVisible();

            Rectangles mainwindow2 = new Rectangles();
            mainwindow2.changeColor("windows");
            mainwindow2.moveHorizontal(61);
            mainwindow2.moveVertical(39);
            mainwindow2.changeSize(35, 69);
            mainwindow2.makeVisible();

            Rectangles mainwindowcenter = new Rectangles();
            mainwindowcenter.changeColor("roofwindowframe");
            mainwindowcenter.moveHorizontal(10);
            mainwindowcenter.moveVertical(71);
            mainwindowcenter.changeSize(90, 4);
            mainwindowcenter.makeVisible();

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
