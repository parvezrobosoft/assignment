public class Collatz {
    public static void main(String[] args){

        int n;
        n=10;

        System.out.print(n);
       while ( n!=1 ) {

           if (n % 2 == 0)
           {
               n = n / 2;
           }
           else if (n % 2 == 1)
           {
               n = (n * 3) + 1;
           }
           System.out.print(" , " + n);
       }

    }
}
