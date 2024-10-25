package task5;

public class StringToStringBuilder {
    public static void main(String[] args) {

        String str= "Ramesh";
        StringBuilder sb = new StringBuilder();
        sb.append(str);


        System.out.println(sb +" type is "+sb.getClass().getSimpleName());
        System.out.println(sb.toString()+" type is "+sb.toString().getClass().getSimpleName());

    }
}
