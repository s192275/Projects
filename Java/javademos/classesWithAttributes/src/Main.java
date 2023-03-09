public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Laptop";
        product.ID = 1234;
        product.description = "MSI Laptop";
        product.price = 15000;
        product.stockAmount = 3;
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.name);
        System.out.println(product.ID);
        System.out.println(product.description);
        System.out.println(product.price);
        System.out.println(product.stockAmount);
        productManager.Add2(1, "", "", 2);
    }
}
