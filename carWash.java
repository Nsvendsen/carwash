import java.util.*;
import java.io.*;

public class carWash {

<<<<<<< HEAD
    public static double economy = 0;
    public static double standard = 0;
    public static double deluxe = 0;
    public static double offer = 0;
=======
    public static double economy = 200;
    public static double standard = 400;
    public static double deluxe = 1000;
    public static double rabat = 0.8;
    public static double saldo = 0;
    public static String bruger = "";
>>>>>>> origin/master

    public static void main(String[] args) {

        login();

    }

    public static void login() 
    {

    }
<<<<<<< HEAD
   
   public static void ChangePrices()
   {
      Scanner sc = new Scanner (System.in);
         
      System.out.println("indtast nye priser p� economy");
      economy = sc.nextDouble();
      
      System.out.println("indtast nye priser p� standard");
      standard = sc.nextDouble();
      
      System.out.println("indtast nye priser p� deluxe");
      deluxe = sc.nextDouble();
            
      System.out.println("Ny pris p� economy = " + economy);
      System.out.println("Ny pris p� standard = " + standard);
      System.out.println("Ny pris p� deluxe = " + deluxe);
      
     
    }
   public static void ChangeOffer()
   {
      Scanner sc = new Scanner (System.in);
      
      System.out.println("Indtast ny rabat");
      offer = sc.nextDouble();
      
      System.out.println("Ny rabat = " + offer);
      
      
   }
}

=======
    
    
    public static void ReadPrice()
    {
       try {
       Scanner input = new Scanner(new File("Admin.txt"));
       while (input.hasNextLine()) 
           {
               String linje = input.nextLine();
               String[] linjesplit = linje.split(" ");
               if (linjesplit[0].equals("economy:"))
               {
                  economy = Double.parseDouble(linjesplit[1]);
                  return;
               }
               if (linjesplit[0].equals("standard:"))
               {
                  standard = Double.parseDouble(linjesplit[1]);
                  return;
               }
               if (linjesplit[0].equals("deluxe:"))
               {
                  deluxe = Double.parseDouble(linjesplit[1]);
                  return;
               }
               if (linjesplit[0].equals("rabat:"))
               {
                  Double rabatbeforecalc = Double.parseDouble(linjesplit[1]);
                  rabat = (100-rabatbeforecalc)/100;
                  return;
               }
           }
       }
       catch(FileNotFoundException e) {
        e.printStackTrace();
       }
    }

}
>>>>>>> origin/master
