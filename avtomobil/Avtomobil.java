package avtomobil;

public class Avtomobil {
    public String marka,model,boja;
    public int pominatiKm,godinaNaProizvodstvo,registracija;
    public Avtomobil(String marka, String model, String boja, int pominatiKm, int godinaNaProizvodstvo, int registracija)
    {
        this.marka=marka;
        this.model=model;
        this.boja=boja;
        this.pominatiKm=pominatiKm;
        this.godinaNaProizvodstvo=godinaNaProizvodstvo;
        this.registracija=registracija;
    }
    public String pecatiPodatoci(String mar, String mod, String boja)
    {
        return mar+" "+mod+" "+boja;
    }
    public double pominatiKmplus(int pkm)
    {
        return pkm+1520.25;
    }}