package Lesson13_switch;
public class Month {
    
    static void n_month(int days){
        
        switch(days){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:    
            case 10:
            case 12:
                System.out.println("31 days in this month");  break;
            case 4:
            case 6:
            case 9:    
            case 11:    
                System.out.println("30 days in this month"); break;
            case 2:
                System.out.println("28 days in this month"); break;
            default:
                System.out.println("This month doesnt exist!");
        }
        
    }
    
    public static void main(String[] args) {
        n_month(12);
    }
}
