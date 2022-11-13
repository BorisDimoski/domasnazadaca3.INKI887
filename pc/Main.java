package pc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner vnes = new Scanner(System.in);
        PC pc = new PC();
        System.out.println("Vnesi vrednost za zgolemuvanje na memorija");
        int a = vnes.nextInt();
        System.out.println("i SSD");
        int b = vnes.nextInt();

        pc.zgolemuvanje(a,b);
    }
}
