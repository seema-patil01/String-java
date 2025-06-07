public class SpecRem {
 
    public static void main(String[] args) {
        String input = "java             is          easy";
        String output = "";
        boolean lastWasSpace = false;

        for (char ch : input.toCharArray()) {
            if (ch == ' ') {
                if (!lastWasSpace) {
                    output += " ";
                    lastWasSpace = true;
                }
            } else {
                output += ch;
                lastWasSpace = false;
            }
        }

        System.out.println(output.trim());
    }
}


