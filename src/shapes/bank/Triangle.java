package shapes.bank;

import shapes.Shape;

public class Triangle extends Shape {
    double A,B,C;
    public Triangle(double a, double b,double c)
    {
        this.A=a;
        this.B=b;
        this.C=c;
    }
    public void calcArea() {
        double PP=(this.A+this.B+this.C)/2;
        area=Math.sqrt(PP*(PP-this.A)*(PP-this.B)*(PP-this.C));
        System.out.println("Area of triangle = "+ area);
    }

    public void calcPerimeter() {
        perimeter = this.A+this.B+this.C;
        System.out.println("Perimeter of triangle = "+perimeter);
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
