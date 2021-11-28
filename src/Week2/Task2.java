package Week2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        float a1 = (float) a;
        System.out.println(a);
        System.out.println(a1);

        float b = scan.nextFloat();
        long b1 = (long) b;
        System.out.println(b);
        System.out.println(b1);

        long c = scan.nextLong();
        int c1 = (int) c;
        System.out.println(c);
        System.out.println(c1);

        int d = scan.nextInt();
        short d1 = (short) d;
        System.out.println(d);
        System.out.println(d1);

        short e = scan.nextShort();
        byte  e1 = (byte) e;
        System.out.println(e);
        System.out.println(e1);


    }
}
