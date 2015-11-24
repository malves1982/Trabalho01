/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01;

import java.awt.Button;
import java.awt.Frame;

/**
 *
 * @author malves
 */
public class Trabalho01 extends Frame{

    public Trabalho01() {
        setVisible(true);
        setSize(300, 300);
        setTitle("janela 1");
        addWindowListener(new FecharJanelaTratador(this));
        
        Button b = new Button("botão 1");
        
        b.addActionListener(new Botao01Tratador());
        
        add(b);
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Trabalho01 t = new Trabalho01();
    }
    
}
