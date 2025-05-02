public class Thirdlarge {
    public static void main(String[] args) {
        String s="java is easy language";
        String[]words=s.split(" ");
        for(int i=0;i<words.length-1;i++){
            for(int j=0;j<words.length-1-i;j++){
                if(words[j].length()<words[j+1].length()){
                    String temp=words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp;
                }
            }
        }
        int count=0;
        String Third="";
        for(int i=0;i<words.length;i++){
            count++;
            if(count==3){
                Third=words[i];
                break;
            }
        }
        if(!Third.equals("")){
            System.out.println(Third);
        }else{
            System.out.println("less than 3 words");
        }
    }
}
