package lesson3.movable;

import lesson3.movable.*;


public class Rectangle implements Movable {

    private double A,B;
    private double area,perimeter;
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
    public void moveRect(double a, double b)
    {
        if(a==b) {
            if(a!=0) {
                System.out.println("Вы сдвинули прямоугольник на " + a + (a > 0 ? ("Вправо") : ("Влево")));
                    return;
            }
            System.out.println("Вы не сдвинули прямоугольник");
        }
        else
            System.out.println("Введите одинаковые значения");
    }
}
