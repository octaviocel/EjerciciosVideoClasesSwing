/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogos;

import conversor.*;
import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class TEdit extends JPanel {

    private JLabel lblcaption;
    private JTextField edit;

    public TEdit(String caption) {
        super.setLayout(new BorderLayout());
        this.lblcaption = new JLabel(caption);
        this.edit = new JTextField(15);

        super.add(lblcaption, BorderLayout.NORTH);
        super.add(edit, BorderLayout.SOUTH);
    }

    public void clear() {
        edit.setText("");
    }

    public String getValor() throws ErrorCampoVacioException {
        if (edit.getText().isEmpty()) {
            edit.requestFocus();
            throw new ErrorCampoVacioException("Campo vacio");
        } else {
            return edit.getText();
        }
    }
}
