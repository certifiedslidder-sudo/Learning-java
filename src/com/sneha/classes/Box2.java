package com.sneha.classes;
           // this program declares two mybox object
public class Box2
{
     double width;
     double height;
     double depth;
}
class Boxdemo2
{
    static void main(String[] args) {
        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();
        double vol;

        // assigning values to mybox1's instance variable.
        mybox1.width = 100;
        mybox1.height = 100;
        mybox1.depth = 100;

        // assigning values to mybox2's instance variable.
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.width*mybox1.height*mybox1.depth;
        System.out.println("Volume of box1: "+vol);         // volume of first box
        vol = mybox2.width*mybox2.height*mybox2.depth;
        System.out.println("Volume of box2: "+vol);         // volume of second box

    }
}
