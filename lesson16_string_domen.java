
public class lesson16_string_domen {
    
    public void email1(String s){ //withoit using loop statemets
      int c1 = s.indexOf('@');
      int c2 =s.indexOf('.');
      
      int c3 = s.indexOf('@', c2+1);
      int c4 = s.indexOf('.', c2+1);
      
      int c5 = s.indexOf('@', c4+1);
      int c6 = s.indexOf('.', c4+1);
      
          System.out.println(s.substring(c1 + 1, c2));
        System.out.println(s.substring(c3 + 1, c4));
        System.out.println(s.substring(c5 + 1, c6));
    }
    
    public void email2(String s){ //with using loop statements 
        int a =0; //position of @
        int b =0; //position of .
        int c =0; //position of ;
        
        while (c<s.length()-1){
            
         a=s.indexOf('@', c);
         b=s.indexOf('.', c);
         c=s.indexOf(';',c+1);
         
        System.out.println(s.substring(a+1, b));
         
        }
    }
    
    public static void main(String[] args) {
     lesson16_string_domen h1 = new lesson16_string_domen();
     h1.email2("ya@yahoo.com; on@mail.ru; ona@yandex.ru;");
        
    }
}
