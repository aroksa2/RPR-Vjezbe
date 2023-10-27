package org.example;
import java.util.Scanner;

 class Faktorijel {
    public static long fakt(int n) {
        if(n==0 || n==1) return 1;
        long broj=1;
        for(int i=2;i<=n;i++) {
            broj*=i;
        }
        return broj;
    }
}
 class Sinus {
    public static double sin(double n) {
        return Math.sin(n);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner unos=new Scanner(System.in);
    System.out.println("Unesite broj za racunanje faktorijela: ");
    int n1=unos.nextInt();
    long br=Faktorijel.fakt(n1);
    System.out.println("Unesite broj za racunanje sinusa: ");
    double n2=unos.nextDouble();
    double br1=Sinus.sin(n2);
    System.out.println("Faktorijel unesenog broja iznosi "+br);
    System.out.println("Sinus unesenog broja iznosi "+br1);
    unos.close();
    }
}