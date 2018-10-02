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
public class Numeros {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner (System.in);
        
        Integer Numero1 ;
        Integer Numero2 ;
        Integer Numero3 ;
        Integer Numero4 ;
        
        Integer Resultado1;
        Integer Resultado2;
        
        
        
        System.out.print("Ingrese numero 1 : ");
        Numero1 = ingresar.nextInt();
        
        System.out.print("Ingrese numero 2 : ");
        Numero2 = ingresar.nextInt();
        Resultado1 = Numero1 + Numero2;
        
        System.out.print("Ingrese numero 3 : ");
        Numero3 = ingresar.nextInt();
        
        System.out.print("Ingrese numero 4 : ");
        Numero4 = ingresar.nextInt();
        Resultado2 = Numero3 * Numero4;
        
        System.out.println("El resultado de la suma de "+Numero1+ " + " +Numero2+ " es : " + Resultado1);
        System.out.println("El resultado del producto de "+Numero3+ " + " +Numero4+ " es : " + Resultado2);
        //Resultado = Numero1+Numero2;
    }
}
