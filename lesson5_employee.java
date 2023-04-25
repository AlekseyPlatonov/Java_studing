
public class lesson5_employee {
    lesson5_employee (int id1, String surname1, int age1, int salary1){
        
     id=id1;   
     surname=surname1;   
     age=age1;   
     salary=salary1;
     
    }
    
    int id;
    String surname;
    int age;
    int salary;
    
    int Uvelzp (){ //Так как описываемый объект и метод содержатся в одном классе, делать шаблон с подачей на вход объекта не обязательно
        salary*=2;
        return salary;
    }

    public static void main(String[] args) {
     
    lesson5_employee e1= new lesson5_employee(1, "Ivanov", 25, 25000);    
    lesson5_employee e2= new lesson5_employee(2, "Katz", 32, 250000);    
     
    e1.Uvelzp();
    e2.Uvelzp();
        
    System.out.println("New ZP "+e1.surname+" ="+e1.salary);
    System.out.println("New ZP "+e2.surname+" ="+e2.salary);
    }
}


