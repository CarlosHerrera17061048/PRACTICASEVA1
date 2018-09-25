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
        System.out.println("Ingrese la velocidad inicial");
        double VELI;
            VELI = input.nextDouble();
        System.out.println("Ingrese la velocidad final");
        double VELF;
                     VELF = input.nextDouble();
        System.out.println("Ingrese el tiempo");
        double TIEMPO;
                    TIEMPO = input.nextDouble();

        double DIST;
        DIST= ((VELI+VELF)/2)*TIEMPO;
        System.out.println("Su distancia es "+DIST);
    }
    
}
