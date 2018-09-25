/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */

import java.util.*;
import java.lang.Math;

public class PRINCIPAL {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca el numerador de la primer fraccion ");
        double rNUM1;
        
        rNUM1 = input.nextDouble();
        System.out.println("Introduzca el denominador de la primera fraccion ");
        double rDEN1;
        
        rDEN1 = input.nextDouble();
        double fRACC1;
        
        fRACC1 = rNUM1 / rDEN1;
        System.out.println("Introduzca el numerador de la segunda fraccion ");
        double rNUM2;
        
        rNUM2 = input.nextDouble();
        System.out.println("Introduzca el denominador de la primera fraccion ");
        double rDEN2;
        
        rDEN2 = input.nextDouble();
        double fRACC2;
        
        fRACC2 = rNUM2 / rDEN2;
        double sUMA;
        
        sUMA = fRACC1 + fRACC2;
        System.out.print("La suma es ");
        System.out.println(sUMA);
        int rESTA;
        
        rESTA = (int) (fRACC1 - fRACC2);
        System.out.print("La resta es ");
        System.out.println(rESTA);
        double dIVISION;
        
        dIVISION = fRACC1 / fRACC2;
        System.out.print("La division es ");
        System.out.println(dIVISION);
        double mULTI;
        
        mULTI = fRACC1 * fRACC2;
        System.out.print("la multiplciacion es ");
        System.out.println(mULTI);
    }
}

