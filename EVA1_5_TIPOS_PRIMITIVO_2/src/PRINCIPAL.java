
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu nombre ");
           String NombreS;
           NombreS = input.nextLine(); 
           
        System.out.println("Ingresa tu Edad ");
           int iEdad;
           iEdad = input.nextInt();
        
           int iaño;
           iaño = 2018 - iEdad;
           
            System.out.println("Tu nombre es " + NombreS + "\n" + "Tu año de nacimiento es " + iaño);       
          // System.out.println("Tu año de nacimiento es " + iaño);
           
    }
    
}
