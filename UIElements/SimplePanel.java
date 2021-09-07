/**
 * The panel used for the program as part of java swing
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */

package UIElements;

import Program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SimplePanel extends JPanel{

    private SimpleFrame frame;

    private Profile profile;

    private SimpleMenuBar simpleMenuBar;

    private UsernameButton usernameButton;
    private UsernameField usernameField;
    private UsernameLabel usernameLabel;

    private AddExitButton addExitButton;
    private AddContinueButton addContinueButton;
    private AddLabel addItemLabel;
    private AddLabel addDateLabel;
    private AddLabel addImportanceLabel;
    private AddField addItemField;
    private AddField addDateField;
    private AddSlider addSlider;

    private RedeemLabel redeemPointsLabelOne;
    private RedeemLabel redeemPointsLabelTwo;
    
    /**
     * Constructor
     */
    public SimplePanel(SimpleFrame frame){
        super();
        this.frame = frame;
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
            setLayout(new GridLayout(3, this.profile.getTaskArray().size()+1));
            listSetup();
        }else if(panelType.equals("redeem")){
            setLayout(new BorderLayout());
            redeemSetup();
        }else if(panelType.equals("add")){
            setLayout(new BorderLayout());
            addSetup();
        }

        if(!panelType.equals("username")){
            simpleMenuBar = new SimpleMenuBar();
            add(simpleMenuBar);
        }

        setVisible(true);
    }

    /**
     * Setups up panel if the current page is the user selection page
     */
    private void usernameSetup(){
        usernameField = new UsernameField();
        usernameLabel = new UsernameLabel("Enter Username:");
        usernameButton = new UsernameButton(usernameField, usernameLabel, frame);

        add(usernameButton, BorderLayout.SOUTH);
        add(usernameField, BorderLayout.CENTER);
        add(usernameLabel, BorderLayout.NORTH);
    }

    /**
     * Setups up panel if the current page is the task list page
     */
    private void listSetup(){
        for(int i = 0; i < this.profile.getTaskArray().size(); i++){
            add(new ListLabel(this.profile.getTaskArray().get(i)), 0, i);   
            add(new  ListLabel(this.profile.getAvailablePointsArray().get(i).toString()), 1, i);
            add(new ListCheckBox(), 2, i);
        }

        add(new ListButton(), 0, this.profile.getTaskArray().size());
    }

    /**
     * Setups up panel if the current page is the point redemption page
     */
    private void redeemSetup(){
        redeemPointsLabelOne = new RedeemLabel();
        redeemPointsLabelTwo = new RedeemLabel();

        redeemPointsLabelOne.setLabel("Points:");
        redeemPointsLabelTwo.setLabel(String.valueOf(this.profile.getPoints()));

        add(redeemPointsLabelOne, BorderLayout.CENTER);
        add(redeemPointsLabelTwo, BorderLayout.CENTER);
    }

    /**
     * Setups up panel if the current page is the add task page
     */
    private void addSetup(){
        addExitButton = new AddExitButton();
        addContinueButton = new AddContinueButton();
        addItemLabel = new AddLabel();
        addDateLabel = new AddLabel();
        addImportanceLabel = new AddLabel();
        addItemField = new AddField();
        addDateField = new AddField();
        addSlider = new AddSlider();

        //add components to panel
        add(addItemLabel, BorderLayout.NORTH);
        add(addItemField, BorderLayout.NORTH);
        add(addDateLabel, BorderLayout.CENTER);
        add(addDateField, BorderLayout.CENTER);
        add(addImportanceLabel, BorderLayout.SOUTH);
        add(addSlider, BorderLayout.SOUTH);
        add(addExitButton, BorderLayout.WEST);
        add(addContinueButton, BorderLayout.WEST);
    }

    /**
     * Returns usernameLabel for the purposes of confirming success loading page
     * @return usernameLabel
     */
    public UsernameLabel getUsernameLabel(){
        return this.usernameLabel;
    }

    /**
     * Returns usernameField for the purposes of loading the given profie
     * @return usernameField
     */
    public UsernameField getUsernameField(){
        return this.usernameField;
    }

    /**
     * Getter for addExitButton
     * @return addExitButton
     */
    public AddExitButton getAddExitButton(){
        return this.addExitButton;
    }

    /**
     * Getter for addContinueButton
     * @return addContinueButton
     */
    public AddContinueButton getAddContinueButton(){
        return this.addContinueButton;
    }

    /**
     * Getter for addItemLabel
     * @return addItemLabel
     */
    public AddLabel getAddItemLabel(){
        return this.addItemLabel;
    }

    /**
     * Getter for addDateLabel
     * @return addDateLabel
     */
    public AddLabel getAddDateLabel(){
        return this.addDateLabel;
    }

    /**
     * Getter for addImportanceLabel
     * @return addImportanceLabel
     */
    public AddLabel getAddImportanceLabel(){
        return this.addImportanceLabel;
    }

    /**
     * Getter for addItemField
     * @return addItemField
     */
    public AddField getAddItemField(){
        return this.addItemField;
    }

    /**
     * Getter for addDateField
     * @return addDateField
     */
    public AddField getAddDateField(){
        return this.addDateField;
    }

    /**
     * Getter for addSlider
     * @return addSlider
     */
    public AddSlider getAddSlider(){
        return this.addSlider;
    }

    /**
     * Setter for profile
     * @param profile Profile to set profile to
     */
    public void setProfile(Profile profile){
        this.profile = profile;
    }
}
