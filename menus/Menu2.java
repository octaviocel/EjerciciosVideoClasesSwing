/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import sumador.Principal;

/**
 *
 * @author DELL
 */
public class Menu2 extends JMenu {

    private JMenu menu;
    private JMenuItem miItem2;

    private JRadioButton rb;
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb3;
    private ButtonGroup btng;
    
    private ColorListener listener;

    public Menu2() {
        super("Edicion");

        btng = new ButtonGroup();
        rb = new JRadioButton("Normal", true);
        rb1 = new JRadioButton("Azul", false);
        rb2 = new JRadioButton("Rojo", false);
        rb3 = new JRadioButton("Negro", false);
        btng.add(rb);
        rb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.colorClick();
            }
        });
        btng.add(rb1);
        rb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.colorClick();
            }
        });
        btng.add(rb2);
        rb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.colorClick();
            }
        });
        btng.add(rb3);
        rb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.colorClick();
            }
        });

        menu = new JMenu("Colores");
        menu.add(rb);
        menu.add(rb1);
        menu.add(rb2);
        menu.add(rb3);
        
        miItem2 = new JMenuItem("Sumador");
        miItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumador.Principal ef = new Principal();
            }
        });
        super.add(menu);
        super.add(miItem2);
    }

    public Color color() {
        if (rb.isSelected()) {
            return Color.LIGHT_GRAY;
        } else if (rb1.isSelected()) {
            return Color.BLUE;
        } else if (rb2.isSelected()) {
            return Color.RED;
        } else if (rb3.isSelected()) {
            return Color.BLACK;
        }else{
            return Color.CYAN;
        }
    }
    
    public void setListener(ColorListener listener){
        this.listener=listener;
    }
    
   
}
