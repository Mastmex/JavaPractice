package lesson7;

public class One {
    String text ="Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    int sum=0;
    public One(){
        String[] words= text.split("\\s");
       for(String i:words) {
           try {
               sum += Integer.parseInt(i);
           } catch (NumberFormatException e) {
               sum += 0;
           }
       }
    }
    void out()
    {
        System.out.println(sum);
    }
}
