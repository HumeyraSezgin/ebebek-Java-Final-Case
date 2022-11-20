public class Computer extends Product {

    public Computer(String brandName, String productID, int unitPrice, int discountRate, int amountOfStock,
            String productName) {
        super(brandName, productID, unitPrice, discountRate, amountOfStock, productName);
        // default values for computers
        this.RAM = "8 GB";
        this.screenSize = "14 Inc";
        this.memory = "512 SSD";
        this.category = "Computer";
    }

}
