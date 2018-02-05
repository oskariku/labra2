
package labra2;

public class Lompakko {
    
    private double rahamaara;
    
    public Lompakko(double uusiRahamaara) {
    this.rahamaara=uusiRahamaara;
    }
    public Lompakko() {
        
    }
    
    public void setRahamaara(double uusiRahamaara) {
        rahamaara=uusiRahamaara;
    }
    public double getRahamaara() {
         return rahamaara;      
    }
    public void lisaa(double pano) {
        rahamaara+=pano;
    }
    public boolean vahenna(double nosto) {
        if (rahamaara>=nosto) {
            rahamaara-=nosto;
            return true;
        } else {
            System.out.println("Ei tarvittavaa määrää lompakossa nostolle.");
            return false;
        }
    }
}
