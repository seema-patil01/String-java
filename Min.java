public class Min {
   
    public static void main(String[] args) {
       
      
        int minCount=Integer.MAX_VALUE;

        char minChar = ' ';
        String s1="javva";
       

        while(s1.length()!=0)
        {
            char ch=s1.charAt(0);
            String s2=s1.replace(ch+"","");
            int count=s1.length()-s2.length();
             if (count<minCount) {
                minCount = count;
                minChar = ch;
                
            }
            s1=s2;
            
        }
        

        System.out.println(minChar+ " = " + minCount);
    }
}
