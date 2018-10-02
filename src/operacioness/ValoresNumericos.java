/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacioness;
import java.util.Scanner;
/**
 *
 * @author Brayan
 */
public class ValoresNumericos {
    public static void main(String[] args) {
        
         Scanner ingresar = new Scanner (System.in);
         
         Integer Numero1 , Numero2 , Numero3 , Numero4 , Resultado1 , Resultado2;
         
        System.out.print("Ingrese numero 1 : ");
        Numero1 = ingresar.nextInt();
        
        System.out.print("Ingrese numero 2 : ");
        Numero2 = ingresar.nextInt();
     
        System.out.print("Ingrese numero 3 : ");
        Numero3 = ingresar.nextInt();
        
        System.out.print("Ingrese numero 4 : ");
        Numero4 = ingresar.nextInt();
        
        Resultado1 = Numero1 + Numero2 + Numero3 + Numero4;
        Resultado2 = Numero1 * Numero2 * Numero3 * Numero4;
        
        System.out.println("El resultado de la suma de " +Numero1+ " + " +Numero2+ " + " +Numero3+ " + " +Numero4+ " es : " +Resultado1 );
        System.out.println("El resultado del producto de " +Numero1+ " x " +Numero2+ " x " +Numero3+ " x " +Numero4+ " es : " +Resultado2 );
        
    }
    
}
