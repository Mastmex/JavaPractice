import lesson4.Company;
import lesson4.Employee;
import java.util.List;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*first x = new first();
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] : " + args[i]);
            }
            x.forx();
            x.whilex();
            x.dowhilex();
            x.garmx();
            x.rand1();
            x.rand2();
            x.fact();

        shape fig = new shape(in.nextInt(),in.nextLine());
        fig.tostring();
        Dog g=new Dog(7,"Alice");
        System.out.println(g.getName());
        System.out.println(g.getAge());
        System.out.println(g.getHumanAge());
        System.out.println(g.ToString());
        g.bork();
        nursery gg=new nursery();
        gg.AddDog(in.nextInt(),in.nextLine());
        gg.NumOfDogs();
        gg.DogsDescribe();
        gg.OpenDoors();*/
        /*Circle circ=new Circle();
        circ.setR(in.nextDouble());
        System.out.println("Радиус="+circ.getR());
        System.out.println("Диаметр="+circ.getD());
        System.out.println("Длина окружности="+circ.getC());
        System.out.println("Площадь="+circ.getS());
        System.out.println("-----------------------------------");
        Human loh = new Human(10,"Arsen");
        loh.Hd.think();
        loh.Hnd.clap();
        loh.Hnd.wash();
        loh.Lg.go();
        loh.Lg.stop();
        Book hook = new Book("Karol","Alice in Wonderland","1865",true);
        hook.info();
        lesson3.shapes.bank.Circle ya = new lesson3.shapes.bank.Circle(in.nextDouble());
        ya.calcArea();
        ya.calcPerimeter();
        Rectangle lyousha = new Rectangle(in.nextDouble(),in.nextDouble());
        lyousha.calcArea();
        lyousha.calcPerimeter();
        Triangle biba = new Triangle(in.nextDouble(),in.nextDouble(),in.nextDouble());
        biba.calcArea();
        biba.calcPerimeter();*/
        String a;
        Company kartoshka = new Company(180,80,10);
        List<Employee> print1 = kartoshka.getTopSalaryStaff(10);
        for(int i=0;i<10;i++) {
            a = print1.get(i).toString();
        }
        System.out.println("-------------------------------------------------");
        List<Employee> print2 = kartoshka.getLowestSalaryStaff(30);
        for(int i=0;i<30;i++) {
            a = print2.get(i).toString();
        }
        System.out.println("AfterFire@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        for(int i=0;i<135;i++)
            kartoshka.fire();
        List<Employee> print3 = kartoshka.getTopSalaryStaff(10);
        for(int i=0;i<10;i++) {
            a = print3.get(i).toString();
        }
        System.out.println("-------------------------------------------------");
        List<Employee> print4 = kartoshka.getLowestSalaryStaff(30);
        for(int i=0;i<30;i++) {
            a = print4.get(i).toString();
        }


    }
}

