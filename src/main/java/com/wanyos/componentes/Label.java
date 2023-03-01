
package com.wanyos.componentes;

import java.awt.Font;
import javax.swing.JLabel;

public class Label extends JLabel {
    
    private Font fuente = new Font("Consolas", Font.BOLD, 12);
    
    public Label(String titulo){
        this.setText(titulo);
        this.setFont(fuente);
    }
    
}
