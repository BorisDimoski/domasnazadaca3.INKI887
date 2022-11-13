package pc;
import java.util.Scanner;
public class PC {
    public  int memorija,SSD;
    public  String tipNaMemorija,golemina="GB";
    public PC()
    {
        memorija=2;
        tipNaMemorija="DDR4";
        SSD=256;
    }
    public void zgolemuvanje(int zgolemiMemorija, int novSSD)
    {
        System.out.println("Memorijata bese "+memorija+" "+golemina+", a sega iznesuva "+(memorija+zgolemiMemorija)+" "+golemina+".");
        System.out.println("Tipot na memorijata e "+tipNaMemorija);
        System.out.println("SSD ima golemina od "+(SSD+novSSD)+" "+golemina+". Prethodno iznesuvase "+SSD+" "+golemina+".");
    }}