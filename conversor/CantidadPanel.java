/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;


import java.awt.*;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class CantidadPanel extends JPanel{
    //private TEdit edit;
    //private JComboBox combo;
    
    private JLabel lblCantidad;
    
    public CantidadPanel(){
        //super.setBackground(Color.BLUE);
        super.setLayout(new FlowLayout());

        lblCantidad= new JLabel("$ 0.00");
        lblCantidad.setFont(new Font("Arial", Font.ITALIC, 30));
        
        super.add(lblCantidad);
    }
    
    public void setCantidad(Double n){
        lblCantidad.setText(String.format("$ %.2f", n));
    }
    
    public void limpiar(){
        lblCantidad.setText("$ 0.00");
    }
}
