public class marge {
    
    public static void main(String[] args) {
        String s1 = "Hello", s2 = "Bye";
        String result = "";
        
        int len = Math.max(s1.length(), s2.length());

        for (int i = 0; i < len; i++) {
            if (i < s1.length())
                result += s1.charAt(i);
            if (i < s2.length())
                result += s2.charAt(i);
        }

        System.out.println("Output: " + result);
    }
}


