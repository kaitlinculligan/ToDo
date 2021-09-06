/**
 * Class analyzes dates and determines how far away they are, assigns value based on this
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */

package Program;

 import java.util.*;

public class DateAnalyzer{
    private Date today;
    private Date deadline;;

    public DateAnalyzer(){
        this.today = new Date();
    }

    /**
     * parses given date and provides a numerical value to determine point worth
     * @param date input value for deadline
     * @return weighting given to deadline
     */
    public int findValue(String date){
        long year = (Integer.parseInt(date.substring(6)) - 1970) * 31557600;
        year *= 1000;
        long month = (Integer.parseInt(date.substring(0,1)) - 1 ) * 86400000;
        long day = Integer.parseInt(date.substring(3,4)) * 86400000;

        long milliseconds = year + month + day;
        this.deadline = new Date(milliseconds);

        return (int) (this.deadline.getTime()-this.today.getTime()) / 15000;
    }

    
}
