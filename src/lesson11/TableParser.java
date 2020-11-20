package lesson11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class TableParser {

    public  TableParser() throws IOException {

        String row;
        double i=0,plus=0,minus=0;
        ArrayList<String> kartoha=new ArrayList<>();
        ArrayList<String> goha=new ArrayList<>();
        ArrayList<Double> lepyoha = new ArrayList<>();
        BufferedReader csvReader = new BufferedReader(new FileReader("./data/movementList.csv"));
        while (( row = csvReader.readLine()) != null) {
            String[] data = row.split(";");
            i++;
            if(i==1) {
                i++;
                continue;
            }
            kartoha.addAll(Arrays.asList(data));
        }
        int h=0;
        for(int a=0;a<kartoha.size();a++)
        {
            if(a==511)
            {
                System.out.println("here");
            }
            if(a%8==5)
            {
                goha.add(strParser(kartoha.get(a)));
            }
            if(a%8==6)
            {
                String regex="\\d*,\\d*";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(kartoha.get(a));
                if(matcher.find())
                {
                    String[] o = kartoha.get(a).split(",");
                    String st=o[0]+"."+o[1];
                    plus+=parseDouble(st);
                    if(parseDouble(st)!=0)
                        goha.remove(h);
                    continue;
                }
                plus+=parseDouble(kartoha.get(a));
                if(parseDouble(kartoha.get(a))!=0)
                goha.remove(h);
            }
            if(a%8==7)
            {
                String regex="\\d*,\\d*";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(kartoha.get(a));
                if(matcher.find())
                {
                    String[] o = kartoha.get(a).split(",");
                    String st=o[0]+"."+o[1];
                    minus+=parseDouble(st);
                    if(parseDouble(st)!=0) {
                        h++;
                        lepyoha.add(parseDouble(st));
                    }
                    continue;
                }
                minus+=parseDouble(kartoha.get(a));
                if(parseInt(kartoha.get(a))!=0) {
                    h++;
                    lepyoha.add(parseDouble(kartoha.get(a)));
                }
            }
        }
        System.out.println("Доход составил: "+plus);
        System.out.println("Расход составил "+minus);
        for(int a=0;a<lepyoha.size();a++)
        {
            System.out.println("Расход на "+goha.get(a)+" составил "+lepyoha.get(a));
        }
    }
    String strParser(String s)
    {
        String[] t = s.split("1028");
        String[] l= t[1].split("\\d{2}\\.\\d{2}\\.\\d{2}");
        return l[0];
    }
}
