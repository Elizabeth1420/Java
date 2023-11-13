import java.util.ArrayList;

public class Product {
    public int productId;
    public String productName; 
    public String productQuantity;

    public Product (int productId, String productName, String productQuantity){
        this.productId = productId;
        this.productName = productName; 
        this.productQuantity = productQuantity;
    }

    ArrayList<Product> products = new ArrayList<Product>();

    public void print() {
        Product myProduct = new Product( 222384, "Disco Ball", "Not Sure"); 

        products.add(myProduct);
        
        products.add(new Product(222384,"Balls", "Unsure"));

        for (Product product : products) {
            System.out.println(product.productId); 
        }
    }
}
