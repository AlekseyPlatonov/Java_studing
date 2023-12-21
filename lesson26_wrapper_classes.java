package lesson26;
import java.util.ArrayList;
public class lesson26_wrapper_classes {
    public static void main(String[] args) {
     ArrayList<Integer> list1 = new ArrayList<>();
     list1.add(10); //autoboxing
     Long L = 50l; //autoboxing
     
     int i = list1.get(0); //unboxing
     Integer I = new Integer(12);
     int i2 = I; //unboxing
     
     String s1 = "50";
     int i3 = Integer.parseInt(s1);
     
     String s2 = "true"; //everything not "true" parse to false
     boolean b1 = Boolean.parseBoolean(s2);
     
     String s3 = "3.14";
     Integer i4 = Integer.valueOf(10);
     Double d2 = Double.valueOf(s3);
     
    }
}
