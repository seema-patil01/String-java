public class wordcount {
   
    public static void main(String[] args) {
        String s = "Java is great and Java is fun.";
        String[] words = s.split("\\s+");
        System.out.println("Number of words using split(): " + words.length);
    }
}

