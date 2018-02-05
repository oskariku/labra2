
package labra3;

public class TestaaLampotila {
    
    public static void main(String[] args) {
        
        LampotilaAnturi ekaAnturi = new LampotilaAnturi();
        LampotilaAnturi tokaAnturi;
        tokaAnturi = new LampotilaAnturi(-30, 0);
        
        System.out.println("Lämpötila ekaAnturi: " + ekaAnturi.getLampotila() + " astetta.");
        System.out.println("Lämpötila tokaAnturi: " + tokaAnturi.getLampotila() + " astetta.");
        
    }
    
}
