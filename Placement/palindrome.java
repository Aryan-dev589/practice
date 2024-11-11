import java.util.Scanner;
public class palindrome {
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int res=reverse(num);
    if(res==num){
        System.out.println("palindrome number");
    }
    else if(res==-1){
        System.out.println("not palindrome");
    }
    sc.close();
}



   static  int reverse(int n){

    int ans=0;
    int rem,temp;
    temp=n;

    while (n>0) {
        rem=n%10;
        ans=ans*10+rem;
        n=n/10;
        
    }
    if ((ans==temp)) {
        return ans;
    }
    else{
        return -1;
    }

}


}
