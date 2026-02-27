package handsOn4;

class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public int getProductId() {
        return productId;
    }

    public void setQuantity(int newQty) {
        if (newQty >= 0) {
            this.quantity = newQty;
        }
    }

    public double calculateTotal() {
        return price * quantity;
    }

    public String getProductDetails() {
        return "Product ID: " + productId +
               ", Name: " + productName +
               ", Price: " + price +
               ", Quantity: " + quantity +
               ", Total: " + calculateTotal();
    }
}

class Cart {
    private Product[] products;
    private int count;

    public Cart(int size) {
        products = new Product[size];
        count = 0;
    }

    public void addProduct(Product p) {
        if (count < products.length) {
            products[count++] = p;
        } else {
            System.out.println("Cart is full");
        }
    }


    public void removeProduct(int productId) {
        for (int i = 0; i < count; i++) {
            if (products[i].getProductId() == productId) {
                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[count - 1] = null;
                count--;
                break;
            }
        }
    }

  
    public double calculateCartTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].calculateTotal();
        }
        return total;
    }

    public void displayCartItems() {
        System.out.println("Cart Items:");
        for (int i = 0; i < count; i++) {
            System.out.println(products[i].getProductDetails());
        }
        System.out.println("Total Cart Value: " + calculateCartTotal());
    }
}

public class Hands_on_4_Sum3 {
    public static void main(String[] args) {

        Cart cart = new Cart(5); 

        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product(102, "Mouse", 500, 2);
        Product p3 = new Product(103, "Keyboard", 1500, 1);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayCartItems();
        cart.removeProduct(102);
        cart.displayCartItems();
    }
}