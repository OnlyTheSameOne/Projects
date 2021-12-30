import java.util.Scanner;

public class Geldscheinpruefziffer {
    public static void main(String[] args) {
  
     Scanner input = new Scanner(System.in);
    
     System.out.println("Geben sie die genaue Pruefziffer ihres Geldscheines ein.");         //* Abfrage der Prüfziffer der jeweiligen Person
    
     String Ziffer = input.nextLine();                                                       
     int summe = 0;                                                                          //* deklarieren der char und int Daten- Zifferntypen
     char c = Ziffer.charAt(1);
     char c2 = Ziffer.charAt(0);
     
     if ((c-'A')>=0) {
         int ascii=(int) c2;                                                                        //* integer ascii wird in integer.parseInt umgewandelt
         int pos = ascii - 65 + 1;
         int ascii2=(int) c;
         int pos2 = ascii2 - 65 + 1;

        for (int i = 2; i < Ziffer.length(); i++) {
            String zeichen = Ziffer.substring(i, i+1);                                                  //* Ließt die restliche zahlenreihe ab 2
            int zeichenAlsZahl = Integer.parseInt(zeichen);
            summe = summe + zeichenAlsZahl;
        
        }
        int summe2= summe+pos+pos2;
        int rest = summe2%9;
        int pruefziffer = 7-rest;
        System.out.println(pruefziffer);
        
       } else {
         int ascii3=(int) c2;                                                                        //* integer ascii wird in integer.parseInt umgewandelt
         int pos = ascii - 65 + 1;
         int ascii2=(int) c;
         int pos2 = ascii2 - 65 + 1;
      
      for (int i = 2; i < Ziffer.length(); i++) {
            String zeichen = Ziffer.substring(i, i+1);                                                  //* Ließt die restliche zahlenreihe ab 2
            int zeichenAlsZahl = Integer.parseInt(zeichen);
            summe = summe + zeichenAlsZahl;
       
         } 
        int summe2= summe+pos+pos2;
        int rest = summe2%9;
        int pruefziffer = 8-rest;
        System.out.println(pruefziffer);
      }
  
      
      } 

  }