
package labra3;

public class TestaaMittari {
    
    public static void main(String[] args) {
        
        LampotilaAnturi anturi = new LampotilaAnturi();
        Mittari ekaMittari = new Mittari(anturi);
        
        ekaMittari.nayta();
        
    }
    
}
