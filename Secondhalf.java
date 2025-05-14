public class Secondhalf {
    // ReverseSecondHalf 
        public static void main(String[] args) {
            String input = "abcdefghijk";
            String result = reverseSecondHalf(input);
            System.out.println("Result: " + result);  
        }
        public static String reverseSecondHalf(String input) {
            char[] chars = input.toCharArray();
            int length = chars.length;
            int half = length / 2;
    
           
            for (int i = 0; i < (length - half) / 2; i++) {
                char temp = chars[half + i];
                chars[half + i] = chars[length - 1 - i];
                chars[length - 1 - i] = temp;
            }
    
            return new String(chars);
        }
    
        
    }
    

