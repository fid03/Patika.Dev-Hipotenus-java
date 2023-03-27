package patikaDev;

import java.util.Scanner;

public class Hipetenus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Kenar giriniz");
        int a=sc.nextInt();
        System.out.println("2.Kenar giriniz");
        int b=sc.nextInt();
        double c=Math.sqrt((a*a)+(b*b));
        System.out.println("1.Kenar="+a);
        System.out.println("2.Kenar="+b);
        System.out.println("Hipotenus="+c);
    }
}
