package lesson2;

public class test {
    public static void main(String[] args) {
        Human x = new Human(10,"Arsen");
        x.Hd.think();       //По какой-то причине IDEA подчеркивает данное место,
        x.Hnd.clap();       //но на самом деле все компилируется
        x.Hnd.wash();
        x.Lg.go();
        x.Lg.stop();
    }
}
