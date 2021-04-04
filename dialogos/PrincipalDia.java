/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogos;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class PrincipalDia extends JFrame {

    private RadioPanel rpBotones;
    private MensajesPanel mpTexto;
    private BotonesPanel btnBotones;

    public PrincipalDia() {
        super("Dialogos");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 250);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);

        rpBotones = new RadioPanel();
        mpTexto = new MensajesPanel();
        btnBotones = new BotonesPanel();
        btnBotones.setListener(new BotonesListener() {
            @Override
            public void generarClick() {
                try {
                    switch (rpBotones.seleccionado()) {
                        case 1:
                            JOptionPane.showMessageDialog(PrincipalDia.this,
                                    mpTexto.getMensaje(),
                                    mpTexto.getTitulo(),
                                    JOptionPane.WARNING_MESSAGE);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(PrincipalDia.this,
                                    mpTexto.getMensaje(),
                                    mpTexto.getTitulo(),
                                    JOptionPane.ERROR_MESSAGE);
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(PrincipalDia.this,
                                    mpTexto.getMensaje(),
                                    mpTexto.getTitulo(),
                                    JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(PrincipalDia.this,
                                    mpTexto.getMensaje(),
                                    mpTexto.getTitulo(),
                                    JOptionPane.QUESTION_MESSAGE);
                            break;
                    }
                } catch (SinSeleccionarException ex) {
                    JOptionPane.showMessageDialog(PrincipalDia.this,
                            ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } catch (ErrorCampoVacioException ex) {
                    JOptionPane.showMessageDialog(PrincipalDia.this,
                            ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

            @Override
            public void limpiarClick() {
                mpTexto.limpiar();
                rpBotones.desseleccionar();
            }
        });

        super.add(rpBotones, BorderLayout.WEST);
        super.add(mpTexto, BorderLayout.CENTER);
        super.add(btnBotones, BorderLayout.SOUTH);
        super.setVisible(true);

    }

    public static void main(String[] args) {
        new PrincipalDia();
    }
}
