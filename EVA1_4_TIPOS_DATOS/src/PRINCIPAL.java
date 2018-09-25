
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
  String NombreS;//Declarando nada mas 
        Scanner InputA;//Declarando nada mas
        //Scanner es una clase para usar clases
        //Se hace a traves de objetos
        // y los objetos se crean con la palabra new
        InputA = new Scanner(System.in);
        //Scanner InputA2 = new Scanner(System.in);
       // int iVal = 10;
        NombreS = InputA.nextLine();//cuando da enter ♥
        //Concatenamos cadenas "texto" + Variable tipo texto
        System.out.println("Tu nombre es " + NombreS);
        
    }
    
}
