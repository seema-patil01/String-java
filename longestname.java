public class longestname {
   
    public static void main(String[] args) {
        String[] arr = {"Apple", "Mango", "Orange", "Banana"};
        
        String longest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > longest.length()) {
                longest = arr[i];
            }
        }

        System.out.println("Output: \"" + longest + "\"");
    }
}


