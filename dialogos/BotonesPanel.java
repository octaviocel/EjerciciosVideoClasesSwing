/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class BotonesPanel extends JPanel {

    private JButton btnLimpiar;
    private JButton btnGenerar;
    private JPanel pnlEast;

    private BotonesListener listener;

    public BotonesPanel() {
        super.setLayout(new BorderLayout());

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.limpiarClick();
            }
        });

        btnGenerar = new JButton("Generar");
        btnGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.generarClick();
            }
        });
        
        pnlEast = new JPanel();
        pnlEast.add(btnGenerar);
        pnlEast.add(btnLimpiar);
        
        super.add(pnlEast, BorderLayout.EAST);

    }

    public void setListener(BotonesListener listener) {
        this.listener = listener;
    }
}
