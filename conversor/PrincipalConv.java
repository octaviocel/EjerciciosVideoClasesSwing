/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class PrincipalConv extends JFrame{
    
    private CantidadPanel pnlCantidad;
    private EntradaPanel pnlEntrada;
    private BotonesPanel pnlBotones;
    
    public PrincipalConv(){
        super("Conversor");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 300);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        pnlBotones = new BotonesPanel();
        pnlCantidad = new CantidadPanel();
        pnlEntrada = new EntradaPanel();
        pnlEntrada.setListener(new ConvertirListener() {
            @Override
            public void convertir(Integer opcion) {
                try {
                    pnlCantidad.setCantidad(pnlEntrada.calcular(opcion));
                } catch (DoubleException ex) {
                    JOptionPane.showMessageDialog(PrincipalConv.this,
                            ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        pnlBotones.setListener(new BotonesListener() {
            @Override
            public void limpiarClick() {
                pnlEntrada.limpiar();
                pnlCantidad.limpiar();
            }

            @Override
            public void salirClick() {
                System.exit(0);
            }
        });
        
        
        
        super.add(pnlEntrada, BorderLayout.NORTH);
        super.add(pnlCantidad, BorderLayout.CENTER);
        super.add(pnlBotones, BorderLayout.SOUTH);
        super.setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        new PrincipalConv();
    }
}
