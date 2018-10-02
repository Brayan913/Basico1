/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacioness;
import javax.swing.JOptionPane;
/**
 *
 * @author Brayan
 */
public class Punto1 {
    public static void main(String[] args) {
        
        Integer Num1 , Num2 , Num3;
        
        Num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 1 : "));
        Num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 2 : "));
        Num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 3 : "));
        
        if (Num1 > Num2 && Num1 > Num3) {
            JOptionPane.showMessageDialog(null, " El numero " +Num1+ " es mayor que "+Num2+ " y "  +Num3);
        }else {
            if (Num2 > Num3 && Num2 > Num1) {
                JOptionPane.showMessageDialog(null, " El numero " +Num2+ " es mayor que "+Num3+ " y " + Num1);
            }else {
                if(Num3 > Num1 && Num3 > Num2 ){
                    JOptionPane.showMessageDialog(null, " El numero " +Num3+ " es mayor que " +Num1+ " y " + Num2);
                }
            }
        }
    }
}
