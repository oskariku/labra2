
package labra3;


public class Noppa {
    public static void main(String[] args) {
    
    int silmaluku, kutonen=0;
    double keskiarvo, summa=0;
    
        System.out.println("Heitetään noppaa 20 kertaa!");
        System.out.println("\n");
    for (int i=1; i<=20; i++) {
        silmaluku = (int) ((Math.random()*6)+1);
        System.out.println(i + ". luku: " + silmaluku);
        summa = summa + silmaluku;
        
        if (silmaluku == 6) {
            kutonen++;
        }
    }
        keskiarvo = summa / 20;
        System.out.println("----------------");
        System.out.println("Kutosia: " + kutonen);
        System.out.println("Keskiarvo: " + keskiarvo);
        
    
}
}