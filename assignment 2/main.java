import java.util.Scanner;
class interestcalculator
{
    void interestcalculator(double R)
    {
        double Amount,SI,T;
        System.out.println("Enter Principle Amount:");
        Scanner input = new Scanner(System.in);
        Amount= input.nextDouble();
        System.out.println("Enter the duration of repayment (in Months):");
        T = input.nextDouble();
        SI = (Amount * R * T) / 1200;
        System.out.println("\nSimple Interest is:" + SI+ " \nThe rate of interest:"+R+"% \nThe period of "+T +" months");
    }
}
 class IOB extends interestcalculator
 {
     interestcalculator i = new interestcalculator();
     public void personal()
     {
         System.out.println("Selected as Personal loan");
         i.interestcalculator(11.9);
     }
     public void educational()
     {
         System.out.println("Selected as Educational loan");
         i.interestcalculator(8.2);
     }
     public void home()
     {
         System.out.println("Selected as Home loan");
         i.interestcalculator(7.2);
     }
 }
class SBI extends  IOB
{
    interestcalculator i = new interestcalculator();

    public void personal()
    {
        IOB h = new IOB();
        h.personal();
    }
    public void educational()
    {
        System.out.println("Selected as Educational loan");
        i.interestcalculator(10.8);
    }
    public void home()
    {
        System.out.println("Selected as Home loan");
        i.interestcalculator(7);
    }
    public void vehicle( double R)
    {
        System.out.println("Selected as Vehicle loan");
        i.interestcalculator(8.5);
    }
}
 class AXIS extends SBI
{
    interestcalculator i = new interestcalculator();
    SBI f = new SBI();
    public void educational()
    {
        System.out.println("Selected as Educational loan");
        i.interestcalculator(11);
    }
    public void home()
    {
        f.home();
    }
    public void vehicle()
    {
      f.vehicle(12.7);
    }
    public void business()
    {
        System.out.println("Selected as Business loan");
        i.interestcalculator(14);
    }
}
class HDFC extends interestcalculator
{
    interestcalculator i = new interestcalculator();
    public void personal()
    {
        System.out.println("Selected as Personal loan");
        i.interestcalculator(14.6);
    }
    public void gold()
    {    int gold;
        System.out.println("Selected as Gold loan \t Enter the gold (in grams):");
        Scanner input = new Scanner(System.in);
        gold = input.nextInt();
        i.interestcalculator(5.7);
    }
}
public class main
{
    public static void main(String[] args)
    {
        int bank,bl;
        System.out.println("Welcome!!!\nInterest Calculator");
        System.out.println("The available banks are \n 1.IOB Bank \n 2.SBI Bank \n 3.AXIS Bank \n 4.HDFC Bank");
        System.out.println("Select the bank by choosing number:");
        Scanner input = new Scanner(System.in);
        bank = input.nextInt();
        switch (bank)
        {
            case 1:
                IOB i = new IOB();
                System.out.println("Selected as IOB Bank");
                System.out.println("\nTypes of Loans available in the IOB bank are \n1.Personal Loan \n2.Educational Loan \n3.Home loan");
                System.out.println("Select the loan by choosing number:");
                bl = input.nextInt();
               switch (bl)
               {
                    case 1:
                       i.personal();
                        break;
                    case 2:
                       i.educational();
                        break;
                    case 3:
                        i.home();
                        break;
                    default:
                        System.out.println("RESELECT THE OPTION");
                }
                break;
            case 2:
                SBI s = new SBI();
                System.out.println("Selected as SBI Bank");
                System.out.println("\nTypes of Loans available in the SBI bank is \n1.Personal Loan \n2.Educational Loan \n3.Home loan\n4.Vehicle loan ");
                System.out.println("Select the loan by choosing number:");
                bl = input.nextInt();
                switch (bl)
                {
                    case 1:
                        s.personal();
                        break;
                    case 2:
                        s.educational();
                        break;
                    case 3:
                        s.home();
                        break;
                    case 4:
                        s.vehicle( 12);
                        break;
                    default:
                       System.out.println("RESELECT THE OPTION");
                }
                break;
            case 3:
                AXIS a = new AXIS();
                System.out.println("Selected as AXIS Bank");
                System.out.println("\nTypes of Loans available in the AXIS bank are \n 1.Personal Loan \n 2.Educational Loan \n 3.Home loan " +"\n 4.Vehicle loan \n 5.Business loan ");
                System.out.println("Select the loan by choosing number:");
                bl = input.nextInt();
                switch (bl)
                    {
                        case 1:
                            System.out.println("Selected as Personal loan");
                            a.personal();
                            break;
                        case 2:
                            System.out.println("Selected as Educational loan");
                            a.educational();
                            break;
                        case 3:
                            System.out.println("Selected as Home loan");
                            a.home();
                            break;
                        case 4:
                            System.out.println("Selected as Vehicle loan");
                            a.vehicle() ;
                            break;
                        default:
                           System.out.println("RESELECT THE OPTION");
                    }
                    break;
            case 4:
                HDFC h= new HDFC();
                System.out.println("Selected as HDFC Bank");
                System.out.println("\nLoans available in the HDFC bank are, \n 1.Personal Loan \n 2.Gold Loan ");
                System.out.println("Kindly select the loan by choosing corresponding number:");
                bl = input.nextInt();
                switch (bl)
                {
                    case 1:
                        System.out.println("Selected as Personal loan");
                        h.personal();
                        break;
                    case 2:
                        System.out.println("Selected as gold loan");
                        h.gold();
                        break;
                    default:
                        System.out.println("RESELECT THE OPTION");
                }
                break;
            default:
                System.out.println("RESELECT THE OPTION");
        }
    }
 }