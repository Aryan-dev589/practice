

import java.util.Scanner;
    public class identity{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int empID=sc.nextInt();
            String department=sc.next();

            switch (empID) {
                case 1:
                    System.out.print("ARYAN MISHRA");
                    break;
                
                case 2:
                    System.out.print("ANIRBAN MUKHERJEE");
                    break;
                
                case 3:
                System.out.println("ARYAN KESHRI");
                
                switch(department){
                    case"IT":
                        System.out.println("IT DEPARTMENT");
                        break;
                    
                    case"MANAGEMENT":
                        System.out.println("MANAGEMENT DEPARTMENT");
                        break;
                    
                    default:
                    System.out.println("NO DEPARTMENT ENTERED");
                    
                }
                break;

                default:
                System.out.println("ENTER CORRECT empID");
            
        }
        sc.close(); 
    }
}
                
    

