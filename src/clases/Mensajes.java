package clases;

import javax.swing.JOptionPane;
import ventanasinsumos.jdInfoComputadores;

public class Mensajes {
        
    //Lanzar mensaje preguntando si se cerrara la ventana
    public void funcionPreguntaSalir(){
        try{
            int seleccion = JOptionPane.showOptionDialog(
            null, // Componente padre
            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
            + "font-size:12px}</style>"
            + "<div align=\"center\">El sistema se cerrará, ¿está seguro que desea salir?.</div></html>", //Mensaje
            "Cerrar sistema", // Titulo del Mensaje
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,    // null para icono por defecto.
            new Object[] { "Sí", "No"},    // null para YES, NO y CANCEL
            "No");//Boton seleccionado por defecto
                if (seleccion != -1){
                    if((seleccion + 1)==1){
                       //Accion a realizar al precionar "SI"
                        System.exit(0);
                    }else{
                       //Accion a realizar al precionar "NO"
                    }
                }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }    
    
}
