package Java_study;
import java.util.Arrays;
public class lesson18_arrays_sorting1 {
int [] sortirovka (int[] a){ //bubble
    int ai;    
    for (int i=0;i<a.length;i++){
    int min = a[i];
    int index =i;
    
    for (int j=i+1; j<a.length; j++){
        if (a[j]<min){
            min = a[j];
            index = j;
        }
    }
    
    if(i!=index){
        ai = a[i];
        a[i] = a[index];
        a[index]=ai;
    }
    
    }
    
    return a;
}    
    

public static void main(String[] args) {
     lesson18_arrays_sorting1 s1 = new lesson18_arrays_sorting1();
     int a [] = {2,1,-4,0};
     int b [] =a;
     s1.sortirovka(a);
     Arrays.sort(b);
     
     for (int i=0; i<a.length;i++){
         System.out.println(a[i]);
     }
     
     System.out.println(Arrays.toString(b));
    }
}


