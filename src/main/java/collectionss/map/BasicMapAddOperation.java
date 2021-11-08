package collectionss.map;

import java.util.HashMap;
import java.util.Map;

public class BasicMapAddOperation {
    public static void main(String []args){
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Indhu");
        map.put(1, "Mathi");
        map.put(2, "Nigizh");
        map.put(3, "Thileeban");

        for(int i = 0; i<map.size();i++){
            System.out.println(map.get(i));
        }
    }
}
