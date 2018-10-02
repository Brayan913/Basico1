/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacioness;

import java.util.Scanner;

/**
 *
 * @author SOPORTE
 */
public class Operacioness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
               Scanner ingresar = new Scanner (System.in);
        int suma,resta,division,multiplicacion;
        Integer N1;
        Integer N2;
        
        System.out.println("Porfavor Ingrese un numero");
        N1 = ingresar.nextInt();
        System.out.println("Porfavor Ingrese un numero");
        N2 = ingresar.nextInt ();
        
   suma = N1 + N2;
   System.out.println("El resultado de la suma es"+suma);
    resta = N1 - N2;
   System.out.println("El resultado de la resta es"+resta);
   division = N1 / N2;
   System.out.println("El resultado de la division es"+division);
   multiplicacion = N1 * N2;
   System.out.println("El resultado de la multiplicacion es"+multiplicacion);
    
    }
    
}
