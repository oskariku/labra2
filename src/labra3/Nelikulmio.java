
package labra3;
import java.util.Scanner;

public class Nelikulmio {
    
    static Scanner lukija = new Scanner(System.in);
    
        public static void main(String[] args) {

        
            int leveys, korkeus;
            char merkki;
        
            System.out.print("Leveys: ");
            leveys=lukija.nextInt();
            System.out.print("Korkeus: ");
            korkeus=lukija.nextInt();
            System.out.print("Merkki: ");
            merkki=lukija.next().charAt(0);
            
            for (int i=1; i<=korkeus; i++) {
                System.out.println("");
                for (int j=1; j<=leveys; j++) {
                    System.out.print(merkki);
                }
            }
            System.out.println("");
    }
    
}
