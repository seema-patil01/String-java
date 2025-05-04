public class vowel {
    
        public static void main(String[] args) {
            String input = "javadev";
            String vowels = "aeiou";
            boolean found = false;
    
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
    
                
                if (vowels.contains(ch + "")) {
                    System.out.println(ch);
                    found = true;
                }
            }
    
            if (!found) {
                System.out.println("No vowels found");
            }
        }
    }
    

