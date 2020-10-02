package lesson4;

public class Operator implements EmployeePosition {
    public String getJobTitle() {
        return "Operator";
    }

    public int calcSalary(int baseSalary) {
        return baseSalary;
    }
}
