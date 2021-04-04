/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class BotonesPanel extends JPanel{
    
    //private JButton btnCalcular;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private JPanel pnlEast;
    private JPanel pnlWest;
    
    private BotonesListener listener;
    
    public BotonesPanel(){
        super.setLayout(new BorderLayout());
        
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.limpiarClick();
            }
        });
        
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.salirClick();
            }
        });
        
        pnlEast = new JPanel();
        //pnlEast.add(btnCalcular);
        pnlEast.add(btnLimpiar);
        pnlWest = new JPanel();
        pnlWest.add(btnSalir);
        
        
        super.add(pnlEast, BorderLayout.EAST);
        super.add(pnlWest, BorderLayout.WEST);
    }
    
    public void setListener(BotonesListener listener){
        this.listener=listener;
    }
}
