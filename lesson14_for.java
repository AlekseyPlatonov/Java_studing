
public class lesson14_for {
    
    public static void vyvod(){
        OUTER: for (int h=0; h<=6; h++){
            INNER1: for (int m=0; m<=59; m++){
                if(h>1&&m%10==0){break OUTER;}
                INNER2: for (int s=0; s<=59; s++){             
                   if(s*h>m){continue INNER1;}
                   System.out.println(h+":"+m+":"+s);
               } 
            }
        }
    }
    
    public static void main(String[] args) {
        vyvod();
    }
}
