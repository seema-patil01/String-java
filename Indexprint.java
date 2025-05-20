public class Indexprint {
    public static void main(String[] args) {
        String str = "banana";
        String done = ""; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (done.indexOf(ch) != -1) continue;

            System.out.print(ch + "=");

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    System.out.print(j);

                 
                    int next = str.indexOf(ch, j + 1);
                    if (next != -1) System.out.print(",");
                }
            }

            System.out.println();
            done += ch;
        }
    }
}
