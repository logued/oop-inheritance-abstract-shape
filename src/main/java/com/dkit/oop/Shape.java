package com.dkit.oop;
// Abstract class
//
// Use an Abstract class when:
// 1. You want to share code among several closely related classes.
// 2. You expect that classes which extend your abstract class will have
//    a similar structure (in terms of behaviour and use), with some
//    common fields and methods.
// (3. You want to declare non-static or non-final fields.)

// - if a class defines one or more abstract methods, then
//   the class must be declared as abstract (as in this example)
// - an abstract class can NOT be instantiated (i.e. it is not
//   possible to create an object of an abstract class using 'new Shape()'
// - subclasses MUST implement all abstract methods e.g. area()
//   (the compiler will indicate an error if a subclass does not
//   implement a method that has been declared as 'abstract'
//   (So, writers of subclasses are *forced* to provide an implementation
//   for all abstract methods)
//
// - the area() method is declared as "abstract", so developers who
//   extend this class must implement an area() method. The reason that we
//   impose the abstract method, is because we want to be able to get the area()
//   of all shapes (by calling area() on any shape object)
//   i.e. Polymorphism.


// Shape system specification:
// A drawing package needs to represent shape objects (Rectangles, Circles, etc.)
// All shape objects must have a position, an (x,y) co-ordinate that represents
// the top left corner of the object's position. All shape objects will have a
// moveTo() method that they inherit from Shape.
// All shapes must provide area() and draw() methods, by overriding the abstract area().
// Therefore, if we choose to define an ABSTRACT area() method,
// then consequently, we must define the Shape class to be ABSTRACT also.
// All subclasses will have to implement area() and draw().

public abstract class Shape {
    private int x; // position top left corner  - a field required in all subclasses
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * area()
     * Abstract method that must be implemented by all subclasses that extend
     * this class. Declaring the method as 'abstract' will force classes that
     * inherit from this class to implement the method.
     *
     * @return area of the shape
     * (see Rectangle::area() and Circle::area() for implementations)
     */
    public abstract double area();   // No method body is allowed in an abstract method
                                    // All classes that inherit (extend) Shape must implement area()


    public abstract void draw();

    // Methods common to all Shape objects.
    // These will be inherited by all subclasses.

    public void moveTo(int x, int y){  // This method will be inherited by all subclasses
        this.x = x;                    // without any need to change it in those subclasses.
        this.y = y;                    // Thus, it meets the DRY requirement of not repeating functional logic (it is shared)
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x;}
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public String toString() {
        return this.getClass().getName() +
                "(x=" + this.x + ",y=" + this.y + ")";
    }
}
