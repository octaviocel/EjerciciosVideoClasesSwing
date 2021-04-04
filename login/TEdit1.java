/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.*;

/**
 *
 * @author DELL
 */
public class TEdit1 extends JPanel {

    private JLabel lblcaption;
    private JPasswordField edit;

    public TEdit1(String caption) {
        //super.setLayout(new BorderLayout());
        this.lblcaption = new JLabel(caption);
        this.edit = new JPasswordField(15);

        
        super.add(lblcaption);
        super.add(edit);
    }

    public String getValor(){
        return String.valueOf(edit.getPassword());
    }
}
