import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1,sum=0;


        while ((i<n)) {
            if(n%i==0){
                sum=sum+i;
            }
          i=i+1;
        }
        if(sum==n){
            System.out.println("A PERFECT NUMBER"+" " +n);
        }
        else{
            System.out.println("NOT A PERFECT NUMBER"+" "+n);
        }
        sc.close();
    }

    
}
