package lesson3.shapes.bank;

import lesson3.shapes.Shape;

public class Rectangle extends Shape {

    private double A,B;
    public Rectangle(double a, double b)
    {
        this.A=a;
        this.B=b;
    }
    public void calcArea() {
        area=this.A*this.B;
        System.out.println("Area of rectangle = "+area);
    }

    public void calcPerimeter() {
    perimeter=2*(this.B+this.A);
        System.out.println("Perimeter of rectangle = "+perimeter);
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
