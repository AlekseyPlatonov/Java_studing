public class lesson11_car {
    
    String color;
    String motor;
    int dvery;
    
    lesson11_car(String color, String motor, int dveri){
        this.dvery = dveri;
        this.color = color;
        this.motor = motor;
}

    
   public static void changd(lesson11_car c1, int dver){
    c1.dvery = dver;
   }
   
   public static void swapecol(lesson11_car c1, lesson11_car c2){
     String a = c1.color;
     c1.color = c2.color;
     c2.color = a;
   }
   
    public static void main(String[] args) {
    
        lesson11_car c1 = new lesson11_car("Red","V6",5);
        lesson11_car c2 = new lesson11_car("Green","V12",3);
        System.out.println("Car1 before: "+c1.color+" "+c1.motor+" "+c1.dvery);
        System.out.println("Car2 before: "+c2.color+" "+c2.motor+" "+c2.dvery);

        changd(c1,3);
        changd(c2,5);
        swapecol(c1,c2);
        
        System.out.println("Car1 after: "+c1.color+" "+c1.motor+" "+c1.dvery);
        System.out.println("Car2 after: "+c2.color+" "+c2.motor+" "+c2.dvery);
    }
   }
