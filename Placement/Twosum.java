import java.util.Arrays;
import java.util.Scanner;
 public class Twosum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();

        int[] nums=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        calculate(nums,n,target);

        sc.close();
    }


        static void calculate(int [] arr,int length,int number){

        for(int i=0;i<length-1;i++){
            for(int j=i+1;j<length;j++){
                int sum=arr[i]+arr[j];
                if(sum==number){
                    int[] a={i,j};
                    System.out.println(Arrays.toString(a));
                    
                    
                    
                 }
                 
            }
           
            
            
        }
        

        
    }
}