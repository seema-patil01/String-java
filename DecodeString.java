public class DecodeString {
   
    public static void main(String[] args) {
        String input = "2a3b1c";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            int count = input.charAt(i) - '0'; 
            char ch = input.charAt(i + 1);

            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }

        System.out.println("Output: " + result.toString());
    }
}


