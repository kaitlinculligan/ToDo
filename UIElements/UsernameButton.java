/**
 * The button for the username page used for the program as part of java swing
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */

package UIElements;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UsernameButton extends JButton{

    private UsernameField usernameField;
    private UsernameLabel usernameLabel;
    private SimpleFrame frame;

    /**
     * Constructor
     */
    public UsernameButton(UsernameField usernameField, UsernameLabel usernameLabel, SimpleFrame f){
        super("Continue");
        this.usernameField = usernameField;
        this.usernameLabel = usernameLabel;
        this.frame = f;
    }

    /**
     * Initializes button according to needed parameters
     */
    public void initialize(){


        addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                if(usernameField.getText() != null){
                    usernameLabel.setLabel("Loading profile");
                    frame.pageChange("list");
                }
            }
        });
    }

    /**
     * getter for usernameField
     * @return usernameField
     */
    public UsernameField getUsernameField(){
        return this.usernameField;
    }
}