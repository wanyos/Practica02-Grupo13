
package com.wanyos.componentes;

import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;


/**
 * Crea un panel de formulario
 * Necesita lista de componentes formulario que seran un label y otro componente
 * @author roybe
 */
public class PanelForm extends JPanel {
    
    private ComponenteForm comForm;
    private List<ComponenteForm> listaComponentes;
   
    public PanelForm(List<ComponenteForm> com, int filas) {
        this.setLayout(new GridLayout(filas, 1));
        for (ComponenteForm aux : com) {
            this.add(aux);
        }

    }
    
    
    
    
    
    
}
