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
public class Menu1 extends JMenu {

    private JMenuItem miItem;
    private JMenuItem miItem1;
    private JMenuItem miItem2;
    private JMenuItem miItem3;

    public Menu1() {
        super("Archivo");
        
        miItem = new JMenuItem("Nuevo");
        miItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Creara un archivo",
                        "Crear",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        miItem1 = new JMenuItem("Guardar");
        miItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Guardara un archivo",
                        "Guardar",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        miItem2 = new JMenuItem("Abrir");
        miItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Abrira un archivo",
                        "Abrir",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        miItem3 = new JMenuItem("Salir");
        miItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        super.add(miItem);
        super.addSeparator();
        super.add(miItem1);
        super.add(miItem2);
        super.addSeparator();
        super.add(miItem3);
    }
}
