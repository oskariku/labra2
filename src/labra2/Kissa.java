/*
 * Tämä on nk. dataluokka. Tähän ei tule main()-metodia.
 * GETterit ja SETterit ovat luokan metodeja eli toimintoja.
 * 
 */
package labra2;

public class Kissa {
    
    private String nimi, naukaise;
    private int ika;
    
    public Kissa(String Miuku) {
    
        nimi = Miuku;
    }
    public Kissa() {
    
        
    }
    
    
    public void setNimi(String newNimi) {
        nimi = newNimi;
    }
    public void setIka(int newIka) {
        ika = newIka;
    }
    public String getNimi() {
        return nimi;
    }
    public int getIka() {
        return ika;
    }
    public void naukaise() {
        
        if (ika<=3) {
        System.out.println("Miu mau...");
        } else {
            System.out.println("MIAUU MOUU!");
        }
        
        
        
    }
    
}
