package lesson10;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Logger l = new Logger("./lesson10_files/","log.txt");
        //DirInfo x = new DirInfo(l);
        CopyPaster copyPaster = new CopyPaster(l);
    }
}
