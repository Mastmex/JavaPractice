package lesson5.problem9;

public class Salary implements HandleEmployees {
    private int salary;
    public void Salary(int s){salary=s;}
    @Override
    public boolean handleEmployees(Employee employee) {
        return employee.getSalary()>=this.salary;
    }
}
