
public class lesson3_operators {
    public static void main(String[] args) {
     System.out.println("task1");
        int i1 = 5; 
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        
        result = i2/d1+d2%i1-l;
        
     System.out.println(result);
     
     System.out.println("task2");
        int a = 5;
        int result2 =a-- - --a+ ++a+a++ +a; 
      System.out.println(result2);  
      System.out.println(a);  
        
      System.out.println("task3");
        int b = 8;
        int result3 =++b - b++ + ++b - --b; 
      System.out.println(result3);  
      System.out.println(b);
    }
}
