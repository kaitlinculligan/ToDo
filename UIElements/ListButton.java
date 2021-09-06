/**
 * The button for the label page used for the program as part of java swing
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */

package UIElements;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ListButton extends JButton{
    
    /**
     * Constructor
     */
    public ListButton(){
        super("Add");
    }

    /**
     * Initializes button according to needed parameters
     */
    public void initialize(){


        addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                
            }
        });
    }
}
