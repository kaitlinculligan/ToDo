/**
 * The panel used for the program as part of java swing
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */

package UIElements;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimplePanel extends JPanel{
    private UsernameButton usernameButton;
    private UsernameField usernameField;
    private UsernameLabel usernameLabel;
    
    /**
     * Constructor
     */
    public SimplePanel(){
        super();
    }

    /**
     * Initializes panel according to what page the program is on
     * @param panelType the page the program is on
     */
    public void initialize(String panelType){
        //should probably move following 2 lines inside the panel type conditionals
        if(panelType.equals("username")){
            setLayout(new BorderLayout());
            usernameSetup();
        }else if(panelType.equals("list")){
            listSetup();
        }else if(panelType.equals("redeem")){
            redeemSetup();
        }else if(panelType.equals("add")){
            addSetup();
        }

        setVisible(true);
    }

    /**
     * Setups up panel if the current page is the user selection page
     */
    private void usernameSetup(){
        usernameField = new UsernameField();
        usernameLabel = new UsernameLabel();
        usernameButton = new UsernameButton(usernameField, usernameLabel);

        add(usernameButton, "SOUTH");
        add(usernameField, "CENTER");
        add(usernameLabel, "NORTH");
    }

    /**
     * Setups up panel if the current page is the task list page
     */
    private void listSetup(){

    }

    /**
     * Setups up panel if the current page is the point redemption page
     */
    private void redeemSetup(){

    }

    /**
     * Setups up panel if the current page is the add task page
     */
    private void addSetup(){
        
    }

    /**
     * Returns usernameLabel for the purposes of confirming success loading page
     * @return usernameLabel
     */
    public UsernameLabel getUsernameLabel(){
        return this.usernameLabel;
    }
}
