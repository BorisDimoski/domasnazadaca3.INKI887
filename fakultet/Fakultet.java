package fakultet;

import java.util.Scanner;
public class Fakultet {
    public  String nazivNaFakultet,dekan,sediste;
    public  int brojNaSmerovi,brojNaStudenti;
    public void zgolemuvanjeBrojStudenti()
    {
        brojNaStudenti+=50;
        System.out.println(brojNaStudenti);
    }
    public int namaluvanjBrojStudenti(int namali)
    {
        brojNaStudenti-=namali;
        return brojNaStudenti;
    }
    public void pecatiinf()
    {
        System.out.println(nazivNaFakultet + " " + sediste);
    }
}
