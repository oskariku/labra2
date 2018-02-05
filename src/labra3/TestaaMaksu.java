
package labra3;
import labra2.Pankkitili;
import java.util.Scanner;

public class TestaaMaksu {
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        double maksu;
        
        Maksukortti ekaMaksukortti = new Maksukortti();
        Pankkitili uusiTili = new Pankkitili(1000);
        ekaMaksukortti.setPankkitili(uusiTili);
        uusiTili.getRahaMaara();
        
        int uudelleen;
        int pinkoodi;
        
        System.out.print("Syötä pin-koodi: ");
        pinkoodi=lukija.nextInt();
        
        if (pinkoodi == ekaMaksukortti.getPinKoodi()) {
            System.out.println("Koodi oikein.");
            System.out.print("Syötä maksun suuruus: ");
            maksu = lukija.nextDouble();
            if (maksu <= uusiTili.getRahaMaara()) {
                uusiTili.vahenna(maksu);
                System.out.println("Maksu onnistui.");
            } else {
                System.out.println("Maksutapahtuma keskeytetty.");
                System.out.println("Ei riittävästi rahaa tilillä.");
            }
        } else {
            System.out.println("Väärä pin-koodi.");
            System.out.println("Maksutapahtuma keskeytetty.");
        }
        System.out.println("Rahaa tilillä: " + uusiTili.getRahaMaara() + " euroa.");

    }

    
}
