/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class BotonesPanel extends JPanel{
    private JButton btnCalcular;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private JPanel pnlEast;
    private JPanel pnlWest;
    
    private Acciones listener;
    
    public BotonesPanel(){
        //super.setBackground(Color.GREEN);
        super.setLayout(new BorderLayout());
        
        btnCalcular = new JButton("Calcular");  
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.calcularSumaClick();
            }
        });
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.limpiarClick();
            }
        });
        pnlEast = new JPanel();
        pnlEast.add(btnCalcular);
        pnlEast.add(btnLimpiar);
        
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.salirClick();
            }
        });
        pnlWest = new JPanel();
        pnlWest.add(btnSalir);
        
        
        super.add(pnlEast, BorderLayout.EAST);
        super.add(pnlWest, BorderLayout.WEST);
        
    }
    
    public void setListener(Acciones listener){
        this.listener=listener;
    }
}
