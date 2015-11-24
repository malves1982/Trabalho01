/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01;

import java.awt.Frame;
import java.awt.Label;

/**
 *
 * @author malves
 */
public class Janela02 extends Frame {

    public Janela02() {
        setVisible(true);
        setSize(200, 200);
        setTitle("janela 2");
        
        Label l = new Label("janela 2");
        
        add(l);
        
        addWindowListener(new EsconderJanelaTratador(this));
    }
    
    
    
}
