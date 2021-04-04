/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogos;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class MensajesPanel extends JPanel{
    
    private TEdit titulo;
    private TEdit mensaje;
    
    public MensajesPanel(){
        //super.setLayout(new BorderLayout(100,5));
        titulo = new TEdit("Titulo");
        mensaje = new TEdit("Mensaje");
        
        super.add(titulo);
        super.add(mensaje);
    }
    public String getMensaje() throws ErrorCampoVacioException{
        return mensaje.getValor();
    }
    public String getTitulo() throws ErrorCampoVacioException{
        return titulo.getValor();
    }
    public void limpiar(){
        titulo.clear();
        mensaje.clear();
    }
}
