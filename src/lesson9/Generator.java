package lesson9;

public class Generator {
    static char[] allowed={'A','B','E','K','M','H','O','P','C','T','Y','X'};
    public String generate()
    {
        String num="";

        int N=(int)(Math.random()*10);
        int R=1+(int)(Math.random()*199);
        int index=(int)(Math.random()*12);
        num+=allowed[index];
        num=num+N+N+N;
        for(int i=0;i<2;i++)
        {
            index=(int)(Math.random()*12);
            num+=allowed[index];
        }
        num+=R;
        return num;
    }
}
