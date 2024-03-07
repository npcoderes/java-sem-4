class validate extends Exception
{
    validate(String a)
    {
        System.out.println("Invalid : "+a);
    }
}

public class u3p8 {

    public static void main(String[] args)
    {
        int[] age =new int[5];
        float avg=0.0f;

        try{
            for(int i=0;i<5;i++)
            {
                  age[i]=Integer.parseInt(args[i]);
                  if(age[i]<0 || age[i]>100)
                  {
                    throw new validate("Age must be between 1 to 100 :");
                  }
                  avg+=age[i];
            }

            System.out.println("Avg os age : "+(avg/5));
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("NUll value not allowed");

        }
        catch(NumberFormatException e)
        {
            System.out.println("Only integer value  allowed");
        }
        catch(Exception e)
        {}
    }
    
}
