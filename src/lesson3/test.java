package lesson3;
import lesson3.shapes.bank.*;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle ya = new Circle(in.nextDouble());
        ya.calcArea();
        ya.calcPerimeter();
        lesson3.shapes.bank.Rectangle lyousha = new Rectangle(in.nextDouble(),in.nextDouble());
        lyousha.calcArea();
        lyousha.calcPerimeter();
        Triangle bible = new Triangle(in.nextDouble(),in.nextDouble(),in.nextDouble());
        bible.calcArea();
        bible.calcPerimeter();
        lesson3.movable.Rectangle rect = new lesson3.movable.Rectangle(in.nextDouble(),in.nextDouble());
        rect.calcArea();
        rect.moveRect(in.nextDouble(),in.nextDouble());
    }
}
