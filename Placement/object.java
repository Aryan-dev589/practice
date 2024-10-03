public class object {
    double width;
    double height;
    double depth;
    public static void main(String[] args) {
        double vol;
        object myObject1=new object();
        

        myObject1.width=10;
        myObject1.height=20;
        myObject1.depth=30;
        vol=myObject1.width*myObject1.height*myObject1.depth;
        System.out.println("volume is "+ vol);

    }
    


}