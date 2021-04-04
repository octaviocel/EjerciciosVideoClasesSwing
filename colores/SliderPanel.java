/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colores;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author DELL
 */
public class SliderPanel extends JPanel {

    private JLabel name;
    private JSlider slider;
    private JLabel name1;
    private JSlider slider1;
    private JLabel name2;
    private JSlider slider2;
    
    private JPanel pnl1;
    private JPanel pnl2;
    private JPanel pnl3;

    private SliderListener listener;

    public SliderPanel() {
        super.setLayout(new GridLayout(3, 1));
        name = new JLabel("Rojo");
        slider = new JSlider(0, 255, 0);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                listener.rojoClick();
            }
        });
        
        name1 = new JLabel("Verde");
        slider1 = new JSlider(0, 255, 0);
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                listener.verdeClick();
            }
        });
        name2 = new JLabel("Azul");
        slider2 = new JSlider(0, 255, 0);
        slider2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                listener.azulClick();
            }
        });
        
        pnl1 =new JPanel();
        pnl1.setLayout(new BorderLayout());
        pnl2 =new JPanel();
        pnl2.setLayout(new BorderLayout());
        pnl3 =new JPanel();
        pnl3.setLayout(new BorderLayout());
        pnl1.add(name, BorderLayout.NORTH);
        pnl1.add(slider, BorderLayout.SOUTH);
        pnl2.add(name1, BorderLayout.NORTH);
        pnl2.add(slider1, BorderLayout.SOUTH);
        pnl3.add(name2, BorderLayout.NORTH);
        pnl3.add(slider2, BorderLayout.SOUTH);
        
        super.add(pnl1);
        super.add(pnl2);
        super.add(pnl3);
    }

    public void setListener(SliderListener listener) {
        this.listener = listener;
    }

    public Integer getRojo() {
        return slider.getValue();
    }

    public void setRojo(Integer i) {
        slider.setValue(i);
    }

    public Integer getVerde() {
        return slider1.getValue();
    }

    public void setVerde(Integer i) {
        slider1.setValue(i);
    }

    public Integer getAzul() {
        return slider2.getValue();
    }

    public void setAzul(Integer i) {
        slider2.setValue(i);
    }

}
