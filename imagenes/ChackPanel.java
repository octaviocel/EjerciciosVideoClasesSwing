/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenes;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class ChackPanel extends JPanel{
    
    private JCheckBox chkBarbilla;
    private JCheckBox chkLentes;
    private JCheckBox chkCabello;
    private JCheckBox chkDientes;
    
        
    private ImagenListener listener;
    
    public ChackPanel(){
        super.setLayout(new GridLayout(4,1));
        chkBarbilla = new JCheckBox("Barbilla");
        chkBarbilla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.insertarImagen();
            }
        });
        chkLentes = new JCheckBox("Lentes");
        chkLentes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.insertarImagen();
            }
        });
        chkCabello = new JCheckBox("Cabello");
        chkCabello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.insertarImagen();
            }
        });
        chkDientes = new JCheckBox("Dientes");
        chkDientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.insertarImagen();
            }
        });
        
        super.add(chkBarbilla);
        super.add(chkLentes);
        super.add(chkCabello);
        super.add(chkDientes);
        
    }
    
    public String calculoNombre(){
        String r="geek-";
        
        r = r + (chkBarbilla.isSelected() ? "c" : "-");
        r = r + (chkLentes.isSelected() ? "g" : "-");
        r = r + (chkCabello.isSelected() ? "h" : "-");
        r = r + (chkDientes.isSelected() ? "t" : "-");
        
        return r+".gif";        
    }
    
    public void setListener(ImagenListener listener){
        this.listener=listener;
    }
}
