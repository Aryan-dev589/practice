
public class Overloading {
    int c;
    public void addition(){
        int a=10;
        int b=20;
        System.out.println("Sum of a & b is "+ (a+b));
    }
    public void addition(int a,int b){
        System.out.println(a+b);
    }
    public int addition(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Overloading m1=new Overloading();
         m1.addition();
         m1.addition(10,20);
   int r=m1.addition(10,20,30);

         System.out.println(r);
 }
}
