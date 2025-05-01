public class specal {
 
        public static void main(String[] args) {
           String string = "Kn@w Pr@gram";
           System.out.println("Actual String = " + string);
     
           string = string.replaceAll("[@]", "o");
           System.out.println("String after replacement = " + string);
        }
     }

