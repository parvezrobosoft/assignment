import java.util.Arrays;

class products{
    int id;
    String name;
    float price;
    boolean inStock;
}
public class assignment2 {
    public static void main(String[] args) {

       products P1 = new products();
       products P2 = new products();
       products P3 = new products();

       P1.id=1;
       P1.name="Laptop";
       P1.price= 999.99f;
       P1.inStock=true;

        P2.id=2;
        P2.name="Smartphone";
        P2.price=499.99f;
        P2.inStock=false;

        P3.id=3;
        P3.name="Tablet";
        P3.price=299.99f;
        P3.inStock=true;

     // 1

        products Product[]=new products[3];
        Product[0]=P1;
        Product[1]=P2;
        Product[2]=P3;

        float total =0;
        for(int i=0;i<Product.length;i++)
        {
            if (Product[i].inStock)
            {
                total +=Product[i].price;
            }
        }



        System.out.println("Total value of stock:"+""+total+'$');

      //2
        float expensive=0;
        int k=0;

        for(int i=0;i<Product.length;i++)
        {
            if (Product[i].price>expensive)
            {
                expensive=Product[i].price;
                 k=i;
            }
        }

        System.out.println("Most expensive product: "+Product[k].name+"  "+"Price; "+expensive+"$");


        //3

        int n=0;

        for(int i=0;i<Product.length;i++)
        {
            if (Product[i].price>400)
            {
                n++;
            }
        }
    System.out.println("Number of products above $400: "+n);

    }
}
