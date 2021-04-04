/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class DatosPanel extends JPanel {

    private TEdit usuario;
    private TEdit1 password;
    private JToggleButton tbPass;
    private JLabel lblOculto;

    private JPanel pnacomodo;
    private JPanel pnj;

    public DatosPanel() {
        super.setLayout(new FlowLayout());
        usuario = new TEdit("Usuario: ");
        password = new TEdit1("Password: ");
        tbPass = new JToggleButton("ver1.png");
        Dimension s= new Dimension(30,15);
        tbPass.setPreferredSize(s);
        lblOculto = new JLabel("");
        tbPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tbPass.isSelected()) {                    
                    lblOculto.setText(password.getValor());
                }else{
                    lblOculto.setText("");
                }
            }
        });

        pnacomodo = new JPanel();
        pnacomodo.setLayout(new BorderLayout());

        pnacomodo.add(password, BorderLayout.CENTER);
        pnacomodo.add(lblOculto, BorderLayout.SOUTH);
        pnacomodo.add(tbPass, BorderLayout.EAST);
        super.add(usuario);
        super.add(pnacomodo);
    }

    public Icon icono() {
        ImageIcon icon = new ImageIcon();
        return icon;
    }
    
    public String getUsuario(){
        return usuario.getValor();
    }
}
