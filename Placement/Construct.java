public class Construct {

    int x;
    Construct(int i){
        x=i;
    }
}
    class Demo1{
        public static void main(String[] args) {
        Construct c1=new Construct(10);
        Construct c2=new Construct(20);
        System.out.println(c1.x+" "+c2.x);
    }
}

