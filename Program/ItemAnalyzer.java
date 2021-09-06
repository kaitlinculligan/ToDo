/**
 * Class parses through input tasks, then determines the category task falls into, returns determine value of category
 * 
 * @version 1.0
 * @since 1.0
 * @author Kaitlin Culligan
 */

package Program;

import java.util.ArrayList;

public class ItemAnalyzer{
    private ArrayList<Category> categories = new ArrayList<>();
    private ArrayList<String> categoryOfWord = new ArrayList<>();
    private ArrayList<String> parsedString = new ArrayList<>();

    public ItemAnalyzer(){
        categories.add(new Category("School", ["study", "assignment", "exam", "quiz"], 5));
        //need to think of more categories
    }

    public int findValue(String i){
        this.parseString(i);
        for(String j : parsedString){
            int check = this.categories.checkIfKeyword(j);
            if(check != -1){
                this.categoryOfWord.add(this.categories.get(j).getCatName());
            }
        }
        String category = this.findNumInCat();
        int index = this.categories.indexOf(category);
        return this.categories.get(index).getValue();
    }

    private String findNumInCat(){
        ArrayList<String> usedCats = new ArrayList<>();
        ArrayList<Integer> numCats = new ArrayList<>();
        for(String cat : categoryOfWord){
            if(usedCats.contains(cat)){
                numCats.add(1, usedCats.indexOf(cat));
            }
            else{
                usedCats.add(cat);
                numCats.add(1);
            }
        }
        int highest = 0;
        int highestIndex = 0;
        for(int i: numCats){
            if(numCats.get(i) > highest){
                highestIndex = i;
                highest = numCats.get(i);
            }
        }
        return usedCats.get(highestIndex);
    }
    
    private void parseString(String s){
        int start = 0;
        for(int i =0; i <s.length(); i++){
            if(i==0 || s.charAt(i-1) == ' '){
                start = i;
            }
            if(s.charAt(i) == ' '){
                parsedString.add(s.substring(start, i));
            }
        }
    }
}
