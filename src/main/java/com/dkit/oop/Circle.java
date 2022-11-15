package com.dkit.oop;

/**
 * Represents a Circle object and extends Shape.
 * The area() method inherited from Shape is "abstract",
 * therefore, area() must be implemented in this class.
 * (The compiler will show an error until this is done)
 */

public class Circle extends Shape {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y); //calls the Shape superclass constructor
        this.radius = radius;
    }

    /**
     * Implement the inherited abstract area() method
     * (this must be implemented, otherwise an error is reported)
     *
     * @return area of a circle
     */
    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
    @Override
    public void draw() {
        System.out.println("Code to draw a Circle has been called...");
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        // call superclass toString method to get Shape details
        return super.toString() + "[radius=" + this.radius + "]";
    }

}
