/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package breakit;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Usama Moin
 */
public class GamePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        GameController.gameController.repaint(g);
    }

    
    
    
    
}
