class ValidateRange extends Exception {
    public ValidateRange() {
        System.out.printf("Invalid marks, plz Enter between 0 to100");
    }
}

public class u3p7 {
    public static void main(String as[]) {
        int m1, m2, m3;
        float pr=0.0f;
        try {
            m1 = Integer.parseInt(as[0]);
            m2 = Integer.parseInt(as[1]);
            m3 = Integer.parseInt(as[2]);
            if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100) {
                throw new ValidateRange();
            } else {
                if (m1 < 40 || m2 < 40 || m3 < 40) {
                    System.out.println("Fail");
                }
                else
                {
                    pr=m1+m2+m3;
                    System.out.println(("pass : per :"+(pr/3)));
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter integer marks");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please Enter Marks ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}