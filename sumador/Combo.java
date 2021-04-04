/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class Combo extends JPanel {

    private final Integer[] COMBOBOX = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    private JComboBox combo;
    private JLabel lblNom;
    
    private ComboListener listener;

    public Combo() {
        lblNom = new JLabel("Cuantos numeros sumaras: ");
        combo = new JComboBox(COMBOBOX);
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.agrgegarClick(combo.getSelectedIndex()+1);
            }
        });
        
        super.add(lblNom, BorderLayout.EAST);
        super.add(combo, BorderLayout.WEST);
    }
    
    public void setListener(ComboListener listener){
        this.listener=listener;
    }
    
   
}
