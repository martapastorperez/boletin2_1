
package boletin2_1;

import javax.swing.JOptionPane;


public class Boletin2_1 {

 
    public static void main(String[] args) {
        
        float base, altura, area;
        base = Float.parseFloat(JOptionPane.showInputDialog("base"));
        altura= Float.parseFloat(JOptionPane.showInputDialog("altura"));
        area= base*altura/2;
        JOptionPane.showMessageDialog(null,"area= " +area);
        
    }
    
}
