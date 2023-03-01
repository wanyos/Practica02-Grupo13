
package com.wanyos.componentes;

import java.awt.GridLayout;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 * Crea paneles con dos componentes un label y otro como un text, combo, etc
 * @author roybe
 */
public class ComponenteForm extends JPanel {
    
    private Label label;
    private Text text;
    private JComboBox combo;
    
    public ComponenteForm(String tituloLabel, String nombreText){
       this.label.setText(tituloLabel);
       this.text.setName(nombreText);
       this.setOpaque(true);
       this.setLayout(new GridLayout(2, 1, 0, 0));
        
        this.add(label);
        this.add(text);
    }
   
    
    
    
    
    
}
