package lesson12;

import com.google.gson.JsonArray;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class HTMLParser {
    Document html;
    ArrayList<String> stations=new ArrayList<>();
    ArrayList<Integer>  stationNum= new ArrayList<>();
    ArrayList<String> lines=new ArrayList<>();
    ArrayList<String>  lineNum= new ArrayList<>();
    public HTMLParser() throws IOException {
        html = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines").maxBodySize(0).get();
        Elements elements = html.select("span[class]");
        stationAdd(elements);
        lineAdd(elements);
    }
    void stationAdd(Elements elements)
    {
        String t="";
        String[] g;
        String[] f;
        for(Element e:elements) {
            //System.out.println(e.toString());
            t += e.toString();
        }
        g=t.split("<span class=\"num\"|<span class=\"name\"");
        for(int i=1;i<g.length;i++)
        {
            if(i%2==1)
            {
                f=g[i].split(".&nbsp|>");
                stationNum.add(Integer.parseInt(f[1]));
            }
            else{
                f=g[i].split(">|</span>");
                stations.add(f[1]);
            }
        }
        for(int i=0;i<stationNum.size();i++)
        {
            System.out.println(stationNum.get(i)+"    "+stations.get(i));
        }
    }
    void lineAdd(Elements elements)
    {
        String t="";
        String[] g;
        String[] f;
        for(Element e:elements) {
            //System.out.println(e.toString());
            t += e.toString();
        }
        g=t.split("<span class=\"js-metro-line t-metrostation-list-header t-icon-metroln ln-*");
        for(int i=1;i<g.length;i++)
        {
            f=g[i].split("\"|>|</span");
            lineNum.add(f[0]);
            lines.add(f[4]);
        System.out.println(f[0]+"  "+f[4]);
        }
    }

}
//<span class="js-metro
//f=g[i].split("\"|data-line=\"*\">");
//        System.out.println(f[0]+"  "+f[2]);