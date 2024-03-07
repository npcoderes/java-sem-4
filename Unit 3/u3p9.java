class UnitFormatEXception extends Exception
{
    UnitFormatEXception(String s)
    {
        System.out.println("UnitFormateException : Invalid "+s);
    }
}

public class u3p9 {
    public static void main(String[] args)
    {
        int no;
        String u;
        try{
            no=Integer.parseInt(args[0]);
            u=args[1];
            if(u.equals("centimeter") || u.equals("meter"))
            {
                if(u.equals("meter"))
                {
                    double m=no/100;
                    System.out.println("NUmber to meter :"+m);
                }
                else
                {
                    double cm=no*100;
                    System.out.println("NUmber to centi meter :"+cm);

                }
            }
            else
            {
                throw new UnitFormatEXception("String value either meter or centimeter : ");
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Only integer allowed : ");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Null not allowed : ");
        }
        catch(Exception e){}

    }
}
