
package labra2;


public class Pankkitili {
    
    private double rahaMaara;
    
    public Pankkitili(double rahaMaara) {
        this.rahaMaara=rahaMaara;
    }

    public double getRahaMaara(){
        return rahaMaara;
    }
    public void lisaa(double pano){
        this.rahaMaara+=pano;
    }
    public boolean vahenna(double nosto) {
        if (rahaMaara>=nosto) {
            rahaMaara = rahaMaara - nosto;
            return true;
        } else {
            System.out.println("Tilin saldo liian alhainen.");
            return false;
        }
    }
    
}
