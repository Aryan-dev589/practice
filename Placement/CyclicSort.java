import java.util.Arrays;
import java.util.Scanner;
public class CyclicSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        sort(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    static void sort(int[] arr){
        int i=0;
        
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
           int temp=arr[first];
           arr[first]=arr[second];
           arr[second]=temp;
    }
}
