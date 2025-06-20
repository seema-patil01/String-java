public class EncodeString {
   
    public static void main(String[] args) {
        String input = "aabccadd";
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(count).append(input.charAt(i - 1));
                count = 1;
            }
        }

        System.out.println("Output: " + result.toString());
    }
}


