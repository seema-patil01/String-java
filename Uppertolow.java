public class Uppertolow {
    public static void main(String[] args) {
        String s="Java Is Easy";
        String res=convert(s);
        System.out.println(res);
    }
    public static String convert(String s){
        char[]ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(i==0||ch[i-1]==' '){
                if(ch[i]>='A'&&ch[i]<='Z'){
                 ch[i]+=32;

                }
            }
            
        }
        return new String(ch);
    }
}
