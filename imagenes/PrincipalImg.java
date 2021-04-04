/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenes;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class PrincipalImg extends JFrame {

    private JLabel imgGeek;
    private JPanel pnl;
    private ChackPanel pnlBox;


    public PrincipalImg() {
        super("Imagenes");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 300);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);

        pnl = new JPanel();
        pnlBox = new ChackPanel();
        imgGeek = new JLabel();
        imgGeek.setIcon(new ImageIcon("geek-----.gif"));
        pnl.setLayout(new FlowLayout());
        pnl.add(imgGeek);
        
        pnlBox.setListener(new ImagenListener() {
            @Override
            public void insertarImagen() {
                insertarImage(pnlBox.calculoNombre());
            }
        });
        //Dimension sim= new Dimension(150,150);
        //imgGeek.setPreferredSize(sim);

        super.add(pnl, BorderLayout.CENTER);
        super.add(pnlBox, BorderLayout.WEST);
        //super.pack();
        super.setVisible(true);
    }

    public void insertarImage(String s){
        imgGeek.setIcon(new ImageIcon(s));
    }
    
    public static void main(String[] args) {
        new PrincipalImg();
    }
}
