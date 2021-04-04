/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selecciondeArchivos;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class PrincipalArch extends JFrame{
    
    private DatosPanel pnlDatos;
    private JFileChooser fcFile;
    private JColorChooser ccFile;
    
    public PrincipalArch(){
        super("Seleccion De Archivos");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500,300);
        super.setLayout(new FlowLayout());
        super.setLocationRelativeTo(null);
        
        pnlDatos = new DatosPanel();
        fcFile = new JFileChooser();
        ccFile= new JColorChooser();
        pnlDatos.setListener(new BotonListener() {
            @Override
            public void abrirClick() {
                int resultado = fcFile.showOpenDialog(fcFile);
                if(resultado == JFileChooser.APPROVE_OPTION){
                    pnlDatos.setAdjuntar(fcFile.getSelectedFile().toString());
                }
            }

            @Override
            public void guardarClick() {
                int resultado = fcFile.showSaveDialog(fcFile);
                if(resultado == JFileChooser.APPROVE_OPTION){
                    pnlDatos.setGuardar(fcFile.getSelectedFile().toString());
                }
            }

            @Override
            public void colorClick() {
                Color color = ccFile.showDialog(ccFile,"Selecciona un color", pnlDatos.getC());
                if(color != null){
                    pnlDatos.setColer(color);
                }
                
            }
        });
        
        
        super.add(pnlDatos);
        super.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new PrincipalArch();
    }
}
