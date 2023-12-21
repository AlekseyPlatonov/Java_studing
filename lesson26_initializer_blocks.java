package lesson26;
public class lesson26_initializer_blocks {
    public static void main(String[] args) {
        lion l1 = new lion();
    }
}

class animal{
    animal(){
        System.out.println("this is constructor of animal");
    }
    static{
        System.out.println("this is static init b of animal");
    }
    {
       System.out.println("this is init b of animal"); 
    } 
}

class mammal extends animal{
    mammal(){
        System.out.println("this is constructor of mammal");
    }
    static{
        System.out.println("this is static init b of mammal");
    }
    {
       System.out.println("this is init b of mammal"); 
    } 
}

class lion extends mammal{
    lion(){
        System.out.println("this is constructor of lion");
    }
    static{
        System.out.println("this is static init b of lion");
    }
    {
       System.out.println("this is init b of lion"); 
    } 
}