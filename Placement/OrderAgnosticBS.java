import java.util.Scanner;
public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            int start=0;
            int end=n-1;
            boolean isAsc=arr[start]<arr[end];
            while(start<=end){
                int mid=start + (end-start)/2;
                if(arr[mid]==target){
                  System.out.println(mid);
                }
                if (isAsc) {
                    if(target<arr[mid]){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
                else{
                    if(target>arr[mid]){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }

            }
            sc.close();
            }

        }

        
    
    

