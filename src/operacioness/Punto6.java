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
public class Punto6 {
    public static void main(String[] args) {
        
        Float Donacion ;
        Double Mult , Mult2, Mult3 , Mult4 , Resta1, Resta;
        
        
        Donacion = Float.parseFloat(JOptionPane.showInputDialog(null,"Cantidad a donar : "));
        
        if (Donacion >= 10000) {
            
            Mult = Donacion * 0.30;
            Mult2 = Donacion * 0.50;
            
            Resta = Mult - Mult2;
            
            JOptionPane.showMessageDialog(null, "El total de la donacion " +Donacion+ " se donara " +Mult+ " a un centro de salud, \n los otros "
                    +Mult2+ " se daran a un comedor de niños y el resto " +Resta+ " se invierte en la bolsa.");
        }else{
            if (Donacion <10000) {
                
                Mult3 = Donacion * 0.25;
                Mult4 = Donacion * 0.60;
                
                Resta1 = Mult3 - Mult4;
                
                JOptionPane.showMessageDialog(null, "El total de la donacion " +Donacion+ " se donara " +Mult3+ " a un centro de salud, \n los otros "
                    +Mult4+ " se daran a un comedor de niños y el resto " +Resta1+ " se invierte en la bolsa.");
            }
        }
    }
}
