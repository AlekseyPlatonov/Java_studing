
public class lesson2_data_types {
   public static void main(String[] args) { 
    
    System.out.println("first");
    byte b1 = 12;
    byte b2 = 0b1100;
    byte b3 = 014;
    byte b4 = 0xC;
   
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
    
    short s1 = 1300;
    short s2 = 0b0101_0001_0100;
    short s3 = 02424;
    short s4 = 0x514;
    
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    
    int i1 = 0;
    int i2 = 0b0;
    int i3 = 00;
    int i4 = 0x0;
    
    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);
    System.out.println(i4);
    
    long l1 = 123_456_789L;
    long l2 = 0b0111_0101_1011_1100_1101_0001_0101L;
    long l3 = 0726_746_425L;
    long l4 = 0x75BCD15;
    
    System.out.println(l1);
    System.out.println(l2);
    System.out.println(l3);
    System.out.println(l4);
    
    System.out.println("");
    System.out.println("second");
    
    float f1 = 1.2f;
    float f2 = 2.2f;
    
    System.out.println(f1);
    System.out.println(f2);
    
    double d1 = 1.0002;
    double d2 = 2.0002;
    
    System.out.println(d1);
    System.out.println(d2);
    
    boolean bl1 = true;
    boolean bl2 = false;
    
    System.out.println(bl1);
    System.out.println(bl2);
    
    System.out.println("");
    System.out.println("third");
    
    char c1 = 'a';
    char c2 = 174;
    char c3 = '\u00AE';
    
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    
   }   
}
