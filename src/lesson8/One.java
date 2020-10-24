package lesson8;

import java.io.IOError;
import java.util.ArrayList;
import java.util.Scanner;

public class One {
    ArrayList<String> kartoha;
    Scanner in = new Scanner(System.in);
    public One(){
        kartoha=new ArrayList<>();
        boolean flag=false;
        for(;;){
            String text = in.nextLine();
            String[] goha=text.split("\\s");
            switch (goha[0]){
                case "ADD":
                    Add(goha);
                    break;
                case "EDIT":
                    Edit(goha);
                    break;
                case "LIST":
                    List();
                    break;
                case "DELETE":
                    Delete(goha);
                    break;
                case "EXIT":
                    flag=true;
                    break;
                default:
                    System.out.println("Ввод неверен");
                    break;
            }
            if(flag)
                break;
        }
    }
    void List() {
        for(String i:kartoha)
            System.out.println(i);
    }
    void Add(String[] s){
        int index=0;
        boolean f=false;
        String l=new String();
        int c=0;
        try{
            index=Integer.parseInt(s[1]);
        }
        catch (NumberFormatException e)
        {
            f=true;
        }
        if(f)
        {
            for(String i: s) {
                if(c==1)
                    l=i+" ";
                if(c>1) {
                    l += i;
                    l += " ";
                   }
                c++;
            }
            kartoha.add(l);
        }
        else
        {
            for(String i: s) {
                if(c==2)
                    l=i+" ";
                if(c>2) {
                    l += i;
                    l += " ";
                }
                c++;
            }
            try{
                kartoha.add(index,l);
            }
            catch (Exception e)
            {
                System.out.println("Повторите ввод");
            }
        }
    }
    void Edit(String[] s){
        int index=0;
        boolean f=false;
        String l=new String();
        int c=0;
        try{
            index=Integer.parseInt(s[1]);
        }
        catch (NumberFormatException e)
        {
            System.out.println("повторите ввод");
            return;
        }
        for(String i: s) {
            if(c==2)
                l=i+" ";
            if(c>2) {
                l += i;
                l += " ";
            }
            c++;
        }
        try{
            kartoha.set(index,l);
        }
        catch (Exception e){
            System.out.println("Повторите ввод");
        }

    }
    void Delete(String[] s){
        int index=0;
        boolean f=false;
        String l=new String();
        int c=0;
        try{
            index=Integer.parseInt(s[1]);
        }
        catch (NumberFormatException e)
        {
            System.out.println("повторите ввод");
            return;
        }
        try{
            kartoha.remove(index);
        }
        catch (Exception e)
        {
            System.out.println("Повторите ввод");
        }
    }
}
