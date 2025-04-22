public class Halfreve {
  public static void main(String[] args) {
    String s="java";
int len=s.length();
int half=len/2;
for(int i=half-1;i>=0;i--){
    System.out.print(s.charAt(i));
}
for(int i=half;i<len;i++){
    System.out.print('#');
}

  }  
}
