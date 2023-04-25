
public class lesson12_if {
    int engine;
    int doors;
   public static boolean a = true;
   lesson12_if(int engine, int doors){
        this.engine = engine;
        this.doors = doors;
    }
   

    public static void main(String[] args) {
       lesson12_if c1 = new lesson12_if(12,5);
       lesson12_if c2 = new lesson12_if(6,3);
      
       if (c1.engine>c2.engine && lesson12_if.a)
         if (c1.doors>c2.doors) {
             System.out.println("Dvigatel i kolich drerey u pervoy car bolshe");}
         else {  
             System.out.println("Dvigatel pervoi car moshnee, a kolich drerei menshe");} 
       else {
          System.out.println("Dvigatel u pervoi car slabee");}  
    } 
}
