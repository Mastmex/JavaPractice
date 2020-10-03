package lesson2.bodyparts;

public class Legs {
    int N;
    double M;
    boolean GO=false;
    public Legs(int n, int m) {
        this.N = n;
        this.M = m;
    }
    public void go()
    {
        if(this.GO)
        {
            System.out.println("Вы и так идете");

        }
        else {
            this.GO = true;
            System.out.println("Вы пошли");
        }
    }
    public void stop(){
        if(!this.GO)
        {
            System.out.println("Вы и так стоите");
        } else{
            this.GO=false;
            System.out.println("Вы остановились");
        }
    }
}
