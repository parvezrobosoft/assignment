package task8;

public class ExceptionHandler {
    public static int Divide(String str)
    {
        int d;
        int i;
        try {
//            i= Integer.parseInt(str);
            i = str.length();

            d = 100 / i;
        }
        catch (NumberFormatException e) {
            System.out.println("THIS IS A NUMBER FORMAT ERROR");
            throw e;
        } catch (ArithmeticException e) {
            System.out.println("THIS IS A ARITHMETIC ERROR");
            throw e;
        }
        catch (NullPointerException e)
        {
            System.out.println("THIS IS A NULL POINTER ERROR");
            throw e;
        }
        return d;
    }
    public static void main(String[] args) {


        int d;

//        String str =null;
        String str="";
//        String str="2";


        try
        {
            d=Divide(str);
            System.out.println("100 / "+str+" = "+d);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
