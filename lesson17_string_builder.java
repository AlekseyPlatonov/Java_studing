package Java_study;
public class lesson17_string_builder {
    public static boolean ravenstvo1 (StringBuilder sb1, StringBuilder sb2){
        boolean b = false;
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        if (s1.equals(s2)){
            b = true;
        }
        return b;
    }
    
    public static boolean ravenstvo2 (StringBuilder sb1, StringBuilder sb2){
        boolean b = true;
        if (sb1.length()==sb2.length()){
            for(int i=0; i<sb1.length(); i++){
               if(sb1.charAt(i)!=sb2.charAt(i)){
                   b = false;
                   break;
               }
               }
            }
        else{
                   b = false;
        
    }
        return b;
    }
    
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hi");
        StringBuilder sb2 = new StringBuilder("hi");
        
        System.out.println(ravenstvo1(sb1,sb2));
        System.out.println(ravenstvo2(sb1,sb2));

    }
}
