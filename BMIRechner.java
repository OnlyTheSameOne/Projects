import java.util.Scanner;

public class BMIRechner {

     public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    double koerpergewicht = 0;
    double koerpergroe�e = 0;
    
    System.out.println("Wie viel wiegen Sie in Kilogramm [kg] ?");
    koerpergewicht = input.nextDouble();
    
    System.out.println("Wie gro� sind Sie in Meter [m] (bsp: 1.56) ?");
    koerpergroe�e = input.nextDouble();
    
    double bmi = 0;
    bmi = (koerpergewicht/Math.pow(koerpergroe�e, 2 ));
    System.out.println(bmi);
    
    if (bmi <= 18.5) {
       System.out.println("Sie sind eindeutig zu d�nn!");
       else if (bmi > 18.5 && bmi < 25) {  
        System.out.println("Sie sind normalgewichtig!");
        
        else if (bmi > 25) {   
          System.out.println("Sie sind eindeutig �bergewichtig!");
          
          }

        } 
     } // end of if 
    
   
  } 
}