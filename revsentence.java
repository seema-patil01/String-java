public class revsentence {
 
      public static void main(String[] args) {
        String s="java very easy";
        System.out.println(rev(s));
      }  
      public static String rev(String s){
        int i=s.length()-1;
        int j=s.length()-1;
        String res="";
        while (i>=0) {
            while (i>=0&&s.charAt(i)!=' ') 
               i--;
               int k=i+1;
                while (k<=j) {
                    res+=s.charAt(k);
                    k++;
    
                }
                if(i>0)
                res+=" ";
                i--;
                j=i;
            }
           return res;
        }
      }
    
     
