package Week2;
import java.util.Random;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt();
        if (r<=2){
            r=r*(-1);
        }
        r = r%6;
        r+=2;
        System.out.println(r);
    }
}
