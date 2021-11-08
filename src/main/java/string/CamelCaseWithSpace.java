package string;

public class CamelCaseWithSpace {
    // Program for change the sentence in to title case with retain the space.
    public static void main(String[] args) {
        String input = " my   name   is   Indhumathi  ";
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                output += Character.toUpperCase(input.charAt(i));
            } else if (Character.isSpaceChar(input.charAt(i - 1)) && Character.isLetter(input.charAt(i))) {
                output += Character.toUpperCase(input.charAt(i));
            } else {
                output += input.charAt(i);
//                Character.isSpaceChar()
//                Character.
            }
        }
        System.out.println(output);
    }
}
