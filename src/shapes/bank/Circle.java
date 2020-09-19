package shapes.bank;

import shapes.Shape;

public class Circle extends Shape {
    private double D;
    private double R;
    public Circle(double r)
    {
        this.R=r;
        this.D=2*this.R;
    }
    public void calcArea(){
        area = Math.PI*Math.pow(this.R,2);
        System.out.println("Area of circle = "+ area);
    }
    public void calcPerimeter()
    {
        perimeter = 2*Math.PI*this.R;
        System.out.println("Perimeter of circle ="+perimeter);
    }
    public double getArea() {
    return area;
    }
    public double getPerimeter() {
    return perimeter;
    }
}
