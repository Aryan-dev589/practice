import java .util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();

        if(n>m){
            if(n>p){
                System.out.println("largest number is "+ n);
            }
            else   {
                System.out.println("largest number is "+ p);
            }
        }
        else if (m>n) {
            if(m>p){
                System.out.println("largest number is "+ m);
            }
            else   {
                System.out.println("largest number is "+ p);
            }
        }
        else if(p>m){
            if(p>n){
                System.out.println("largest number is "+p);
               }
            else   {
                    System.out.println("largest number is "+ n);
               }
        }
        
        
     sc.close();
 }
}

    

