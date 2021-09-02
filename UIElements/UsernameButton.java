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

    /**
     * Constructor
     */
    public UsernameButton(UsernameField usernameField, UsernameLabel usernameLabel){
        super("Continue");
        this.usernameField = usernameField;
        this.usernameLabel = usernameLabel;
    }

    /**
     * Initializes button according to needed parameters
     */
    public void initialize(){


        addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                if(!usernameField.getText().equals("anObject")){
                    usernameLabel.setLabel("Loading profile");
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