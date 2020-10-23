package lesson8;

import java.util.Scanner;

public class Two {
    Scanner in = new Scanner(System.in);
    Two() {
        String x = in.nextLine();
        String[] words;
        words=x.split("\\s");
        switch (words.length){
            case 2:
            {
                System.out.println("Фамилия: "+words[0]);
                System.out.println("Имя: "+words[1]);
            }
            break;
            case 3:
            {
                System.out.println("Фамилия: "+words[0]);
                System.out.println("Имя: "+words[1]);
                System.out.println("Отчество: "+words[2]);
            }
            break;
            default:
                System.out.println("Введенная строка не является ФИО");
                break;
        }


    }
}
