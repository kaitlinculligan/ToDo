/**
 * The panel used for the program as part of java swing
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */

package UIElements;

import java.awt.*;
import javax.swing.*;

public class SimplePanel extends JPanel{
    private UsernameButton usernameButton;
    private UsernameField usernameField;
    
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
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        setBackground(Color.GREEN);
        if(panelType.equals("username")){
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
        usernameButton = new UsernameButton();
        usernameField = new UsernameField();
        add(usernameButton);
        add(usernameField);
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
}
