
public class lesson6_overloading {
    
    int id;
    String name;
    String surname;
    int course;
    double math;
    double econ;
    double phys;
    lesson6_overloading(){}
    
    lesson6_overloading(int id2, String name2, String surname2, int course2, double math2, double econ2, double phys2){
       id = id2; 
       name = name2;
       surname=surname2;
       course = course2;
       math = math2;
       econ = econ2;
       phys = phys2;
    }
 
    lesson6_overloading(int id2, String name2, String surname2, int course2){
        this(id2, name2, surname2, course2, 0,0,0);  
    }  


    double avg_(lesson6_overloading st){
        double avg = (st.econ+st.phys+st.math)/3;
        System.out.println(avg);
        return avg;
    }
    
    public static void main(String[] args) {
     lesson6_overloading st1 = new lesson6_overloading(1, "Alex", "Platonov", 7, 5,5,5);
     st1.avg_(st1);
     
     lesson6_overloading st2 = new lesson6_overloading(1, "Ivan", "Petrov", 1);
     st2.math=4;
     st2.phys=3;
     st2.econ=4;
     st2.avg_(st2);
     
     lesson6_overloading st3 = new lesson6_overloading();
     st3.id = 3;
     st3.name = "Akakiy";
     st3.surname = "Ivanoff";
     st3.course = 2;
     st3.math=5;
     st3.phys=4;
     st3.econ=4;
     st3.avg_(st3);
     
    }
}