
public class lesson8_square {

static final double pi = 3.14;

double square (double r){
    return pi*r*r;
}

static double lenght (double r1) {
    return 2*pi*r1;
}

void info (double r2){
    System.out.println("info: Radius = "+r2);
    System.out.println("info: square = "+pi*r2*r2);
    System.out.println("info: lenght = "+2*pi*r2);
}

    public static void main(String[] args) {
     
    System.out.println("Square: "+lenght(2));
     
    lesson8_square h = new lesson8_square();
    System.out.println("Lenght: "+h.square(2));
    h.info(2);
    }
}


