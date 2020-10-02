package lesson4;

public class TopManager implements EmployeePosition {
    boolean flag=false;
    public String getJobTitle() {
        return "TopManager";
    }
    TopManager(int sum)
    {
        if (sum>=10000000)
            flag=true;
    }

    public int calcSalary(int baseSalary) {
        if(flag)
            return baseSalary+(int)(1.5*baseSalary);
        else
            return baseSalary;
    }
}
