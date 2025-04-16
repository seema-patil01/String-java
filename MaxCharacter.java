public class MaxCharacter {
    
    public static void main(String[] args) {
        String s = "javvva";
        char[] ch = s.toCharArray();
        int maxCount = 0;
        char maxChar = ch[0];
        

        for (int i = 0; i < ch.length; i++) {
            
            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }

            if (count>maxCount) {
                maxCount = count;
                maxChar = ch[i];
                
            }
        }

        System.out.println(maxChar+ " = " + maxCount);
    }
}
