package lesson1;

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
    double[] sort(double[] a){
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
