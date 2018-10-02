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
public class Perimetro {
    
    public static void main(String[] args) {
        
        Scanner ingresar = new Scanner (System.in);
        
        int Ingreso;
        
        System.out.println("Ingrese medida de un lado del cuadrado");
        Ingreso = ingresar.nextInt();
        
        System.out.printf("El perimetro de %d es : "+Ingreso*4, Ingreso);
        
        
    }
    
}
