package lesson10;

import java.io.*;
import java.util.Scanner;

public class CopyPaster {
    String path1;
    String path2;
    File f,f2;
    public CopyPaster(Logger l) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Какую:");
        path1 = in.nextLine();
        System.out.println("Куда:");
        path2 = in.nextLine();
        f = new File(path1);
        f2= new File(path2);
        if(!f2.exists())
            f2.mkdir();
        copy(f,f2);
        Logger x = new Logger(l);
        l.print(path1,path2);
    }
    private void copy(File f1,File dest) throws IOException {
        File[] files = f1.listFiles();
        if(files !=null) {
            for (File item : files) {
                if(item.isDirectory())
                {
                    File l = new File(dest.getPath(),item.getName());
                    l.mkdir();
                    copy(item,l);
                }
                else
                {
                    File l = new File(dest.getPath(),item.getName());
                    l.createNewFile();
                    BufferedReader x = new BufferedReader(new FileReader(item));
                    FileWriter fw = new FileWriter(l);
                    char[] buf= new char[(int)item.length()];
                    x.read(buf);
                    fw.write(buf);
                    fw.close();
                    x.close();

                }
            }
        }
    }
}

