package lesson5.problem9;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    String name;
    String sName;
    Date bDay;
    String adress;
    int num;
    int salary;
    public Employee(String n, String sn, int d,int m, int y, String a, int nom, int s)
    {
        name=n;
        sName=sn;
        GregorianCalendar calendar = new GregorianCalendar(y, m - 1, d);
        bDay = calendar.getTime();
        num=nom;
        salary=s;
        adress=a;
    }
    public Employee()
    {
        String[] namePack={"John","Jack","Mike","Sam","Lester","Bonny","Freddy","Brian","Charlie","Rodger","Alice","Samantha","Amanda","Peter"};
        String[] sNamePack={"Brown","Mercury","Taylor","May","Deacon","Biggs","Parker","Osborn","Smith"};
        String[] streetPack={"Baker","Oxford","Piccadilly","Carnaby","Whitehall","Downing","Bond"};
        int n = (int) (Math.random()*13);
        int sn =(int) (Math.random()*9);
        int d = (int)(Math.random()*29);
        int m =(int)(Math.random()*12);
        int y=(int)(Math.random()*50)+1951;
        int a =(int)(Math.random()*7); ;

        name=namePack[n];
        sName = sNamePack[sn];
        GregorianCalendar calendar = new GregorianCalendar(y, m, d);
        bDay = calendar.getTime();
        num=(int)(8_000_000_00+Math.random()*1_000_000_00);
        salary=(int)(50000+Math.random()*50000);
        adress=streetPack[a]+" Street, "+(int)(Math.random()*228);
    }

    public Date getbDay() {
        return bDay;
    }

    public int getNum() {
        return num;
    }

    public int getSalary() {
        return salary;
    }

    public String getAdress() {
        return adress;
    }

    public String getName() {
        return name;
    }

    public String getsName() {
        return sName;
    }
    public int getYear()
    {
        return 1900+this.bDay.getYear();
    }
    @Override
    public String toString()
    {
        return(name +" "+sName+"; "+ bDay+"; "+adress+"; "+salary+"; "+num);
    }
}
