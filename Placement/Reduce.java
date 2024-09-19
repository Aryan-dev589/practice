import java.util.Scanner;

public class Reduce {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;

        while ((n>0)) {
            if(n%2!=0){
              n=n-1;
              c=c+1;
              if(n==0){
                break;
              }
            }
            n=n/2;
            c=c+1;
    
        }
    
        System.out.println("THE NUMBER OF STEPS REQUIRED TO REDUCE THE GIVEN NUMBER TO ZERO IS "+ c);

        sc.close();
    
    
}
}


    
    

