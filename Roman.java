public class Roman {
    
    public static void main(String[] args) {
        int number = 3549;
        System.out.println("Roman numeral: " + convertToRoman(number));
    }

    public static String convertToRoman(int number) {
        // Arrays of decimal and corresponding Roman numerals
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40,  10, 9,   5,  4,   1};
        String[] numerals = {"M", "CM", "D", "CD", "C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length && number > 0; i++) {
            while (number >= values[i]) {
                result.append(numerals[i]);
                number -= values[i];
            }
        }

        return result.toString();
    }
}


