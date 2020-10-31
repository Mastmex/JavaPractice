package lesson9;

public class Test {
    public static void main(String[] args) {
        Comparing l = new Comparing(1_500_000);
        l.stdFinder("A777CH69");
        l.binFinder("A777CH69");
        l.hashFinder("A777CH69");
        l.treeFinder("A777CH69");
//        System.out.println(l.kartoha.get(15000));
    }


}
