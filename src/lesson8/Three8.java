package lesson8;

import lesson7.Three;

import java.util.*;


public class Three8 {
    Map<String,String> x= new HashMap<>();

    Scanner in = new Scanner(System.in);
    boolean check;
    public Three8()
    {
        while(true) {
            Three phone = new Three();
            String text = in.nextLine();
            if(text.equals("EXIT"))
                break;
            if(text.equals("LIST"))
            {
                list(x);
                continue;
            }
            if(phone.check(text))
            {
                if(x.containsKey(phone.additional()))
                    System.out.println(phone.additional() +" ---> "+x.get(phone.additional()) );
                else {
                    System.out.println("Введите имя владельца номера:");
                    x.put(phone.additional(),in.nextLine());
                }
            }
            else{
                if(x.containsValue(text))
                    System.out.println(getKeyByValue(x,text)+" ---> "+ text);
                else{
                    while(true) {
                        System.out.println("Новый контакт, введите номер телефона: ");
                        Three t = new Three();
                        String l = in.nextLine();
                        if (t.check(l)) {
                            x.put(t.additional(), text);
                            break;
                        }
                        else
                            System.out.println("Введите корректный номер");
                    }
                }
            }
        }
    }
    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
    static <T,E> void list(Map<String, String> map)
    {
        map.entrySet().stream().sorted(Map.Entry.<String, String>comparingByValue()).forEach(System.out::println);
        /*for(Map.Entry<T, E> entry : map.entrySet())
        {
            System.out.println(entry.getKey() +" ---> "+ entry.getValue());
        }*/
    }
}
