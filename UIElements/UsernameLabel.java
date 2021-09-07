/**
 * The label for the username page used for the program as part of java swing
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */

package UIElements;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UsernameLabel extends JLabel{

    private String label;

    public UsernameLabel(String label){
        super(label);
        this.label = label;
    }

    public String getLabel(){
        return this.label;
    }
    
    public void setLabel(String label){
        this.label = label;
    }
}
