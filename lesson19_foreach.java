package Java_study;
import java.util.Arrays;
public class lesson19_foreach {
    public static String[] abc(String[]... array1){
        int c=0;
       for (String[] array2:array1){
            c+=array2.length;
        } 
        
       String[] s1 = new String[c]; 
       int count = 0;
       for (String[] s:array1){
           for (String ss:s){
           s1[count]=ss; 
           count++;
           }
       }  
         
        return s1;
    }
    
    public static void main(String[] args) {
        String[] s2 = {"a2","b2","1"};
        String[] s3 = {"a3","b3","22"};
        System.out.println(Arrays.toString(abc(s2,s3))); 
       
    }
}
