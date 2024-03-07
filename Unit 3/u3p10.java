class validateEven extends Exception
{
    validateEven(String s)
    {
        System.out.println("Invalid :"+s );
    }
}

public class u3p10 {
    public static void main(String[] args)
    {
        int[] even = new int[5];
        try{
            for(int i=0;i<5;i++)
            {
                even[i]=Integer.parseInt(args[i]);
                if(even[i]%2==1)
                {
                    throw new validateEven("Only even numbers are allowed : "+even[i]);
                }
                
            }
        
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Null value not sllowed :");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Only Integer value  sllowed :");

        }
        catch(Exception e){}

    }
}
