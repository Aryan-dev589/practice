public class StudentDetails {
    String name;
    int roll ;
    String phonenumber;

    public static void main(String[] args) {
      StudentDetails myStudentDetails=new StudentDetails();
      myStudentDetails.name=" ARYAN MISHRA ";
      myStudentDetails.roll=39;
      myStudentDetails.phonenumber="8910109657";

      System.out.println("Name of Student is "+ myStudentDetails.name);
      System.out.println("Roll number of Student is "+ myStudentDetails.roll);
      System.out.println("Contact number of Student is "+ myStudentDetails.phonenumber);

}
}