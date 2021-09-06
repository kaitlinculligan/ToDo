/**
 * Class is the storage unit for the different types of tasks
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */

package Program;

public class Category {
    private String catName;
    private String[] keyword;
    private int value;

    public Category(String name, String[] keyword, int value){
        this.catName = name;
        this.keyword = keyword;
        this.value = value;
    }

    public int checkIfKeyword(String s){
        for(int i = 0; i < keyword.length; i++){
            if(s.equals(keyword[i])){
                return i;
            }
        }
        return -1;
    }

    public String getCatName(){
        return this.catName;
    }

    public String getKeyword(int index){
        return this.keyword[index];
    }

    public int getValue(){
        return this.value;
    }
}
