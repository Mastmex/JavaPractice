package lesson4;
import java.util.*;


public class Employee implements Comparable<Employee>{
    String name,sName,dlj;
    int okl;
    Employee(String N,String SN,String DL,int O)
    {
        this.name=N;
        this.sName=SN;
        this.dlj=DL;
        this.okl=O;
    }
    public int compareTo(Employee comparestu) {
        int compareage = ((Employee) comparestu).okl;
        return this.okl - compareage;
    }
    @Override
    public String toString(){
        System.out.println(okl+" "+dlj);
        return(okl+" "+dlj);
    }
    /*public int compareTo(Employee o)
    {
        return this.okl.compareTo(o.okl);
    }*/
}

