/**
 * Storage Unit for individual profiles (usernames and points)
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */

package Program;

import java.util.*;

public class Profile {
    private String username;
    private int points;
    private ArrayList<String> tasks = new ArrayList<>();
    private ArrayList<Integer> availablePoints = new ArrayList<>();

    /**
     * Constructor for a new profile
     * @param username name for profile
     */
    public Profile(String username){
        this.username = username;
        this.points = 0;
    }

    /**
     * Constructor for a loaded in profile
     * @param username profile name
     * @param points profile points
     */
    public Profile(String username, int points){
        this.username = username;
        this.points = points;
    }

    /**
     * Getter for username
     * @return username
     */
    public String getUsername(){
        return this.username;
    }

    /**
     * Getter for points
     * @return points
     */
    public int getPoints(){
        return this.points;
    }

    /**
     * Adds points to total
     * @param toAdd points to add
     */
    public void addPoints(int toAdd){
        this.points += toAdd;
    }

    /**
     * Subtract points to total
     * @param toSubtract points to subtract
     */
    public void subtractPoints(int toSubtract){
        this.points -= toSubtract;
    }

    /**
     * Adds task and corresponsing points to list
     * @param task task to complete
     * @param points Points for doing task
     */
    public void addTask(String task, int points){
        this.tasks.add(task);
        this.availablePoints.add(points);
    }
    
    /**
     * Getter for the task ArrayList
     * @return taskArray
     */
    public ArrayList<String> getTaskArray(){
        return this.tasks;
    }

    /**
     * Getter for the availablePoints ArrayList
     * @return availablePointsArray
     */
    public ArrayList<Integer> getAvailablePointsArray(){
        return this.availablePoints;
    }

    /**
     * Adds points for task to point total, and removes task and points from list
     * @param task
     */
    public void completeTask(String task){
        int index = this.tasks.indexOf(task);
        addPoints(this.getAvailablePointsArray().get(index));
        this.tasks.remove(index);
        this.availablePoints.remove(index);
    }
}
