package list.arraylist;

import java.util.ArrayList;

public class AddAndRemoveOperation {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            list.add(String.valueOf(i));   //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 
        }
        System.out.println(list);

        for (int i = 8; i < 15; i++) {
            list.remove(String.valueOf(i));   // 0 1 2 3 4 5 6 7 15 16 17 18 19 
        }
        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(String.valueOf(i));        //0 1 2 3 4 5 6 7 15 16 17 18 19 0 1 2 3 4
        }
        System.out.println(list);
    }
}