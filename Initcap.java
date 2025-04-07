public class Initcap {
    public static void main(String[] args) {
        System.out.println(inticap("java is easy"));
    }
public static String inticap(String s){
char[]ch=s.toCharArray();
for(int i=0;i<ch.length;i++){
    if(i==0||ch[i-1]==' '){
        if(ch[i]>='a'&&ch[i]<='z')
        ch[i]-=32;
    }
}
return new String(ch);
        
    }
}
