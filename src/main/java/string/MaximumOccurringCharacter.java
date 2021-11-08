package string;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurringCharacter {

    //How to find the maximum occurring character in a given String
    public static void main(String[] args) {

        String string = "Today is Monday";
        //Count number of occurrence for 'a' character.

        String[] array = string.split("");

        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < array.length; i++){

            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);
            }else {
                map.put(array[i], 1);
            }
        }

        System.out.println("Number of occurrences for a "+map.get("a"));

    }
}
