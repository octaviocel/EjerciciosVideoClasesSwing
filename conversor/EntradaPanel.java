/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class EntradaPanel extends JPanel {

    private final String[] COMBO = {"","Peso a dolar ", "Dolar a peso","Peso a Euro", "Dolar a Euro", "Euro a Peso","Euro a dolar"};
    private final Double[] PRECIO = {0.048,20.72,0.04,0.84,24.77,1.2};
    
    
    private JComboBox combo;
    private TEdit edit;

    private ConvertirListener listener;

    public EntradaPanel() {
        //super.setBackground(Color.CYAN);
        super.setLayout(new BorderLayout());

        edit = new TEdit("Cantidad: ");
        this.combo = new JComboBox(COMBO);
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.convertir(combo.getSelectedIndex());
            }
        });

        super.add(edit, BorderLayout.NORTH);
        super.add(combo, BorderLayout.CENTER);
    }

    public Double calcular(Integer option) throws DoubleException {
        switch (option) {
            case 0:
                return 0.00;
            case 1:
                return edit.getValor() * PRECIO[0];
            case 2:
                return edit.getValor() * PRECIO[1];
            case 3:
                return edit.getValor()*PRECIO[2];
            case 4:
                return edit.getValor()*PRECIO[3];
            case 5:
                return edit.getValor()*PRECIO[4];
            case 6:
                return edit.getValor()*PRECIO[5];
            default:
                return 0.00;
        }
    }

    public void limpiar() {
        edit.clear();
    }

    public void setListener(ConvertirListener listener) {
        this.listener = listener;
    }
}
