package lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparing {
    List<String> kartoha = new ArrayList<>();

    public Comparing(int n)
    {
        for(int i=0;i<n;i++) {
            Generator gen=new Generator();
            kartoha.add(gen.generate());
        }
        Collections.sort(kartoha);
    }
    public void stdFinder(String num){
        long time1= System.nanoTime();
        if(kartoha.contains(num))
            System.out.println("Поиск перебором: номер найден.");
        else
            System.out.println("Поиск перебором: номер не найден.");
        long time2=System.nanoTime();
        System.out.println("Поиск занял: "+(time2-time1));
    }
    public  void binFinder(String num){
        long time1= System.nanoTime();
    }

}
