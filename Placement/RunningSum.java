
import java.util.Arrays;
import java.util.Scanner;
public class RunningSum {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();

     int sum=0;

     int[] arr =new int[n];
     int[] a=new int[n];

     for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     for(int i=0;i<n;i++){
        sum=sum+arr[i];
        a[i]=sum;

     }

     System.out.println(Arrays.toString(a));

     sc.close();

    
    }
}



    
    


