/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import javax.swing.*;

/**
 *
 * @author DELL
 */
public class TEdit extends JPanel {

    private JLabel lblcaption;
    private JTextField edit;

    public TEdit(String caption) {

        this.lblcaption = new JLabel(caption);
        this.edit = new JTextField(15);

        super.add(lblcaption);
        super.add(edit);
    }

    public void clear() {
        edit.setText("");
    }

    public Double getValor() throws DoubleException {
        try {
            return Double.parseDouble(edit.getText());
        } catch (Exception e) {
            edit.requestFocus();
            throw new DoubleException("Numero invalido, escribe la cantidad correcta");
        }
    }
}
