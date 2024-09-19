import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in); 
        int n=sc.nextInt();

        int []arr=new int[n];
        int target=sc.nextInt();

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int element=arr[i];
            if(element==target){
                System.out.println(i);

            }


        }
    
        
        
        sc.close();


    }
    
}
