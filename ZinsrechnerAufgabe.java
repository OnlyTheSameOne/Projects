import java.util.Scanner; // Scanner inportiert

public class ZinsrechnerAufgabe{
  public static void main(String[]args){
    
    double kapital;      // Datentypen deklariert
    double zinssatz;
    double gesamtwert;
    int laufzeit;
    double EndBetrag;
  Scanner input = new Scanner(System.in);  // Scanner erzeugt
    
    System.out.println("Bitte geben sie ihr Kapital ein");
    kapital = input.nextDouble();                             // Eingabe des Kapitals vom User
    gesamtwert = kapital;
    System.out.println("Bitte geben sie ihren Zinsatz ein");
    zinssatz = input.nextDouble();                            // Eingabe des Zinssatzes vom User
    System.out.println("Bitte Laufzeit in eingeben");

    laufzeit = input.nextInt();
    
    for (int i = 1; i <= laufzeit; i++) {                     // 
      gesamtwert = gesamtwert + (gesamtwert * zinssatz /100);
      System.out.println("Kapital nach dem "+i+". Jahr "+gesamtwert);
    }
    





  } 
}
