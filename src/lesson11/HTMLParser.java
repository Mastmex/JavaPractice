package lesson11;


import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

public class HTMLParser {
    Document html;
    public HTMLParser()
    {
        try {
             html = Jsoup.connect("https://www.mirea.ru").get();

             Elements elements = html.select("img");
             for(Element ea: elements)
             {
                 System.out.println(ea.absUrl("src"));
             }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
