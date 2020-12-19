package lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Bank extends Thread
{
    private HashMap<String, Account> accounts = new HashMap<>();
    private final Random random = new Random();
    private  HashSet<String> blocked = new HashSet<>();
    public Bank()
    {
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)
                for(int k=0;k<10;k++)
                    for(int l=0;l<10;l++)
                    {
                        String o=""+i+j+k+l;
                        accounts.put(o,new Account((long)(70000+Math.random()*10000000),o));
                    }
    }
    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
        throws InterruptedException
    {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    /**
     * TODO: реализовать метод. Метод переводит деньги между счетами.
     * Если сумма транзакции > 50000, то после совершения транзакции,
     * она отправляется на проверку Службе Безопасности – вызывается
     * метод isFraud. Если возвращается true, то делается блокировка
     * счетов (как – на ваше усмотрение)
     */
    public void transfer(String fromAccountNum, String toAccountNum, long amount)
    {
        if(!blockCheck(fromAccountNum,toAccountNum))
        {
            System.out.println("One or both accounts are blocked");
            return;
        }
        try {
            if(amount>=50000)
                if(this.isFraud(fromAccountNum,toAccountNum,amount)) {
                    block(fromAccountNum, toAccountNum);
                    return;
                }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (accounts)
        {
            accounts.get(fromAccountNum).minus(amount);
            accounts.get(toAccountNum).plus(amount);
        }
    }
    /**
     * TODO: реализовать метод. Возвращает остаток на счёте.
     */
    public long getBalance(String accountNum)
    {
        return accounts.get(accountNum).getMoney();
    }
    boolean blockCheck(String fromAccountNum,String toAccountNum)
    {
        return blocked.contains(fromAccountNum)&&blocked.contains(toAccountNum);
    }
    void block(String fromAccountNum,String toAccountNum)
    {
        blocked.add(fromAccountNum);
        blocked.add(toAccountNum);
    }
    @Override
        public void run()
    {
        
    }
}
