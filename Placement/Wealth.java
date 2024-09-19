import java.util.Scanner;
public class Wealth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NO OF CUSTOMERS");
        int m=sc.nextInt();
        System.out.println("ENTER THE NO OF ACCOUNTS/BANKS USED BY EACH CUSTOMER ");
        int n=sc.nextInt();

        

        int [][] account=new int[m][n];
        System.out.println("ENTER THE AMOUNT OF MONEY IN EACH ACCOUNT OF EACH CUSTOMER");
        System.out.println();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                account[i][j]=sc.nextInt();
            }
         }
           int maxAmount=0;
    
         for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum=sum+account[i][j];
             }
    
             if(sum>maxAmount){
                maxAmount=sum;
             }
        }
        System.out.println();
        System.out.println("THE WEALTH OF RICHEST CUSTOMER IS "+maxAmount);
        System.out.println();
         sc.close();
    }
    
}
