package lesson1;

public class Dog {
    String name;
    int age;
    int humanAge;
    Dog(int a, String n){
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
