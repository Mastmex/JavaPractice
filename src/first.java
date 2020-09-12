import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class first {
    int[] arr = {5, 5, 7, 1, 6, 7, 8, 2, 14, 5};
    int sum;
    void forx() {
        sum = 0;
        for (int i = 0; i < 10; i++) {
            this.sum = this.sum + this.arr[i];
        }
        System.out.println("For cycle: "+this.sum);
        System.out.println("-------------------------------");
    }
    void whilex(){
        int i=0;
        this.sum=0;
        while(i<10)
        {
            this.sum+=this.arr[i];
            i++;
        }
        System.out.println("While cycle: "+this.sum);
        System.out.println("-------------------------------");
    }
    void dowhilex(){
        this.sum=0;
        int i=9;
        do{
            this.sum+=this.arr[i];
            i--;
        }while(i>-1);
        System.out.println("Do-While cycle: "+this.sum);
        System.out.println("-------------------------------");
    }
    void garmx(){
        double garm;
        double id;
        for(int i=1;i<11;i++)
        {
            id=i;
            garm = 1/id;
            System.out.println(i+" harmonic number:"+ garm);
        }
        System.out.println("-------------------------------");
    }
    double[] sort(double a[]){
        double[] b =a;
        double length=a.length;
        double temp;
        for(int i=0;i<length;i++)
            for(int j=0;j<length-1;j++)
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

        return b;
    }
    void rand1(){
        double arrr[]=new double[10];
        double arrs[]=new double[10];
        for(int i=0;i<10;i++)
        {
            arrr[i]=Math.random()*24;
            System.out.println("Random1: "+(int)arrr[i]);
        }
        arrs=sort(arrr);
        for(int i=0;i<10;i++)
        {
            System.out.println("Sorted1: "+(int)arrs[i]);
        }
        System.out.println("-------------------------------");
    }
    void rand2(){
        double arrr[]=new double[10];
        double arrs[]=new double[10];
        Random rand = new Random();
        for(int i=0;i<10;i++)
        {
            arrr[i]= rand.nextDouble()*24;
            System.out.println("Random2: "+(int)arrr[i]);
        }
        arrs=sort(arrr);
        for(int i=0;i<10;i++)
        {
            System.out.println("Sorted2: "+(int)arrs[i]);
        }
        System.out.println("-------------------------------");
    }
    void fact(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
            fact*=i;
            System.out.println("Factorial: "+fact);
        System.out.println("-------------------------------");
    }
}

class shape{
    String name;
     int ugl;
     shape(int u, String n)
     {
         this.name=n;
         this.ugl=u;
     }
     void tostring(){
         System.out.println("Это "+name+". У него "+ugl+" углов.");
     }
}
class dog{
    String name;
    int age;
    int humanAge;
    dog(int a, String n){
        this.name=n;
        this.age=a;
        this.humanAge=this.age*8;
    }
    int getAge()
    {
        return this.age;
    }
    String getName()
    {
        return this.name;
    }
    int getHumanAge()
    {
        return this.humanAge;
    }
    String ToString(){
        return "My name is "+this.name+". I'm "+this.age+" years old. My human age is "+this.humanAge+".";
    }
    void bork(){
        do
        System.out.println("Bork!!");
        while(Math.random()>=0.4);
        if(Math.random()<=0.1)
            System.out.printf("Эх, жизнь… Жизнь собачья. Весь день на цепи… Всю ночь на цепи… Всю жизнь на цепи. Сиди, охраняй. А что охранять? Дрова были, так и те вчера украли. Всё, воровать больше нечего. Дрова украли, а спрос с меня: «Куда смотрел?», «На что ты здесь посажен?» То-то и оно, что посажен, мне до дров не дотянуться, цепь не пускает. Вот дрова все и вынесли. Дома надо ночевать, а не в гостях. Кого мне было ночью будить? Соседей? Так соседи же дрова и свистнули. ");
    }
}
class nursery{
     public dog[] dogs = new dog[10];
    int count=3;
    nursery(){
        dogs[0]=new dog(4,"Rina");
        dogs[1]=new dog(9,"Einstein");
        dogs[2]=new dog(10,"Kirill");
    }
    void AddDog(int a, String n)
    {
        dogs[count++]=new dog(a,n);
    }
    int NumOfDogs()
    {
        return dogs.length;
    }
    void DogsDescribe(){
        for(int i=0;i<4;i++)
            System.out.println(dogs[i].ToString());
    }
    void OpenDoors()
    {
        for(int i=0;i<4;i++)
            dogs[i].bork();

    }
}
class ard {
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
        dog g=new dog(7,"Alice");
        System.out.println(g.getName());
        System.out.println(g.getAge());
        System.out.println(g.getHumanAge());
        System.out.println(g.ToString());
        g.bork();*/
        nursery gg=new nursery();
        gg.AddDog(in.nextInt(),in.nextLine());
        gg.NumOfDogs();
        gg.DogsDescribe();
        gg.OpenDoors();
    }
}

