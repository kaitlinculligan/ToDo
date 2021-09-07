/**
 * The frame used for the program as part of java swing
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */

package UIElements;

 import Program.*;
 import java.awt.*;
 import javax.swing.*;



public class SimpleFrame extends JFrame{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    private SimplePanel panel;

    /**
     * Constructor
     */
    public SimpleFrame(){
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    /**
     * Initializes frame according to the needed parameters
     */
    public void initialize(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(true);
        setTitle("ToDo");

        setVisible(true);
    }

    /**
     * handles changing the used panel when the page changes
     * @param page the page being changed to
     */
    public void pageChange(String page){
        if(panel == null){
         panel = new SimplePanel(this);
         panel.initialize(page);
         add(panel);
        }else{
            remove(panel);
            panel = new SimplePanel(this);
            panel.initialize(page);
            add(panel);
        }
    }

    /**
     * Returns the panel for the purposes of checking GUI/program status
     * @return panel
     */
    public SimplePanel getPanel(){
        return panel;
    }

    public void setPanelProfile(Profile profile){
        if(this.panel != null){
            this.panel.setProfile(profile);
        }
    }
}