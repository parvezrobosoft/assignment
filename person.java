public class person
{
    public static void main(String a[]){

     String name =" Jeevan";
     int age=70;
     float height=5.9f;
     float weight=50.443f;
     boolean isEmployed =true;
     String skills[]= {"Java","Javascript","SQL"} ;
     String fullName="Mr. "+ name +" Jain";
     long ageInSeconds = ((long) age *365*24*60*60);
     int numSkill= skills.length;

     System.out.println("fullname = "+fullName);
     System.out.println("name = "+name);
     System.out.println("height = "+height);
     System.out.println("weight = "+ (int)weight);
     System.out.println("Number of skills = "+numSkill);
     System.out.println("Employed = "+isEmployed);
     System.out.println("age in seconds = "+ageInSeconds);

    }
}
