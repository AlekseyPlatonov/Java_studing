package Java_study;
public class lesson22_inharitance {
    public static void main(String[] args) {
        dog d1 = new dog("Sharik");
        System.out.println(d1.paw);
        
        cat c1 = new cat("Murka");
        c1.sleep();
         
    }
}

class animal{
    animal(){
        System.out.println("I am animal!");
    }
    int eyes;
    void eat(){
        System.out.println("Animal eats");
    }
    void drink(){
        System.out.println("Animal drink");
    }
}

class pet extends animal{
    pet(){
        System.out.println("I am pet");
        eyes = 2;
    }
    String name;
    int tail = 1;
    int paw = 4;
    void run(){
        System.out.println("Pet jumps");
    }
}

class dog extends pet{
    dog(String name){
    this.name=name;
        System.out.println("I am dog and my name is "+this.name);
    }
    void play(){
        System.out.println("Dog plays");
    }
}

class cat extends pet{
    cat(String name){
    this.name=name;
        System.out.println("I am cat and my name is "+this.name);
    }
    void sleep(){
        System.out.println("Cat sleeps");
    }
}
