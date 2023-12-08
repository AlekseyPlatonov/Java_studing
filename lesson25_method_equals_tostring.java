package Java_study;
public class lesson25_method_equals_tostring {
    public static void main(String[] args) {
        car c1 = new car("red","V8");
        car c2 = new car("red","V8");
        car c3 = new car("blue","V6");
        car c4 = c3;
        
        System.out.println(c2.equals(c1));
        System.out.println(c1.toString());
    }
}

class car{
    String color;
    String engine;
    
    car(String color,String engine){
        this.color = color;
        this.engine = engine;
    }
    
    @Override 
    public boolean equals(Object o){
        if (o instanceof car){
            car c = (car)o;
        return (this.color==c.color&&this.engine==c.engine);    
        }
        return false;
        }
    
    public String toString(){
        String s = ("Car color: "+color+", engine: "+engine);
        return s;
    }
    }