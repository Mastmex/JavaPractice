package lesson5.problem9;

public class Name implements HandleEmployees{
    String name;

    public void Name(String name) {
        this.name = name;
    }

    @Override
    public boolean handleEmployees(Employee employee) {
        return employee.getName()==name;
    }
}
