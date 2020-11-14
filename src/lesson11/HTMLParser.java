package lesson11;


import org.jsoup.*;
import org.jsoup.nodes.*;

public class HTMLParser {
    public HTMLParser()
    {
        try {
            Document html = Jsoup.connect("https://www.mirea.ru").get();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
