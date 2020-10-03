package lesson2;

public class Book {
    String D,N,A;
    boolean I;
    Book(String a, String n, String d,boolean i){
        D=d;
        A=a;
        N=n;
        I=i;
    }
    void info()
    {
        System.out.println("Данная книга называется "+N);
        System.out.println("Ее написал "+A);
        System.out.println("Напечатали ее "+D);
        if(I)
            System.out.println("Эта книга интересная");
        else
            System.out.println("Эта книга не очень интересная");
    }
}
