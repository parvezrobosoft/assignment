package task7;

public class Product implements Comparable<Product>
{
    private String name;
    private float price;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", price=" + price ;
    }

    public float getPrice() {
        return price;
    }

    public Product(String name, float price)
    {
        this.name = name;
        this.price = price;
    }


    @Override
    public int compareTo(Product o)
    {
        if (this.name.compareTo(o.name) > 0)
            return 1;
        else if (this.name.compareTo(o.name) < 0)
        return -1;
        else return -(int)this.price+(int)o.price;
    }
}
