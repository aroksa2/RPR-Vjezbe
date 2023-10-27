package ba.unsa.etf.rpr.t1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ulaz= new Scanner(System.in);
       int n;
       System.out.println("Unesi broj n: ");
        n=ulaz.nextInt();
        System.out.println("Svi brojevi izmedju 1 i n koji su djeljivi sa svojom sumom cifara: ");
        for(int i=1;i<n;i++) {
            double br=sumaCifara(i);
            if(i%br==0) System.out.println(+ i);
        }
    }
    public static int sumaCifara(int n) {
        int suma=0;
        if(n<0) n*=(-1);
        while(n!=0) {
            int cifra=n%10;
            suma+=cifra;
            n/=10;
        }
        return suma;
    }
}
