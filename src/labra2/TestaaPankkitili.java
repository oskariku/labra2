
package labra2;


public class TestaaPankkitili {
    
    public static void main(String[] args) {
    
        Pankkitili tili;
        tili = new Pankkitili(1000);
        
        
        System.out.println("Tilin saldo: " + tili.getRahaMaara() + " euroa.");
    }
    
}
