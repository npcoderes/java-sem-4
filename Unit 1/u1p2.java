public class u1p2
{
    public static void main(String[] args)
    {
        int loanamount=Integer.parseInt(args[0]);
        double interestrate=0.1;
        int year=5;
        int months=year*12;
        double monthrate=interestrate/12;
        double emi=loanamount*monthrate*Math.pow(1+monthrate, months)/(Math.pow(1+monthrate,months)-1);

        System.out.println("EMI:"+emi);
    }
}

//principal * ((monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments))) /  ((Math.pow(1 + monthlyInterestRate, numberOfPayments)) - 1) );