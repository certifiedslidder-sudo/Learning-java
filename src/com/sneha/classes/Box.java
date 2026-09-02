package com.sneha.classes;

import javax.swing.*;

public class Box
{
    double width;        //instance variables --> width, height, length.
    double height;
    double length;
}
class BoxDemo
    {

    static void main(String[] args)
        {
            Box mybox = new Box();       // mybox is an instance/ object of class Box
            double vol;
            mybox.width = 100;                     // [.] = separator used to link the name of object to the name of an instance variable.
            mybox.height = 100;
            mybox.length = 100;

            vol = mybox.height * mybox.width*mybox.length;
            System.out.println("the volume is: " + vol);
        }

    }

