package lesson10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyPaster {
    String path1;
    String path2;
    File f,f2;
    public CopyPaster() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Какую:");
        path1 = in.nextLine();
        System.out.println("Куда:");
        path2 = in.nextLine();
        f = new File(path1);
        f2= new File(path2);
        copy(f,f2);
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
                    FileReader fr = new FileReader(item);
                    FileWriter fw = new FileWriter(l);
                    char[] buf= new char[(int)item.length()];
                    fr.read(buf);
                    fw.write(buf);
                }
            }
        }
    }
}
