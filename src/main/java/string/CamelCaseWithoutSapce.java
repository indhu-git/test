package string;

public class CamelCaseWithoutSapce {
    public static void main(String[] args) {
        String s = "indhumathi is software engineer";
        String[] arr = s.split(" ");
        String output = "";
        for(int i = 0; i<arr.length;i++){
            String splitWord = arr[i];
            splitWord = splitWord.substring(0, 1).toUpperCase()+splitWord.substring(1);
            System.out.println(splitWord);
            output= output+" "+splitWord;

        }
        System.out.println(output.trim());
    }
}
