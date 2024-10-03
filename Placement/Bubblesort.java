import java.util.Scanner;
import java .util.Arrays;
public class Bubblesort {
    
    public static void main(String[] args) {
              
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
             bubble(arr);
            System.out.println(Arrays.toString(arr));
            sc.close();
        
    }
    static void bubble(int[] num){
        boolean swapped;

        for(int i=0;i<num.length;i++){
            swapped=false;
            for(int j=1;j<num.length;j++){
                if(num[j]<num[j-1]){
                    int temp=num[j];
                    num[j]=num[j-1];
                    num[j-1]=temp;
                    swapped=true;
                }
            
            }
            if(!swapped){
                break;
            }
        }
         
    }

}
