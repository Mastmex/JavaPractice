package lesson4;

public class Manager implements EmployeePosition {

  int wrk;
  Manager(int sum){
      int a= (int)(115000+Math.random()*25000);
      wrk=a;
  }
    public String getJobTitle() {
        return "Manager";
    }

    public int calcSalary(int baseSalary) {
        return baseSalary+(int)(this.wrk*0.05);
    }
}
