public class Removedup {
    public static void main(String[] args) {
        String s="javvvaaaa";
        char[]ch=s.toCharArray();
        String res="";
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j])
                ch[j]='\u0000';

            }
            res+=ch[i];
        }
        System.out.println(res);
        
    }
}
