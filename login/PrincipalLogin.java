/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class PrincipalLogin extends JFrame{
    
    private JLabel lblTitulo;
    private JPanel pntitulo;
    private JPanel pningreso;
    private DatosPanel dpTexto;
    //private JLabel lblOculto;
    private JButton btnIngreso;
    
    
    public PrincipalLogin(){
        super("Login");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400,400);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        lblTitulo = new JLabel("Mi Super Aplicacion");
        lblTitulo.setFont(new Font("Arial", Font.ITALIC,30));
        pntitulo= new JPanel();
        pntitulo.add(lblTitulo, BorderLayout.CENTER);
        dpTexto = new DatosPanel();
        //lblOculto = new JLabel("Fg");
        btnIngreso = new JButton("Ingresar");
        pningreso = new JPanel();
        pningreso.setLayout(new FlowLayout());
        pningreso.add(btnIngreso);
        btnIngreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(PrincipalLogin.this, 
                        String.format("Bienvenido %s !", 
                                dpTexto.getUsuario(),
                                JOptionPane.INFORMATION_MESSAGE));
            }
        });
        
        super.add(dpTexto, BorderLayout.CENTER);
        super.add(pntitulo, BorderLayout.NORTH);
        super.add(pningreso, BorderLayout.SOUTH);
        
        super.setVisible(true);
    }
    
    public static void main(String[] args) {
        new PrincipalLogin();
    }
}
