package lesson10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.spec.ECField;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Logger {

    File file;
    FileWriter w;
    public Logger(String path, String name)
    {
        try {
             file = new File(path,name);
            if (file.exists())
            {
                w = new FileWriter(file,true);
            }
            else {
                file.createNewFile();
                w = new FileWriter(file,true);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public Logger(Logger log){
        this.file=log.file;
        this.w=log.w;
    }
    public void print(Integer t) throws IOException {
        System.out.println(t);
        Date date = new Date();
        w.write(date.toString());
        w.append(' ');
        String s;
        s=t.toString();
        w.write(s);
        w.append('\n');
        w.flush();
    }
    public void print(String t) throws IOException {
        System.out.println(t);
        Date date = new Date();
        w.write(date.toString());
        w.append(' ');
        w.write(t);
        w.append('\n');
        w.flush();
    }
    public void print(String path,double a,String t) {
        System.out.println(path+": "+a+t);
        Date date = new Date();
        try {
            w.write(date.toString());
            w.append(' ');
            w.write(path);
            w.append(": ");
            w.write(String.valueOf(a));
            w.write(t);
            w.append('\n');
            w.flush();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public void print(String t, String t2) throws IOException {
        System.out.println("Скопированно из "+ t+ " в"+ t2);
        Date date = new Date();
        w.write(date.toString());
        w.append(' ');
        w.write("Скопированно из ");
        w.write(t);
        w.write(" в");
        w.write(t2);
        w.append('\n');
        w.flush();
    }
}
