public class Remdup {

    public static void main(String[] args) {
        String s1="javadev";
        String s2="";
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(!s2.contains(ch+""))
            s2+=ch;
        }
        System.out.println(s2);
    }
}
