/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumador;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class NumeroIncorrectoExeption extends Exception {

    public NumeroIncorrectoExeption(String msg) {
        super(msg);
        
    }
    
    public void mensaje(){
        
        JOptionPane.showMessageDialog(null, "Dato no valido");
    }
    
    
    
    
}
