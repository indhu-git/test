package string;

import java.util.LinkedList;
import java.util.List;

public class StringTokenFromSentence {
    //Program to split the words into separate.
    //For example Sentence is abc bas sdfs dfg "adskf sdgdfl" sfsad "sdfsdfg sdf"
    public static void main(String[] args) {
        String input = "Indhumathi is working in \"automation Testing\" with \"java and selenium\" and also javascript and protractor";

        List<String> lists = new LinkedList<String>();
        String[] stringArray = input.split(" "); // splitting the sentence using space.

        String temp = "";

        for(int i = 0 ; i<stringArray.length; i++){
            if(stringArray[i].startsWith("\"") || temp.length()!=0){  // If the word start with double quotes then add value to the temp
              if(Character.isLetter(stringArray[i].charAt(stringArray[i].length()-1))){  // Checking whether the last character is Letter or double quotes
                  temp += " "+stringArray[i];  //if not then we are adding value to temp string
              } else {
                  temp += " "+stringArray[i]; //If the last character is double quotes then adding the word to temp and adding value to list and making temp as empty for next iteration
                  lists.add(temp);
                  temp = "";
                }
            }else {
                lists.add(stringArray[i]);    //If the character is not start with double quotes then directly add to the list.
            }
        }
        System.out.println(lists);
    }
}
