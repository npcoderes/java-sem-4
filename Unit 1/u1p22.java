import javax.swing.JOptionPane;
class Loan
{
 int loan;
float interest;
double emi;
Loan(int loan,float interest)
{
 this.loan=loan;
this.interest=interest;
}
double calcEMI()
{
 return loan*interest/(100*60);
}
}
class u1p22
{
 public static void main(String args[])
{
 int loan;
float interest;
loan=Integer.parseInt(JOptionPane.showInputDialog("enter loan amount"));
interest=Integer.parseInt(JOptionPane.showInputDialog("enter interest:"));
Loan l1=new Loan(loan,interest);
System.out.println("EMI:"+l1.calcEMI());
}
}
