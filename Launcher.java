/**
 * Launches and runs the program
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */
import UIElements.*;
import java.awt.*;
import javax.swing.*;

public class Launcher {

    private Profile profile;
    private IO io = new IO();

    private Profile getLoadedProfile(){
        return this.profile;
    }
    
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            var frame = new SimpleFrame();
            frame.initialize();
            frame.pageChange("username");
            
            //need to write the rest of the programs functionality here
        });
   }
}
