package fakultet;
import java.util.Scanner;
public class Main {
    public static void main (String[] args)
    {
        Scanner vnesi = new Scanner(System.in);
        Fakultet obj1 = new Fakultet();
        Fakultet obj2 = new Fakultet();
        obj1.nazivNaFakultet="FIKT";
        obj1.dekan="Aleksandar Markoski";
        obj1.sediste="Bitola";
        obj1.brojNaSmerovi=8;
        obj1.brojNaStudenti=200;
        obj2.nazivNaFakultet="FINKI";
        obj2.dekan="Boro Jakimovski";
        obj2.sediste="Skopje";
        obj2.brojNaSmerovi=8;
        obj2.brojNaStudenti=300;
        System.out.println("Prv falkutet");
        System.out.println(obj1.nazivNaFakultet+" "+obj1.sediste+" "+obj1.dekan+" "+obj1.brojNaStudenti+" "+obj1.brojNaSmerovi);
        System.out.println("Vtor falkutet");
        System.out.println(obj2.nazivNaFakultet+" "+obj2.sediste+" "+obj2.dekan+" "+obj2.brojNaStudenti+" "+obj2.brojNaSmerovi);
        System.out.println("Vnesi vrednost za namaluvanje na studenti");
        int a = vnesi.nextInt();
        vnesi.close();
        System.out.print("Zgolemena za 50 :");
        obj1.zgolemuvanjeBrojStudenti();
        System.out.println("Namalena za "+a+" :"+obj1.namaluvanjBrojStudenti(a));
        obj1.pecatiinf();
        System.out.print("Zgolemena za 50 :");
        obj2.zgolemuvanjeBrojStudenti();
        System.out.println("Namalena za "+a+" :"+obj2.namaluvanjBrojStudenti(a));
        obj2.pecatiinf();
    }
}