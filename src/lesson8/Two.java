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
            String[] text=kekw.split("\\s");
            switch (text[0]){
                case "ADD":
                    add(text[1]);
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
        if(!check(s))
        {
            System.out.println("Неверный формат почты");
            return;
        }
        kartoha.add(s);
    }
    boolean check(String s)
    {
        boolean a = true;
        int at=0;
        char[] c = s.toCharArray();
        if(s.contains("@")&&s.contains("."))
            a=true;
        else return false;
        for(char i:c)
        {
            if(i=='@')
                at++;
        }
        if(at==2)
            return false;
        if(s.indexOf("@")>s.indexOf("."))
            return false;
        if(c[0]=='@')
            return false;
        if(c[c.length-1]=='.')
            return false;
        for(int i=0;i<c.length-1;i++)
        {
            if((c[i]=='@')&&(c[i+1]=='.'))
                return false;
            if((c[i]=='.')&&(c[i+1]=='.'))
                return false;
        }
        return true;
    }
}
