
package labra3;
import java.util.Scanner;

public class ToistaTeksti {
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
        
       String teksti;
       int lkm;
       
        System.out.print("Syötä tulostettava teksti: ");
        teksti = lukija.nextLine();
        System.out.print("Tulosteiden lkm: ");
        lkm = lukija.nextInt();
        System.out.println("---------------------------------------");
        
        for (int i=1; i<=lkm; i++) {
            System.out.println(teksti);
        }
        
    }
    
}
