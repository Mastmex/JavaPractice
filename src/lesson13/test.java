package lesson13;

import java.io.File;
import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        String srcFolder = "./images";
        File srcDir = new File(srcFolder);
        File[] files = srcDir.listFiles();
        int kernels = Runtime.getRuntime().availableProcessors();
        int part = files.length/kernels;
        ArrayList<Thread> threads = new ArrayList<>();
        System.out.println(part);
        File[] adder = new File[part];
        int nach=0;
        for(int i=0;i<kernels;i++)
        {
            System.arraycopy(files,nach,adder,0,adder.length);
            threads.add(new Div(adder));
            threads.get(i).run();
            nach+=part;
        }
        System.arraycopy(files,nach,adder,0, files.length-part*kernels);
        Thread t = new Div(adder);
        t.run();
    }
}
