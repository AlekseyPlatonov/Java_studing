package Java_study;
import java.util.Arrays;
import java.util.ArrayList;
public class lesson20_ArrayList {
    public static void abc(String...s){
        ArrayList <String> list = new ArrayList<>(s.length);
        for (int i=0; i<s.length; i++){
           if(!list.contains(s[i])){
               list.add(s[i]);
           }
        }
         
        System.out.println(list);
    }
    
    public static void main(String[] args) {
        abc("a","b","a","d","d","a","c");
    }
}