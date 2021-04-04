/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumador;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class TEdit  extends JPanel {
    private JLabel lblcaption;
    private JTextField edit;
    
    public TEdit(String caption){
        
        this.lblcaption = new JLabel(caption);
        this.edit = new JTextField(15);
        
        super.add(lblcaption);
        super.add(edit);
    }
    
    public void clear(){
        edit.setText("");
    }
    
    public Integer getValue() throws NumeroIncorrecto{
        try {
            return Integer.parseInt(edit.getText());            
        } catch (NumberFormatException e) {
            edit.requestFocus();
            throw new NumeroIncorrecto("Numero incorrecto, por favor checa tu numero");            
        }
    }
}
