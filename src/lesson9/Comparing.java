package lesson9;

import java.util.*;

public class Comparing {
    List<String> kartoha = new ArrayList<>();
    public Comparing(long n)
    {
        for(long i=0;i<n;i++) {
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
        System.out.println("Поиск занял: "+(time2-time1)+" нс");
    }
    public  void binFinder(String num){
        long time1= System.nanoTime();
        if(Collections.binarySearch(kartoha,num)>=0)
            System.out.println("Бинарный поиск: номер найден.");
        else
            System.out.println("Бинарный поиск: номер не найден.");
        long time2=System.nanoTime();
        System.out.println("Поиск занял: "+(time2-time1)+" нс");
    }
    public void hashFinder(String num)
    {
        HashSet<String> goha = new HashSet<>(kartoha);
        long time1= System.nanoTime();
        if(goha.contains(num))
            System.out.println("Поиск в HashSet: номер найден.");
        else
            System.out.println("Поиск в HashSet: номер не найден.");
        long time2=System.nanoTime();
        System.out.println("Поиск занял: "+(time2-time1)+" нс");
    }
    public void treeFinder(String num)
    {
        TreeSet<String> goha = new TreeSet<>(kartoha);
        long time1= System.nanoTime();
        if(goha.contains(num))
            System.out.println("Поиск в HashSet: номер найден.");
        else
            System.out.println("Поиск в HashSet: номер не найден.");
        long time2=System.nanoTime();
        System.out.println("Поиск занял: "+(time2-time1)+" нс");
    }
}
