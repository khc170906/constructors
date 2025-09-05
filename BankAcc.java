

public class BankAcc {
    String applicant_name;
    int  Acc_no;
    BankAcc()
    {
        applicant_name="harshini";
        Acc_no=1000303490;
    }
    void display()
    {
        System.out.println("Applicant : " + applicant_name + " , account no. : " + Acc_no);
    }
    public static void main(String[] args) {
        BankAcc b=new BankAcc();
        b.display();
    }
}
