package Java_study;
public class lesson18_arrays_sorting2 {
    public static void showArray (String a[][]){
        System.out.print("{");
        for (int i=0; i<a.length;i++){
                System.out.print("{");
            for (int j=0; j<a[i].length; j++){
                if (j!=a[i].length-1){
                    System.out.print(a[i][j]+",");
                }
                    else {
                           System.out.print(a[i][j]+"}");
                            }
            }
            if (i!=a.length-1){
            System.out.print(",");
            }
            else{
                System.out.print("}");
            }
        }
    }
    
    public static void main(String[] args) {
       String a[][] ={{"a","b"},{"c"},{"d","e"}};
       showArray(a);
    }
    
}
