public class HalfRevers {
    
        
        public static void main(String[] args) {
            String input = "abcdef";
           System.out.println(reverseHalf(input)); 
        }
        public static String reverseHalf(String input) {
            char[] chars = input.toCharArray(); 
            int half = chars.length / 2;
    
           
            for (int i = 0; i < half / 2; i++) {
                char temp = chars[i];
                chars[i] = chars[half - 1 - i];
                chars[half - 1 - i] = temp;
            }
    
           
            return new String(chars);
        }
    
    }
    

