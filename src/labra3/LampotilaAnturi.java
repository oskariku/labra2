
package labra3;

public class LampotilaAnturi {
    
    private int lampotila, min=10, max=30;
    
    public LampotilaAnturi() {
        min=10;
        max=30;
    }
    
    public LampotilaAnturi(int minimi, int maksimi) {
        this.min=minimi;
        this.max=maksimi;
    }
    
    public int getLampotila() {
        lampotila = (int) (Math.random()*(max-min)+min);
        return lampotila;
    }
    
}
