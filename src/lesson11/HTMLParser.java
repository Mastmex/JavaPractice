package lesson11;


import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
/**/
public class HTMLParser {
    Document html;
    public HTMLParser()
    {
        int i=0;
        try {
             html = Jsoup.connect("https://www.mirea.ru").get();

             Elements elements = html.select("img");
             for(Element ea: elements)
             {
                 i++;
                 if(ea.absUrl("src").equals(""))
                     continue;
                 URL url = new URL(ea.absUrl("src"));
                 InputStream in = new BufferedInputStream(url.openStream());
                 ByteArrayOutputStream out = new ByteArrayOutputStream();
                 byte[] buf = new byte[20000];
                 int n = 0;
                 while (-1!=(n=in.read(buf)))
                 {
                     out.write(buf, 0, n);
                 }
                 out.close();
                 in.close();
                 byte[] response = out.toByteArray();
                 FileOutputStream fos = new FileOutputStream("./images/"+this.namer(ea.absUrl("src")));
                 fos.write(response);
                 fos.close();
             }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    String namer(String s)
    {
        String[] c =s.split("/");
        String p="Name_notFounded";
        String l="NULL";
        for(String t:c)
        {
            p=t;
        }
        c=p.split("\\.");
        for(String t:c)
        {
            l=t;
        }
        if(l.equals("jpg")||l.equals("png")||l.equals("bmp"))
        return p;
        else return "Name_not_founded.jpg";
    }
}
