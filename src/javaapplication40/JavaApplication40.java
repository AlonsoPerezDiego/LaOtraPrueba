
package javaapplication40;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class JavaApplication40 {

    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        int c = 4;
        
        JOptionPane.showMessageDialog(null, "Se va a calcular la ecuación: \n" + a + "x^2 + " + b + "x - " + c + " = 0");
        
        JOptionPane.showMessageDialog(null, "x= " + (-b+(Math.pow(((Math.pow(b, 2)) -  4*a*-c), 1/2)))/(2*a) + "\nX= " + (-b-(Math.pow(((Math.pow(b, 2)) -  4*a*-c), 1/2)))/(2*a));
        
        JOptionPane.showMessageDialog(null, "Gracias por su innecesaria atención. \nLe deseamos unas hermosas blasfemias.");
    }
    
}
