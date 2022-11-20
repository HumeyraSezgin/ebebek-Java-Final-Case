public class Phone extends Product {
    int batteryPower;
    String color;

    public Phone(String brandName, String productID, int unitPrice, int discountRate, int amountOfStock,
            String productName, String color) {
        super(brandName, productID, unitPrice, discountRate, amountOfStock, productName);
        this.color = color;
        // default values for phones
        this.screenSize = "6.1 Inc";
        this.batteryPower = 4000;
        this.RAM = "6 MB";
        this.category = "Phone";
    }

    @Override
    public String toString() {
        return "Phone informations\n" + super.toString() + " \ncolor: " + this.color + " \nbattery power: "
                + this.batteryPower + "\n";
    }

    @Override
    public void setMemory(String memory) {
        switch (memory.trim().toUpperCase()) {
            case "128GB":
                super.setMemory("128 GB");
                break;
            case "64GB":
                super.setMemory("64 GB");
            default:
                break;
        }
    }

    public void setColor(String color) {
        switch (color.toUpperCase()) {
            case "BLUE":
                this.color = "BLUE";
                break;
            case "RED":
                this.color = "RED";
                break;
            case "BLACK":
                this.color = "BLACK";
            default:
                break;
        }
    }

}
