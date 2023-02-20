import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        OnlineShop onlineShop1 = new OnlineShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product product1 = new Product("Laptop", 3200.5, 1,1, 1123, "");
        Product product2 = new Product("Frigider", 207.95, 1,2, 1245, "");

        Product product3 = new Product(product1);

        product3.setQuantity(5);
        product3.setName("Paine");

        onlineShop1.addProductsList(product1);
        onlineShop1.addProductsList(product2);

        onlineShop1.removeProductsList(product1);
        boolean checkProduct = product1.check(product2);
        System.out.println(checkProduct);
    }
}

class OnlineShop {
    private String name;
    private String image;
    private ArrayList<Product> products;

    OnlineShop(String name, String image, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>();
        this.image = image;
        this.name = name;
    }

    public void addProductsList(Product product)
    {
            this.products.add(product);
    }
    public void removeProductsList(Product product)
    {
            this.products.remove(product);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

class Product
{
    private int id;
    private String name;
    private double price;
    private int type;
    private int category;
    private int quantity;
    private String expiryDate; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, int type, int category, int id, String expiryDate)
    {
        this.name = name;
        this.price = price;
        this.type = type;
        this.category = category;
        this.id = id;
        this.expiryDate = expiryDate;
    }

    public Product(Product product)
    {
        this.name = product.name;
        this.price = product.price;
        this.type = product.type;
        this.category = product.category;
        this.id = product.id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    // this method verify if 2 products have the same: id, name, price, type and category
    public boolean check(Product product) {
        if (product.id != this.id)
            return false;
        if (!product.name.equals(this.name))
            return false;
        if (product.price != this.price)
            return false;
        if (product.type != this.type)
            return false;
        if (product.category != this.category)
            return false;
        return true;
    }
    // function that calculates the addition of the price after a given percentage only if the value is a proper fraction
    public void addPrice(double value)
    {
            this.price+=this.price*value;
    }
    // function that calculates the price reduction after a given percentage
    public void subtractPrice(double value)
    {
            this.price-=this.price*value/100;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class User
{
    private String name;
    private String id;
    private ArrayList<Order> orders;
    private ArrayList<Order> completedOrders;

    public User(String name, String id)
    {
        this.name = name;
        this.id = id;
        orders=new ArrayList<Order>();
        completedOrders=new ArrayList<Order>();
    }

    public void addOrder1(Order order)
    {
        this.orders.add(order);
    }

    public void addOrder2(Order order)
    {
        this.completedOrders.add(order);
    }
}

class Order
{
    private ArrayList<Product> products;
    private String address;

    public Order()
    {
        products = new ArrayList<Product>();
    }
    public void addProduct(Product product)
    {
        if(products.size() > 99)
            return;

        products.add(product);
    }

    public void removeProduct(Product product)
    {
        products.remove(product);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class InventoryProduct
{
    private Product product;
    private int quantity;

    public InventoryProduct(Product product, int quantity)
    {
        this.product = new Product(product);
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}