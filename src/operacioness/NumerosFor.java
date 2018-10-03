/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacioness;
import javax.swing.JOptionPane;
/**
 *
 * @author SOPORTE
 */
public class NumerosFor {
    public static void main(String[] args) {
        
        int Cantidad , Contador , Numero1 , ContaNe , ContaPo , Suma1 , Suma2;
        
        
        //Contador = 1;
        ContaNe = 0;
        ContaPo = 0;
        Numero1 = 0;
        Cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de edades : "));
        
        for(Contador = 1 ; Contador < Cantidad +1; Contador++){
            Numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero " +Contador+ " :"));
            
            if (Numero1 >=0 ) {
                ContaPo++;
            }else{
                ContaNe++;
            }
        }
        JOptionPane.showMessageDialog(null , "La cantidad de numeros positivos son : " +ContaPo);
        JOptionPane.showMessageDialog(null , "La cantidad de numero negativos son : " +ContaNe);
        
        Suma1 = ContaPo + Contador;
        JOptionPane.showMessageDialog(null , "La sumatoria de los numeros positivos es : " +Suma1);
        
        Suma2 = ContaNe + Contador;
        JOptionPane.showMessageDialog(null , "La sumatoria de los numeros negativos es : " +Suma2);
    }
    
}
