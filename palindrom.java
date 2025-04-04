public class palindrom {
     
    public static void main(String[] args) {
        String s="seema";
        if(ispalindrom(s)){
            System.out.println(s+" pallindrom string");
        }
        else{
            System.out.println(s+" is not palindrom String");
        }

    }
       public static boolean ispalindrom(String s){
     int i=0;
     int j=s.length()-1;
     while (i<j) {
     if(s.charAt(i)!=s.charAt(j)) 
    return false;
    i++;
    j--; 
   }
   return true;
       
    }
}
