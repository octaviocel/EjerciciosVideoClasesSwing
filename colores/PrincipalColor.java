/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colores;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class PrincipalColor extends JFrame {

    private ColorPanel pnlColor;
    private SliderPanel pnlSlider;
    private SpinerPanel pnlSpiner;

    public PrincipalColor() {
        super("Colores");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(600, 350);
        super.setLayout(new FlowLayout());
        super.setLocationRelativeTo(null);

        pnlColor = new ColorPanel();
        pnlSlider = new SliderPanel();
        pnlSpiner = new SpinerPanel();
        pnlSlider.setListener(new SliderListener() {
            @Override
            public void rojoClick() {
                pnlSpiner.setRojo(pnlSlider.getRojo());
                pnlColor.setBack(pnlSlider.getRojo(),
                        pnlSlider.getVerde(),
                        pnlSlider.getAzul());
            }

            @Override
            public void verdeClick() {
                pnlSpiner.setVerde(pnlSlider.getVerde());
                pnlColor.setBack(pnlSlider.getRojo(),
                        pnlSlider.getVerde(),
                        pnlSlider.getAzul());
            }

            @Override
            public void azulClick() {
                pnlSpiner.setAzul(pnlSlider.getAzul());
                pnlColor.setBack(pnlSlider.getRojo(),
                        pnlSlider.getVerde(),
                        pnlSlider.getAzul());

            }
        });

        pnlSpiner.setListener(new SpinerListener() {
            @Override
            public void azulClickSp() {
                pnlSlider.setAzul(pnlSpiner.getAzul());
            }

            @Override
            public void rojoClickSp() {
                pnlSlider.setRojo(pnlSpiner.getRojo());
            }

            @Override
            public void verdeClickSp() {
                pnlSlider.setVerde(pnlSpiner.getVerde());
            }
        });

        super.add(pnlSlider);
        super.add(pnlSpiner);
        super.add(pnlColor, FlowLayout.LEFT);

        PrincipalColor.this.pack();
        super.setVisible(true);
    }

    public static void main(String[] args) {
        new PrincipalColor();

    }
}
