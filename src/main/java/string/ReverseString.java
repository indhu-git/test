package string;

public class ReverseString {
    //Reverse the word in the sentence

    public static void main(String[] args) {
        String s = "My Name is Indhumathi";
        String[] array = s.split(" ");
        for (int i = 0; i<array.length;i++){
            for(int j = array[i].length()-1; j>=0; j--){
                System.out.print(array[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
