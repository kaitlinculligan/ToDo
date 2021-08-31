/**
 * Class holds all UI for whole program
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */

 import java.awt.*;
 import javax.swing.*;

public class UI {
    
    private Profile profile;
    private IO io = new IO();

    private Profile getLoadedProfile(){
        return this.profile;
    }

    public static void main(String[] args){
         EventQueue.invokeLater(() -> {
             var frame = new SimpleFrame();
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             frame.setVisible(true);
             frame.setResizable(true);
             frame.setTitle("ToDo");
             var usernameField = new UsernameField();
             var usernameButton = new UsernameButton();

             if(!usernameField.getText().equals("Enter Profile Name") && usernameButton.isEnabled()){
                 //change to the task list page as designed
             }
         });
    }
}

class SimpleFrame extends JFrame{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public SimpleFrame(){
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}

class UsernameField extends JTextField{


    public UsernameField(){
        super("Enter Profile Name");
    }
}

class UsernameButton extends JButton{

    public UsernameButton(){
        super("Continue");
    }
}