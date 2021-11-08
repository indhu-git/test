package number;

public class ExtractNumberFromString {
    public static void main(String[] args) {
        String s = "Your otp to login is 154652";
        String value = s.replaceAll("\\D", "");
        System.out.println(new Integer(value));
    }
}
