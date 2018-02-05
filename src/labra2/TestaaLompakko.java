
package labra2;
import java.util.Scanner;
public class TestaaLompakko {
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Lompakko ekaLompsa, tokaLompsa;
        
        ekaLompsa = new Lompakko();
        ekaLompsa.setRahamaara(750);
        
        tokaLompsa = new Lompakko();
        tokaLompsa.setRahamaara(145.25);
        
        
        System.out.println("Ensimmäisessä(1) lompakossa on " + ekaLompsa.getRahamaara() + " euroa");
        System.out.println("Toisessa(2) lompakossa on " + tokaLompsa.getRahamaara() + " euroa");
        
         System.out.print("Lisää ensimmäiseen(1) lompakkoon euroja: ");
         double pano = lukija.nextDouble();
         
         ekaLompsa.lisaa(pano);
         System.out.println("Toisessa lompakossa on " + ekaLompsa.getRahamaara() + " euroa");
         
         
         System.out.print("Vähennä toisesta(2) lompakosta euroja: ");
         double nosto = lukija.nextDouble();
         
         
         tokaLompsa.vahenna(nosto);
         System.out.println("Toisessa(2) lompakossa on " + tokaLompsa.getRahamaara() + " euroa");
         
         
         System.out.print("Toista: Vähennä toisesta(2) lompakosta euroja: ");
         double uusiNosto = lukija.nextDouble();
         tokaLompsa.vahenna(uusiNosto);
         
         System.out.println("Toisen(2) lompakon rahamäärä on " + tokaLompsa.getRahamaara() + " euroa");
         
}
}