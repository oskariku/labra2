/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labra2;

public class Kissatesti {
    
    public static void main(String[] args) {
    
        Kissa ekaKissa, tokaKissa;
        
        ekaKissa = new Kissa();
        ekaKissa.setNimi("Miuku");
        ekaKissa.setIka(2);
        
        tokaKissa = new Kissa();
        tokaKissa.setNimi("Mauku");
        tokaKissa.setIka(9);
        
        System.out.println(ekaKissa.getNimi()+"-kissan ikä on "+ekaKissa.getIka()+" vuotta.");
            ekaKissa.naukaise();
                System.out.println("\n");
        System.out.println(tokaKissa.getNimi()+"-kissan ikä on "+tokaKissa.getIka()+" vuotta.");
            tokaKissa.naukaise();
                System.out.println("\n");
    }
    
    
    
}
