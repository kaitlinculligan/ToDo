/**
 * The menu used for the program as part of java swing
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */

package UIElements;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleMenu extends JMenu{

    private JMenuItem list;
    private JMenuItem redeem;

    public SimpleMenu(){
        super();
        this.list = new JMenuItem("list");
        this.redeem = new JMenuItem("redeem");

        add(this.list);
        add(this.redeem);
        
    }
    
}
