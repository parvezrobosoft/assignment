public class person
{
    public static void main(String a[]){



     String name =" Jeevan";
     int age=70;
     float height=5.9f;
     float weight=50.443f;
     boolean isemployed =true;
     String skills[]= {"Java","Javascript","SQL"} ;


     String fullname="Mr. "+ name +" Jain";

     long ageinseconds= ((long) age *365*24*60*60);

     int numskill= skills.length;

     if (weight-(int)weight<.5){weight=(int)weight;}
     else {weight=(int)weight+1;}







     System.out.println("fullname = "+fullname);
     System.out.println("name = "+name);
     System.out.println("height = "+height);
     System.out.println("weight = "+weight);
     System.out.println("Number of skills = "+numskill);
     System.out.println("Employed = "+isemployed);

     System.out.println("age in seconds = "+ageinseconds);






    }
}
