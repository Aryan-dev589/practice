
import java.util.Scanner;
public class AddMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[][]=new int[n][n];
        int arr2[][]=new int[n][n];
        int a[][]=new int[n][n];
         
        for(int i=0;i<n;i++ ){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=sc.nextInt();
            }
            System.out.println();

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=arr1[i][j]+arr2[i][j];
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();;
}

}
