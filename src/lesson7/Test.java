package lesson7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        One x = new One();
        x.out();
        Two y = new Two();
        Three t = new Three();
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
       if(t.check(text))
           System.out.println(t.additional());
       else
           System.out.println("Неверный формат номера");
    }
}
