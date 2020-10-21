package lesson5.problem9;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    ArrayList<Employee> kartoha;
    public Company(){
        kartoha = new ArrayList<Employee>();
    }
    void autoHair(int n)
    {
        for(int i=0;i<n;i++)
        {
            kartoha.add(new Employee());
        }
    }
    void manualHair(String n, String sn, int d,int m, int y, String a, int nom, int s)
    {
        kartoha.add(new Employee(n,sn,d,m,y,a,nom,s));
    }
    void autoFire(int n)
    {
        for(int i=0;i<n;i++)
        kartoha.remove(kartoha.size());
    }
    void manualFire(int n)
    {
        kartoha.remove(n);
    }
    public void findName(HandleEmployees handleEmployee)
    {
        Scanner in = new Scanner(System.in);
        String nm= in.nextLine();
        for(Employee i:kartoha)
        {
            if (i.getName()==nm)
                handleEmployee.handleEmployees()
        }
    }
}
