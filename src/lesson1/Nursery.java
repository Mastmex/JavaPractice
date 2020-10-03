package lesson1;

public class Nursery {
    public Dog[] dogs = new Dog[10];
    int count=3;
    Nursery(){
        dogs[0]=new Dog(4,"Rina");
        dogs[1]=new Dog(9,"Einstein");
        dogs[2]=new Dog(10,"Kirill");
    }
    void AddDog(int a, String n)
    {
        dogs[count++]=new Dog(a,n);
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
