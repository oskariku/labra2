
package labra3;

public class Mittari {
    
        private int lampotila;
        LampotilaAnturi anturi;
        
        public Mittari(LampotilaAnturi anturi) {
            this.anturi=anturi;
        }
    
    public void nayta() {
        lampotila = anturi.getLampotila();
        System.out.println("Lämpötila: " + lampotila);
    }
    
}
