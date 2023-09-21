package Java_study;
public class lesson22_incapsulation {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setcousre(4);
        s1.setgrade(8);
        s1.setname(new StringBuilder("Anton"));
        
        student s2 = new student();
        s2.setcousre(1);
        s2.setgrade(9);
        s2.setname(new StringBuilder("Antonina"));
        
        s2.info();
    }
    
}

class student{
    private StringBuilder name;
    private int course;
    private int grade;
    
    public StringBuilder getname(){
    StringBuilder name2 = new StringBuilder(name);
    return name2;
}
    
    public int getcorse(){
    return course;
}
    
    public int getgrade(){
    return grade;
}
    
    public void setcousre(int course){
    if(course>=1&&course<=4){
        this.course=course;
    }
    }
    
    public void setgrade(int grade){
    if(grade>=1&&grade<=10){
        this.grade=grade;
    }
    }
    
    public void setname(StringBuilder name){
    if(name.length()>3){
        this.name=name;
    }
    }
    
    public void info(){
        System.out.println(getname());
        System.out.println(getcorse());
        System.out.println(getgrade());
    }
    
}