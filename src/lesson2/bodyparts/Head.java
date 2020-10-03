package lesson2.bodyparts;
import java.lang.Math;

public class Head {
    int N;
    double M;

    public Head(int n, int m) {
        this.N = n;
        this.M = m;
    }
    public void think()
    {
        for(int i=0;i<N;i++) {
            double a = Math.random();
            if (a < 0.1)
                System.out.println("Что разум человека может постигнуть и во что он может поверить, того он способен достичь.");
            else if (a >= 0.1 && a < 0.2)
                System.out.println("Через 20 лет вы будете больше разочарованы теми вещами, которые вы не делали, чем теми, которые вы сделали. Так отчальте от тихой пристани. Почувствуйте попутный ветер в вашем парусе. Двигайтесь вперед, действуйте, открывайте!");
            else if (a >= 0.2 && a < 0.3)
                System.out.println("Победа - это еще не все, все - это постоянное желание побеждать.");
            else System.out.println("Вы слишком глупы, что бы что то придумать");
        }
    }
}
