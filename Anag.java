public class Anag {
    
   public static boolean isAnag(String s1,String s2){
    if(s1.length()!=s2.length())
    return false;
    else if(s1.length()==0&&s2.length()==0){
        return true;
    }
    char ch=s1.charAt(0);
    s1=s1.replace(ch+"","");
    s2=s2.replace(ch+"","");
    return isAnag(s1, s2);
   } 
   public static void main(String[] args) {
    String s1="silent";
    String s2="listen";
    System.out.println(isAnag(s1, s2));
   }
}
