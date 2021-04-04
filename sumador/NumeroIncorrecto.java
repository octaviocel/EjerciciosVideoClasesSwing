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
public class NumeroIncorrecto extends Exception {
    private String mensaje;
    /**
     * Creates a new instance of <code>NumeroIncorrecto</code> without detail
     * message.
     */
    public NumeroIncorrecto() {
    }

    /**
     * Constructs an instance of <code>NumeroIncorrecto</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NumeroIncorrecto(String msg) {
        
        super(msg);
        //JOptionPane.showMessageDialog(null, msg);
        this.mensaje=msg;
    }

    public void getMensaje() {
    }
}
