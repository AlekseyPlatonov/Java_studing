
public class lesson4_class_object_student {
    int nomer_bileta;
    String name;
    String surname;
    short god_obuch;
    float avg_math;
    float avg_economy;
    float avg_language;
    

    public static void main(String[] args) {
     lesson4_class_object_student st1 = new lesson4_class_object_student();
     lesson4_class_object_student st2 = new lesson4_class_object_student();   
     lesson4_class_object_student st3 = new lesson4_class_object_student();
     
    st1.nomer_bileta = 1; 
    st2.nomer_bileta = 2;     
    st3.nomer_bileta = 3;     
    st1.avg_economy = 3.4f;   
    st2.avg_economy = 4.5f; 
    st3.avg_economy = 4.8f;    
    st1.avg_math = 3.2f;    
    st2.avg_math = 4.3f;   
    st3.avg_math = 4.6f; 
    st1.avg_language = 4.2f;
    st2.avg_language = 3.8f;
    st3.avg_language = 4.5f;
    
    System.out.println("student 1 avg mark:"+st1.nomer_bileta+": "+(st1.avg_economy+st1.avg_math+st1.avg_language)/3);
    System.out.println("student 2 avg mark:"+st2.nomer_bileta+": "+(st2.avg_economy+st2.avg_math+st2.avg_language)/3);
    System.out.println("student 3 avg mark:"+st3.nomer_bileta+": "+(st3.avg_economy+st3.avg_math+st3.avg_language)/3);
   
    }
}
