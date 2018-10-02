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
public class Cliente {
    public static void main(String[] args) {
        
        Scanner registro = new Scanner(System.in);
        
        Integer Cantidad, Precio, Mult, Abono , Resta;
        
        System.out.print("Ingrese el precio del articulo : ");
        Precio = registro.nextInt();
        
        System.out.print("Ingrese cantidad del articulo : ");
        Cantidad = registro.nextInt();
        
       
        Mult = Precio * Cantidad;
        System.out.println("Total a pagar $ : " +Mult);
        
        
        Mult = Precio * Cantidad;
        System.out.print("¿ Total a abonar ? : " );
        Abono = registro.nextInt();
        
        Resta = Mult - Abono; 
        
        System.out.println("Su deuda es : " +Resta );
    }
    
}
