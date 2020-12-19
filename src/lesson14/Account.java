package lesson14;

public class Account
{
    private long money;
    private String accNumber;
    public Account(long a, String l)
    {
        money=a;
        accNumber=l;
    }

    public long getMoney() {
        return money;
    }
    public void minus(long amount)
    {
        money-=amount;
    }
    public  void plus(long amount)
    {
        money+=amount;
    }
}
