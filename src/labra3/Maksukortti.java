
package labra3;
import labra2.Pankkitili;

public class Maksukortti {
    
    Pankkitili pankkitili;
    private int pinKoodi;
    private double rahaMaara;
    
    public Maksukortti() {
    }
    public Maksukortti(int pinKoodi) {
        this.pinKoodi=pinKoodi;
    }

    public int getPinKoodi() {
        pinKoodi=1234;
        return pinKoodi;
    }
    public void setPankkitili(Pankkitili uusiTili) {
        this.pankkitili = uusiTili;
    }
    public boolean maksa(double maksu) {
        if (pankkitili.getRahaMaara() >= maksu) {
            rahaMaara=rahaMaara-maksu;
            return true;
        } else {
            return false;
        }
    }
    
    
}
