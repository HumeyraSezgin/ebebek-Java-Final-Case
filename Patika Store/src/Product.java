public class Product extends Brand {
    String productID;
    int unitPrice;
    int discountRate;
    int amountOfStock;
    String productName;
    String memory;
    String screenSize;
    String RAM;
    String category;

    // constructor methos
    public Product(String brandName, String productID,
            int unitPrice, int discountRate, int amountOfStock,
            String productName) {
        super(brandName);
        this.amountOfStock = amountOfStock;
        this.brandName = brandName;
        this.productID = productID;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "\nunit price: " + this.unitPrice + " \ndiscount rate: " + discountRate
                + " \namount of stock: "
                + amountOfStock + " \nproduct name: " + productName + " \nmemory: "
                + memory + " \nscreen size: " + screenSize + " \nRAM: " + RAM;
    }

    // get and set methods
    @Override
    public String getBrandName() {
        return super.getBrandName();
    }

    public int getAmountOfStock() {
        return amountOfStock;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public String getMemory() {
        return memory;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getRAM() {
        return RAM;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    @Override
    public void setBrandName(String brandName) {
        super.setBrandName(brandName);
    }

    public void setAmountOfStock(int amountOfStock) {
        this.amountOfStock = amountOfStock;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setRAM(String rAM) {
        RAM = rAM;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

}
