package task5;

public class Performance {
    public static void main(String[] args) {

        long startTime;
        long endTime;
        long runTime;
        String str ="";
        startTime=System.nanoTime();
        for (int i=0;i<10;i++)
        {
            str+="hello ";
        }
        endTime=System.nanoTime();
        runTime=endTime-startTime;
        System.out.println("String concat: "+str);
        System.out.println("runtime:"+runTime);

        StringBuilder builder = new StringBuilder();
        startTime=System.nanoTime();
        for (int i=0;i< 10;i++)
        {
            builder.append("hello ");
        }
        endTime=System.nanoTime();
        runTime=endTime-startTime;
        System.out.println("StringBuilder concat: "+builder);
        System.out.println("runtime:"+runTime);

    }
}
