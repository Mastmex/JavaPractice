package lesson8;

import com.sun.source.util.Trees;

import java.util.Scanner;
import java.util.TreeSet;

public class Two {
    TreeSet<String> kartoha;
    Scanner in = new Scanner(System.in);
    boolean flag=false;
    public Two(){
        kartoha=new TreeSet<>();
        for(;;)
        {
            String kekw=in.nextLine();
            switch (kekw){
                case "ADD":
                    add(kekw);
                    break;
                case "LIST":
                    list();
                    break;
                case "EXIT":
                    flag=true;
                    break;
                default:
                    System.out.println("Повторите ввод");
                    break;
            }
            if(flag)
                break;
        }
    }
    void list(){
        for(String i: kartoha)
            System.out.println(i);
    }
    void add(String s){

    }
    boolean check(String s)
    {
return true;
    }
}
