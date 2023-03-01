
package com.wanyos.componentes;

import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Button extends JButton {
    
    private Font fuenteButton = new Font("Consolas", Font.BOLD, 16);
    
    public Button(String titulo, ImageIcon icon, String topTip) {
        this.setText(titulo+"  ");
        this.setName("btn" + titulo);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.setFont(fuenteButton);
        this.setBorder(null);
        this.setHorizontalAlignment(SwingConstants.LEFT);
        this.setVerticalTextPosition(SwingConstants.CENTER );
        this.setToolTipText(topTip);
        this.setIcon(icon);
    }
    
    
    

        
    
    
}
