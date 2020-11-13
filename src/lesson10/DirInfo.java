package lesson10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DirInfo {
    File file;
    double sum=0;
    Logger log;
    public DirInfo(Logger l) throws IOException {
        Scanner in = new Scanner(System.in);
        file = new File(in.nextLine());
        log = new Logger(l);
        summator();
        getInfo();
    }
    public void summator()
    {
        sum+=recurs(file);
    }
    private static double recurs(File f){
        double s=0;
        File[] files = f.listFiles();
        if(files !=null) {
            for (File item : files) {
                if (item.isFile())
                    s += item.length();
                else
                    s += recurs(item);
            }
        }
        else return f.length();
        return s;
    }
    public void getInfo() throws IOException {
        if(sum<=1024)
        {
            log.print(file.getPath(),sum," B");
            return;
        }
        sum/=1024;
        if(sum<=1024)
        {
            log.print(file.getPath(),sum," KB");
            return;
        }
        sum/=1024;
        if(sum<=1024)
        {
            log.print(file.getPath(),sum," MB");
            return;
        }
        sum/=1024;
        if(sum<=1024)
        {
            log.print(file.getPath(),sum," GB");
            return;
        }
        sum/=1024;
        if(sum<=1024)
        {
            log.print(file.getPath(),sum," TB");
            return;
        }
    }
}
