import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int rem,count=0,sum=0;
    int temp=num;
                       

        

        while (temp!=0) { 
            temp=temp/10;
            count=count+1;
}
 temp=num;
          while (temp!= 0) {
            rem=temp%10;
            sum=sum+(int)Math.pow(rem,count);
            temp=temp/10;
}


            
        
        if (sum==num) {
            System.out.println("armstrong number");
        }
        
        
         else{
            System.out.println("not armstrong");
        
        }
        sc.close();

           
        
    }
    
}


