package com.dkit.oop;

/**
 * Abstract class Shape
 * 
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Abstract Class Shape" );
        App app = new App();
        app.start();
    }

    public void start() {

        //  Shape s1 = new Shape(2,3);  // compiler will complain. Cannot create an object of an Abstract class.

        Circle c1 = new Circle(1,2,5);
        System.out.println(c1.toString());

        //TODO
        // implement the Rectangle class (see skeleton Rectangle class).
        // instantiate a Rectangle object r1, and output its details.

        //TODO
        // create an ArrayList and populate it with two Circles and two Rectangles.
        // write a displayList() method that accepts the list and display all elements.
        // using a for loop, sum the area of all the shapes and output that sum.

        //TODO
        // The senior architect informs you that all shapes MUST have a method
        // called perimeter() that returns the perimeter of the shape.
        // Make the appropriate changes to the Shape, Circle and Rectangle classes.
    }
}
