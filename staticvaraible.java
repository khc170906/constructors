public class staticvaraible {
   String applicant_name;
   int acc_no;
   static void display()
   {
        String Bank_Name="Harshini";
        System.out.println("Bank Name : " + Bank_Name);
   }
   staticvaraible(String s,int a )
   {
    this.applicant_name=s;
    this.acc_no=a;
   }
   void display1()
   {
    System.out.println("applicant name : " + applicant_name + " , account number : " + acc_no);
   }
   public static void main(String[] args) {
    display();
       staticvaraible s=new staticvaraible("jaahnavi", 1234456);
       s.display1();
       staticvaraible s1=new staticvaraible("manasa",234567);
       s1.display1();
   }
}
