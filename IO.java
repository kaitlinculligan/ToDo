public class IO {
    private Profile profile;

    public IO(){}

    public void saveProfile(){

    }

    public void loadProfile(String username){

    }

    public Profile getLoadedProfile(){
        return this.profile;
    }
    
    public void input(String inputType, String inputValue){
        if(inputType.equals("load profile")){
            this.loadProfile(inputValue);
        }
        else if(inputType.equals("save profile")){
            this.saveProfile();
        }
    }

    public void output(){}
    
}
