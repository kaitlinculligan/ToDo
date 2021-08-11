/**
 * Algorithm that determines the combined value of a task given its category and how soon it is due
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */
public class PointsAlg {
    private int importWeight = 1.5;
    private int groupWeight = 2.5;
    private int timeWeight = 2;
    private ItemAnalyzer item = new ItemAnalyzer();
    private DateAnalyzer date = new DateAnalyzer();

    public PointsAlg(){}

    public int calculatePoints(String importance, String item, String date){
        int itemValue = item.findValue(item);
        int dateValue = date.findValue(date);
        int importanceValue = this.findValue(importance);

        return this.addition(itemValue, dateValue, importanceValue);

    }

    private int findValue(String s){
        return Integer.parseInt(s);
    }

    private int addition(int item, int date, int importance){
        int x = item * this.groupWeight;
        int y = date * this.timeWeight;
        int z = importance * this.importWeight;
        return x + y + z;
    }
}
