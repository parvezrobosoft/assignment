class Carattr{
    String make;
    String model;
    int year;

    public Carattr(String x,String y,int z){
        make=x;
        model=y;
        year=z;
    }
    public void viewCar(){
        System.out.println("make: "+make);
        System.out.println("model: "+model);
        System.out.println("year: "+year);
        System.out.println(" ");

    }
}

public class Car {
    public static void main(String[] args){
Carattr c1 = new Carattr("Toyota","Camry",2013);
c1.viewCar();
Carattr c2 = new Carattr("Honda","Accord",2013);
c2.viewCar();
    }

}
