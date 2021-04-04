/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selecciondeArchivos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class DatosPanel extends JPanel{
    
    private JPanel pnlArchivo;
    private JLabel lblText;
    private JTextField edtText;
    private JButton btnArchivo;
    
    private JPanel pnlGuardar;
    private JLabel lblText1;
    private JTextField edtText1;
    private JButton btnGuardar;
    
    private JPanel pnlColor;
    private JPanel pnlMini;
    private JLabel lblText2;
    private JButton btnColor;
    
    private BotonListener listener;
    
    public DatosPanel(){
        super.setLayout(new BorderLayout());
        
        lblText = new JLabel("Adjuntar Archivo: ");
        edtText = new JTextField(20);
        btnArchivo = new JButton("...");
        btnArchivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.abrirClick();
            }
        });
        pnlArchivo = new JPanel();
        pnlArchivo.setLayout(new BorderLayout());
        pnlArchivo.add(lblText, BorderLayout.WEST);
        pnlArchivo.add(edtText, BorderLayout.CENTER);
        pnlArchivo.add(btnArchivo, BorderLayout.EAST);
        
        lblText1 = new JLabel("Guardar: ");
        edtText1 = new JTextField(20);
        btnGuardar = new JButton("...");
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.guardarClick();
            }
        });
        pnlGuardar = new JPanel();
        pnlGuardar.setLayout(new BorderLayout());
        pnlGuardar.add(lblText1, BorderLayout.WEST);
        pnlGuardar.add(edtText1, BorderLayout.CENTER);
        pnlGuardar.add(btnGuardar, BorderLayout.EAST);
        
        pnlMini = new JPanel();
        //pnlMini.setBackground(Color.BLACK);
        Dimension dim= new Dimension(20,15);
        pnlMini.setPreferredSize(dim);
        pnlColor = new JPanel();
        lblText2 = new JLabel("Color: ");
        btnColor = new JButton("...");
        btnColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.colorClick();
            }
        });
        pnlColor.setLayout(new BorderLayout());
        pnlColor.add(lblText2, BorderLayout.WEST);
        pnlColor.add(pnlMini, BorderLayout.CENTER);
        pnlColor.add(btnColor, BorderLayout.EAST);
        
        
        super.add(pnlArchivo, BorderLayout.NORTH);
        super.add(pnlGuardar, BorderLayout.CENTER);
        super.add(pnlColor, BorderLayout.SOUTH);
        
    }
    
    public void setListener(BotonListener listener){
        this.listener= listener;
    }
    
    public void setAdjuntar(String t){
        edtText.setText(t);
    }
    
    public void setGuardar(String t){
        edtText1.setText(t);
    }
    
    public Color getC(){
        return pnlMini.getBackground();
    }
    
    public void setColer(Color color){
        pnlMini.setBackground(color);
    }
}
