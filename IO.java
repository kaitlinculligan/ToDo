/**
 * Class is responsible for IO for whole program
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */

import java.io.*;

public class IO {

    private Profile profile;

/**
 * Constructor for class
 */
    public IO(){
        profile = new Profile("placeholder");
    }

/**
 * Saves profile's points in a txt file names after the profile's username
 * 
 * @param profile profile to save
 */
    public void saveProfile(Profile profile){
        File f = new File("res/" + profile.getUsername() + ".txt");
        if(!f.exists()){
            try{
                f.createNewFile();
                FileWriter fw = new FileWriter(f);
                fw.write(String.toString(profile.getPoints()));
                fw.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        else{
            FileWriter fw = new FileWriter(f);
            fw.write(String.toString(profile.getPoints()));
            fw.close();
        }
    }

/**
* loads a profile with a given username, returns a profile with data
* @param username username of profile to load
* @return Profile object containing relavent point data
*/
    public Profile loadProfile(String username){
        File f = new File("res/" + username + ".txt");
        String line;
        int lineNum = 0;
        String task = null;
        if(f.exists()){
            try(BufferedReader br = new BufferedReader(new FileReader(f));){
                while((line = br.readLine()) != null){
                    if(lineNum == 0){
                        int points = Integer.parseInt(line);
                        this.profile = new Profile(username, points);
                    }
                    else if(lineNum%2 == 0){
                        this.profile.addTask(task, Integer.parseInt(line));
                    }
                    else{
                        task = line;
                    }
                    lineNum++;
                }
                return profile;
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        else{
            Profile error = new Profile("error", -1);
            return error;
        }
        return null;
    }

}
