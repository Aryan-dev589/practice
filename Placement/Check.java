import java.util.Scanner;
public class Check {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);

        

        if(ch>='a'&& ch<='z')
        {
            System.out.println("lower case");

        }
        else if(ch>='A'&& ch<='Z')
        {
            System.out.println("upper case");

        }
        sc.close();
        
    }
    

    
}

