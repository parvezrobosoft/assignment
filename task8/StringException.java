package task8;

public class StringException {

    public static int StringToInteger(String str)
    {
        int i = 0;
        try
        {
            i= Integer.parseInt(str);
//            i=str.length();

        }
        catch (NumberFormatException e)
        {
            System.out.println("Exception : required number format");
        }
        catch (NullPointerException e)
        {
            System.out.println("Exception : String is null");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return i;
    }


    public static void main(String[] args) {

        String str=null ;
//        str="string";
        int i;

        i=StringToInteger(str);

        if(i!=0) {
            System.out.println(i);
        }

    }
}
