/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appp;

/**
 *
 * @author ajy5119
 */
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel  extends JPanel{
        MainPanel()
        {
            JButton blueButton = new JButton("Blue");
            add(blueButton);
            
            JButton redButton = new JButton("Red");
            add(redButton);
        }
    
}
