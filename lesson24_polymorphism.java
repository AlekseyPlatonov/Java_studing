package Java_study;
public class lesson24_polymorphism {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Karl");
        Animal a2 = new Pinguin("Prapor");
        Animal a3 = new Lev("Sergey");
        
        Fish f1 = new Mechenosec("KarlII");
        
        Bird b1 = new Pinguin("Sergant");
        
        Mammal m1 = new Lev("Alexandr");
        
        Mechenosec mec1 = new Mechenosec("John");
        
        Pinguin p1 = new Pinguin("Prapor");
        
        Lev l1 = new Lev("Izabella");
        
        Speakable s1 = new Pinguin("Rico");
        Speakable s2 = new Lev("Nastya");
        
Animal[] aa = {a1,a2,a3,f1,b1,m1,mec1,p1,l1};
Speakable[] ss = {s1,s2,l1,p1,m1,b1};

for(Animal aa1:aa){
    if(aa1 instanceof Mechenosec){
        System.out.println();
        Mechenosec mm2 = (Mechenosec)aa1;
        System.out.println(mm2.name);
        mm2.eat();
        mm2.sleep();
        mm2.swim();
    }
    else if(aa1 instanceof Pinguin){
        System.out.println();
        Pinguin pp2 = (Pinguin)aa1;
        System.out.println(pp2.name);
        pp2.eat();
        pp2.fly();
        pp2.sleep();
        pp2.speak();
    }
        else if(aa1 instanceof Lev){
        System.out.println();
        Lev ll2 = (Lev)aa1;
        System.out.println(ll2.name);
        ll2.eat();
        ll2.sleep();
        ll2.speak();
        ll2.run();
    }
    System.out.println("_____________");
}    
        
for(Speakable ss1:ss){
    if(ss1 instanceof Bird){
    System.out.println();
        Bird bb1 = (Bird)ss1;
        System.out.println(bb1.name);
        bb1.eat();
        bb1.fly();
        bb1.sleep();
        bb1.speak();
    }
   else if(ss1 instanceof Lev){
        System.out.println();
        Lev lll1 = (Lev)ss1;
        System.out.println(lll1.name);
        lll1.eat();
        lll1.run();
        lll1.sleep();
    }
}       
             
        
    }
}

abstract class Animal{
    Animal (String name){
        this.name=name;
    }
    String name;
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal{
    Fish(String name){
        super(name);
        this.name=name;
    }
    void sleep(){
        System.out.println("A kak spayt rybi?"); 
    }
    abstract void swim();
}

abstract class Bird extends Animal implements Speakable{
    Bird(String name){
        super(name);
        this.name=name;
    }
    abstract void fly();
    @Override
    public void speak(){
        System.out.println(name+" sings");
    }
}

abstract class Mammal extends Animal implements Speakable{
    Mammal(String name){
        super(name);
        this.name=name;
    }
    abstract void run();
}

interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name=name;
    }
    void swim(){
        System.out.println("Mechenosec plavaet");
    }
    void eat(){
        System.out.println("Mechenosec est korm");
    }
}

class Pinguin extends Bird{
    Pinguin(String name){
        super(name);
        this.name=name;
    }
    void fly(){
        System.out.println("Pinguin ne letaet");
    }
    void eat(){
        System.out.println("Pinguin est rybu");
    }
    void sleep(){
        System.out.println("Pinguini spayt vmeste");
    }
    public void speak(){
        System.out.println("Pinguin ne poet kak solovey");
    }
}

 class Lev extends Mammal{
     Lev(String name){
        super(name);
        this.name=name;
    }
    void eat(){
        System.out.println("Lev est myaso");
    }
    void sleep(){
        System.out.println("Lev spit bolshuu chast dnya");
    } 
    void run(){
        System.out.println("Lev - ne samay bistaray koshka");
    }
 }

