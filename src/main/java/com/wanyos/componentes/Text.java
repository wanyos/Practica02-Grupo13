
package com.wanyos.componentes;

import java.awt.Font;
import javax.swing.JTextField;

public class Text extends JTextField {

 private Font fuente = new Font("Consolas", Font.BOLD, 12);
 
 public Text(String name){
     this.setName(name);
     this.setFont(fuente);
     this.setColumns(15);
 }
    
}
