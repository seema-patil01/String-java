public class Encrept {
    public static void main(String[] args) {
System.out.println(encode("xyz", 2));
System.out.println(decode("abc", 2));
        
    }
    public static String encode(String s,int n){
    char[]ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(ch[i])){
                ch[i]=((char) (((((ch[i]-'a'+n)%26)+26)%26)+'a'));
            }
        }
      return new String(ch);
}
public static String decode(String s,int n){
    return encode(s, -n);
}
}
