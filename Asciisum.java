public class Asciisum {

    public static void main(String[] args) {
        String s = "ram123";
        int digitSum = 0;

        System.out.println("ASCII values of letters:");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                digitSum += ch - '0'; 
            } else if (Character.isLetter(ch)) {
                System.out.println(ch + " = " + (int) ch);
            }
        }

        System.out.println("Sum of digits: " + digitSum);
    }
}

    
