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
