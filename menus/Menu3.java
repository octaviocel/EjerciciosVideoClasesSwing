/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class Menu3 extends JMenu{
    
    private JMenuItem miItem;
    
    public Menu3(){
        super("Ayuda");
        
        miItem = new JMenuItem("Acerca de");
        miItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Todos los derechos de esta aplicacion\nson reservados",
                        "Acerca de",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        super.add(miItem);
    }
}
