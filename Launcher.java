/**
 * Launches and runs the program
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */
import UIElements.*;

public class Launcher {

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
