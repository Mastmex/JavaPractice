package lesson3;
import lesson3.shapes.bank.*;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle ya = new Circle(in.nextDouble());
        ya.calcArea();
        ya.calcPerimeter();
        Rectangle lyousha = new Rectangle(in.nextDouble(),in.nextDouble());
        lyousha.calcArea();
        lyousha.calcPerimeter();
        Triangle biba = new Triangle(in.nextDouble(),in.nextDouble(),in.nextDouble());
        biba.calcArea();
        biba.calcPerimeter();
    }
}
