package avtomobil;

public class Main {
    public static void main(String[] args) {
        Avtomobil avto = new Avtomobil("Ford", "Fiesta","Bela",520,2020,1234);
        System.out.println("Primer na kola:");
        System.out.println(avto.marka+" "+avto.model+" "+avto.boja+" "+avto.pominatiKm+"km "+ avto.godinaNaProizvodstvo+" "+avto.registracija);
        System.out.println("Prv metod za pecatenje na podatoci: "+avto.pecatiPodatoci(avto.marka, avto.model,avto.boja));
        System.out.println("Vtor metod za pecatenje na pominati kilometri+1520.25: "+avto.pominatiKmplus(avto.pominatiKm));
    }}
