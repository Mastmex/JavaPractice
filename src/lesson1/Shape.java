package lesson1;

public class Shape {
    String name;
    int ugl;
    Shape(int u, String n)
    {
        this.name=n;
        this.ugl=u;
    }
    void tostring(){
        System.out.println("Это "+name+". У него "+ugl+" углов.");
    }
}
