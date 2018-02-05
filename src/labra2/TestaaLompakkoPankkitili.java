
package labra2;
import java.util.Scanner;

public class TestaaLompakkoPankkitili {
    static Scanner lukija = new Scanner(System.in);
    public static void main(String[] args) {
        
        double rahaaLompsassa, lihis;
        
        Lompakko kolmasLompsa;
        kolmasLompsa=new Lompakko();
        kolmasLompsa.setRahamaara(0);
        
        System.out.println("Paljonko lompakkoon laitetaan rahaa?");
        System.out.print("Syötä määrä euroissa: ");
        rahaaLompsassa=lukija.nextDouble();
        
        kolmasLompsa.setRahamaara(rahaaLompsassa);
        System.out.println("Lompakossa on " + kolmasLompsa.getRahamaara() + " euroa");
    
        System.out.print("Paljonki lihis maksaa? ");
        lihis=lukija.nextDouble();
        
        if (rahaaLompsassa >= lihis) {
            System.out.println("Onneksi olkoon! Ostit juuri lihapiirakan!");
            kolmasLompsa.vahenna(lihis);

        } else {
            double puuttuu = lihis - rahaaLompsassa;
            System.out.println("Sinulla on " + kolmasLompsa.getRahamaara() + " euroa");
            System.out.println("Sinulta puuttuu " + puuttuu + " euroa.");
            System.out.println("Aika alkaa paastolle!");
        }
        System.out.println("Lompakossasi on jäljellä " + kolmasLompsa.getRahamaara() + " euroa");
        
    }
    
}
