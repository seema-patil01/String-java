public class non_rep {

    public static void main(String[] args) {
        String s = "javavvvvvvv";
        char[] ch = s.toCharArray();
        boolean found = false;

        for (int i = 0; i < ch.length; i++) {
            int count = 0;

            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }

            if (count == 1) { 
                System.out.println("First non-repeating character: " + ch[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found.");
        }
    }
}
    

