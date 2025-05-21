public class vowels {
    public static void main(String[] args) {
        String input = "india";
String vowels = "aeiou";

for (int i = 0; i < vowels.length(); i++) {
    char ch = vowels.charAt(i);
    if (input.indexOf(ch) == -1) {
        System.out.print(ch + " ");
    }
}

    }
}
