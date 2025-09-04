public class Langest {

    public static void main(String[] args) {
        String s = "pwwkew";
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String current = "";
            
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (current.indexOf(c) != -1) {
                    break;
                } else {
                    current += c; 
                }
                
               
                if (current.length() > longest.length()) {
                    longest = current;
                }
            }
        }
        
        System.out.println("Longest substring: " + longest);
        System.out.println("Length: " + longest.length());
    }
}


