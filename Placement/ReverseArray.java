import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        reverse(arr);
        System.out.println(Arrays.toString(arr));


        sc.close();
 }
 static void reverse(int[] arr)
 {

   int start=0;
   int end=arr.length-1; 
   while(start<end){
    swap(arr,start,end);
    start++;
    end--;
   }
 }
 static void swap(int[]arr,int index1, int index2){
    int temp=arr[index1];
    arr[index1]=arr[index2];
    arr[index2]=temp;
 }
    
}
