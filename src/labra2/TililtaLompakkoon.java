
package labra2;
import java.util.Scanner;

public class TililtaLompakkoon {
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        Pankkitili tili;
        tili = new Pankkitili(1000);
        double tilinSaldo = tili.getRahaMaara();
        
        double nosto;
        
        Lompakko testiLompakko;
        testiLompakko = new Lompakko();
        testiLompakko.setRahamaara(50);
        
        System.out.println("Paljonko haluat nostaa tilitä rahaa?");
        System.out.print("Nosto: ");
        nosto = lukija.nextDouble();
        
        
        if (nosto <= tilinSaldo) {
            tili.vahenna(nosto);
            testiLompakko.lisaa(nosto);
            System.out.println("Nosto tililtä onnistui.");
        } else {
            System.out.println("Tilillä ei riittävästi rahaa nostettavksi.");
        }
        
        System.out.println("Saldo tili: " + tili.getRahaMaara());
        System.out.println("Saldo lompakko: " + testiLompakko.getRahamaara());
        
    }
    
}
