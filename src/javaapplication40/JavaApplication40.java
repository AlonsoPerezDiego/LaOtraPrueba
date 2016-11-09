
package javaapplication40;

/**
 *
 * @author Brais
 */
public class JavaApplication40 {

    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        int c = 8;
        
        System.out.println("x= " + (-b+(Math.pow(((Math.pow(b, 2)) -  4*a*c), 1/2)))/(2*a) + "\nX= " + (-b-(Math.pow(((Math.pow(b, 2)) -  4*a*c), 1/2)))/(2*a));
    }
    
}
