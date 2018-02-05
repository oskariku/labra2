
package labra3;
import java.util.Scanner;

public class KeskiarvoFor {
    static Scanner lukija = new Scanner(System.in);
    
    
    
    
    
    
    public static void main(String[] args) {
        
        int luku;
        double keskiarvo, summa=0;
        
        System.out.println("Lasketaan kokonaislukujesi keskiarvo!");
        

        for (int i=1; i<=5; i+=1) {
            System.out.print("Syötä " + i + ". luku: ");
            luku=lukija.nextInt();
            summa = summa + luku;

        }   
        
        keskiarvo = summa / 5;
        System.out.println("Keskiarvo: "+ keskiarvo);
        
    }   
}
