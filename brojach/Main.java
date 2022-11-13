package brojach;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int brojNaFrlanja;

        Brojach brPismo = new Brojach();
        Brojach brGlava = new Brojach();

        Scanner sc = new Scanner (System.in);
        System.out.println("Vnesete broj na frlanja na parichkata: ");
        brojNaFrlanja = sc.nextInt();

        while (brojNaFrlanja > 0) {
            brPismo.reset();
            brGlava.reset();

            for(int i=0; i<brojNaFrlanja; i++)
            {
                if(Math.random() < 0.5)
                    brPismo.zgolemi();
                else
                    brGlava.zgolemi();
            }
            System.out.println("Vo " + brojNaFrlanja + " frlanja");
            System.out.println("Padnaa: " + brPismo.brojach + " pisma");
            System.out.println("Padnaa: " + brGlava.brojach + " glavi");

            System.out.println("Dokolku sakate povtorno frlanje, vnesete broj na frlanja: ");
            brojNaFrlanja = sc.nextInt();

        }
        sc.close();
    }
}
