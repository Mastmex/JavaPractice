package lesson4;
import java.util.*;

public class Company {
    ArrayList<Employee> kartoha = new ArrayList<Employee>();
    int all;
    int In;
    int op=0,mg=0,tmg=0;
    int basesalary=50000;
    public Company(int o, int m, int tm){
        all=o+m+tm;
        In=this.getIncome();
        for(int i=0;i<o;i++) {
            op++;
            Operator O=new Operator();
            kartoha.add(new Employee("Operator"," "+i+1,O.getJobTitle(),O.calcSalary(basesalary)));
        }
        for(int i=0;i<m;i++)
        {
            mg++;
            Manager M = new Manager(In);
            kartoha.add(new Employee("Manager", " "+i+1,M.getJobTitle(),M.calcSalary(basesalary)));
        }
        for(int i=0;i<tm;i++)
        {
            tmg++;
            TopManager TM = new TopManager(In);

            kartoha.add(new Employee("Top", "Manager  "+i+1,TM.getJobTitle(), TM.calcSalary(basesalary)));
        }
    }
    public void hire()
    {
        Operator O=new Operator();
        kartoha.add(new Employee("Operator"," "+(++op),O.getJobTitle(),O.calcSalary(basesalary)));
    }
    public void hireAll(int num)
    {
        for(int i=0;i<num;i++) {
            op++;
            Operator O=new Operator();
            kartoha.add(new Employee("Operator"," "+i+1,O.getJobTitle(),O.calcSalary(basesalary)));
        }
    }
    public void fire()
    {
        kartoha.remove((int)(Math.random()*all));
        all--;
    }
    int getIncome()
    {
        int sum=0;
        for(int i=0;i<all;i++)
         sum+=(int)(115000+Math.random()*25000);
        return sum;
    }

    public List getTopSalaryStaff(int count){
    List<Employee> tr= kartoha;
        Collections.sort(tr,Collections.reverseOrder());
        List<Employee> ret = new ArrayList<Employee>();
        for(int i=0;i<count;i++) {
            ret.add(i,tr.get(i));
        }
        return ret;
    }
    public List getLowestSalaryStaff(int count){
        List<Employee> tr= kartoha;
        Collections.sort(tr);
        ArrayList<Employee> ret = new ArrayList<Employee>();
        for(int i=0;i<count;i++) {
            ret.add(i,tr.get(i));
        }
        return ret;
    }
}
