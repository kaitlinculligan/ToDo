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
    
    public SimplePanel(){
        super();
    }

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

    private void usernameSetup(){
        usernameButton = new UsernameButton();
        usernameField = new UsernameField();
        add(usernameButton);
        add(usernameField);
    }

    private void listSetup(){

    }

    private void redeemSetup(){

    }

    private void addSetup(){
        
    }
}
