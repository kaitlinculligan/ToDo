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


    public void saveProfile(){

    }

    public void loadProfile(String username){

    }

    public Profile getLoadedProfile(){
        return this.profile;
    }

    public static void main(String[] args){
         EventQueue.invokeLater(() -> {
             var frame = new SimpleFrame();
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             frame.setVisible(true);
             frame.setResizable(true);
             frame.setTitle("ToDo");
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
