class StringUtil{

    public void concat(String st1,String st2){
        String str=st1+" "+st2;
        System.out.println("result: "+str);
    }
    public void concat(String st1,String st2,String st3){
        String str=st1+" "+st2+" "+st3;
        System.out.println("result: "+str);
    }
}

public class Concatination {
    public static void main(String[] args){

StringUtil c =new StringUtil();
c.concat("big","cat");
c.concat("very","big","cat");

    }
}
