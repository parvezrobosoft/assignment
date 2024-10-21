import java.util.Arrays;

class Product {
    int id;
    String name;
    float price;
    boolean inStock;
}
public class Assignment2 {
    public static void main(String[] args) {

       Product p1 = new Product();
       Product p2 = new Product();
       Product p3 = new Product();

       p1.id=1;
       p1.name="Laptop";
       p1.price= 999.99f;
       p1.inStock=true;

        p2.id=2;
        p2.name="Smartphone";
        p2.price=499.99f;
        p2.inStock=false;

        p3.id=3;
        p3.name="Tablet";
        p3.price=299.99f;
        p3.inStock=true;

     // 1

        Product[] products =new Product[3];
        products[0]=p1;
        products[1]=p2;
        products[2]=p3;

        float total =0;
        for(int i=0;i<products.length;i++)
        {
            if (products[i].inStock)
            {
                total +=products[i].price;
            }

        }



        System.out.println("Total value of stock:"+total+'$');

      //2
        float expensive=0;
        int k=0;

        for(int i=0;i<products.length;i++)
        {
            if (products[i].price>expensive)
            {
                expensive=products[i].price;
                 k=i;
            }
        }

        System.out.println("Most expensive product: "+products[k].name+"  "+"Price: "+expensive+"$");


        //3

        int n=0;



        for (Product product : products) {
            if (product.price > 400) {
                n++;
            }
        }
    System.out.println("Number of products above $400: "+n);

    }
}
