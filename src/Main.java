public class Main {
    public static void main(String[] args) {

        System.out.println(reverseString("Akademia108"));
    }

    public static String reverseString (String str) {
        String newStr = "";
        char currentChar;

        for (short i=0; i<str.length(); i++) {
            currentChar = str.charAt(i);
            newStr = currentChar+newStr;
        }
        return newStr;
    }
}