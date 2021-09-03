/**
 * Storage Unit for individual profiles (usernames and points)
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */

import java.util.*;

public class Profile {
    private String username;
    private int points;
    private ArrayList<String> tasks = new ArrayList<>();
    private ArrayList<Integer> availablePoints = new ArrayList<>();

    public Profile(String username){
        this.username = username;
        this.points = 0;
    }

    public Profile(String username, int points){
        this.username = username;
        this.points = points;
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

    public void addTask(String task, int points){

    }
    
}
