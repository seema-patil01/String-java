
    import java.util.Scanner;
public class dupli {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Convert to lowercase and split into words
        String[] words = input.toLowerCase().split("\\s+");
        boolean[] visited = new boolean[words.length];

        int duplicateCount = 0;

        System.out.println("Duplicate words:");

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > 1) {
                System.out.println(words[i] + ": " + count);
                duplicateCount++;
            }
        }

        System.out.println("Total duplicate words: " + duplicateCount);
    }
}


