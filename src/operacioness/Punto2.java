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
public class Punto2 {
    public static void main(String[] args) {
        
        Integer Numero1;
        
        Numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero : "));
        
        if (Numero1<0) {
            JOptionPane.showMessageDialog(null, " El numero ingresado en negativo");
        }else{
            if (Numero1 ==0) {
                JOptionPane.showMessageDialog(null, " El numero ingresado en cero");
            }else{
                if (Numero1 >0) {
                    JOptionPane.showMessageDialog(null, " El numero ingresado en positivo");
                }
            }
        }
    }
    
}
