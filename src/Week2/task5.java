package Week2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age>=18){
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }

    }
}
