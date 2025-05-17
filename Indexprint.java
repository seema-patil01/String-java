public class Indexprint {
  
    public static void main(String[] args) {
        String s = "banana";
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == current) {
                    flag= true;
                    break;
                }
            } 
            if (flag) {
                continue;
            }
              System.out.print(current + " = ");
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == current) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}


