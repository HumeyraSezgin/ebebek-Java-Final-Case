public class Brand {
    String brandID;
    String brandName;

    public Brand(String name) {
        this.brandName = name;
        brandID = "";
    }

    @Override
    public String toString() {
        return "\nBrand name: " + this.brandName + " Brand ID: " + brandID;
    }

    public String getBrandID() {
        return brandID;
    }

    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
