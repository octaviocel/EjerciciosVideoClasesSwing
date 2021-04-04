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
public class RadioPanel extends JPanel{
    private JRadioButton rbPrecaucion;
    private JRadioButton rbError;
    private JRadioButton rbInformacion;
    private JRadioButton rbPregunta;
    private ButtonGroup bgGrupo;
    
    public RadioPanel(){
        super.setLayout(new GridLayout(4,1));
        
        rbPrecaucion = new JRadioButton("Precaucion");
        rbError = new JRadioButton("Error");
        rbInformacion = new JRadioButton("Informacion");
        rbPregunta = new JRadioButton("Pregunta");
        
        bgGrupo = new ButtonGroup();
        bgGrupo.add(rbPrecaucion);
        bgGrupo.add(rbError);
        bgGrupo.add(rbInformacion);
        bgGrupo.add(rbPregunta);
        
        super.add(rbPrecaucion);
        super.add(rbError);
        super.add(rbInformacion);
        super.add(rbPregunta);
    }
    
    public Integer seleccionado() throws SinSeleccionarException{
        if(rbPrecaucion.isSelected()){
            return 1;
        }else if(rbError.isSelected()){
            return 2;
        }else if(rbInformacion.isSelected()){
            return 3;
        }else if(rbPregunta.isSelected()){
            return 4;
        }else{
            throw new SinSeleccionarException("No ha seleccionado nada");
        }
    }
    
    public void desseleccionar(){
        bgGrupo.clearSelection();
    }
}
