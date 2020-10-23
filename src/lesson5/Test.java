package lesson5;

import lesson5.problem9.Company;
import lesson5.problem9.Employee;
import lesson5.problem9.HandleEmployees;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Company mirea = new Company();
        mirea.autoHair(10000);
        mirea.findName(
                new HandleEmployees() {
                    @Override
                    public boolean handleEmployees(Employee employee) {
                        System.out.println("Name: "+employee.toString());
                        return true;
                    }
                }
        );
        mirea.yearCheck((Employee employee)->{
            System.out.println("Year: "+employee.toString());
            return true;
        }
        );
    }
}
