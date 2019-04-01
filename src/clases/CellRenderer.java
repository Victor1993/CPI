package clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * @author VICTOR SANDOVAL
 * contacto@worldsystem.cl
 */

public class CellRenderer extends DefaultTableCellRenderer {
    Color background;
    Color foreground;
    
    public CellRenderer (Color background,Color foreground) {
        super();
        this.background = background;
        this.foreground = foreground;
    }
    public Component getTableCellRendererComponent(JTable table, Object value,boolean isSelected, 
        boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);        
        comp.setBackground(background);
        comp.setForeground(foreground);
        //Establecer fuente y tamaño de letra del encabezado de la tabla
        comp.setFont(new java.awt.Font("Arial", 0, 18));
        //Establecer ubicacion del encabezado de la tabla
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        //Establecer borde(color) del encabezado de la tabla
        this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        return comp;
    }
}