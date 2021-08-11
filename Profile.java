/**
 * Storage Unit for individual profiles (usernames and points)
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */
public class Profile {
    private String username;
    private int points;

    public Profile(String username){
        this.username = username;
        this.points = 0;
    }

    public String getUsername(){
        return this.username;
    }

    public int getPoints(){
        return this.points;
    }

    public void setPoints(int toAdd){
        this.points += toAdd;
    }
}
