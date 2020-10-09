package lesson2;

import lesson2.bodyparts.*;


public class Human {
    String N;
    int A;
    Human(int a, String name)
    {
        this.N=name;
        this.A=a;
    }
    Hands Hnd=new Hands(2,3);
    Head Hd=new Head(1,5);
    Legs Lg = new Legs(2,4);
}
