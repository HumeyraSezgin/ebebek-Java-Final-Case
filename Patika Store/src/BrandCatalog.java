import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BrandCatalog {
    ArrayList<Brand> brandList = new ArrayList<Brand>(); // list of brands
    Map<Product, Brand> brandsProducts = new HashMap<Product, Brand>(); // map of products with their brands

    public void toStringBrandsProducts() { // print each product information and their brands
        for (Product product : brandsProducts.keySet()) {
            System.out.println(product.toString() + " " + brandsProducts.get(product));
        }
    }

    public void addBrandAndProduct(Product product) { // add brand and product couples
        String brandName = product.brandName;
        Brand brand = new Brand(brandName);
        for (Brand b : brandList) {
            if (b.brandName.toUpperCase().equals(brandName.toUpperCase()))
                brand = b;
        }
        brandsProducts.put(product, brand);
    }

    public void toStringBrandList() { // yazdırma ve sıralama çalışıyor.
        Collections.sort(brandList, new Comparator<Brand>() {
            @Override
            public int compare(Brand b1, Brand b2) {
                return b1.getBrandName().compareTo(b2.getBrandName());
            }
        });
        for (Brand item : this.brandList) {
            System.out.println("Brand name: " + item.brandName + " Brand ID: " + item.brandID);

        }
    }

    public void addBrandToBrandList(Brand newBrand) { // add brand to brandList
        boolean isExist = false;
        if (this.brandList.size() == 0) {
            isExist = false;
        } else {
            for (Brand item : this.brandList) {
                if (item.brandID.equals(newBrand.brandID) || item.brandName.equals(newBrand.brandName))
                    isExist = true;
            }
        }
        if (!isExist)
            newBrand.setBrandID(Integer.toString(brandList.size() + 1));
        this.brandList.add(newBrand);
    }

    public void filterBrand(String brandID) { // filter by brand ID
        for (Brand brand : brandsProducts.values()) {
            if (brand.brandID.equals(brandID)) {
                System.out.println(brand.toString() + " ");
            }
        }
    }

    public void filterProductID(String productID) { // filter by product id
        for (Product product : brandsProducts.keySet()) {
            if (product.productID.equals(productID)) {
                System.out.println(product.toString() + " " + brandsProducts.get(product));
            }
        }
    }

    public void filterCategory(String category) { // filter by category
        for (Product product : brandsProducts.keySet()) {
            if (product.category.equals(category)) {
                System.out.println(product.toString() + " " + brandsProducts.get(product));
            }
        }
    }

    public void removeProduct(String productID) { // remove product from map
        // default product object
        Product removedProduct = new Product(productID, productID, 0, 0, 0, productID);
        for (Product product : brandsProducts.keySet()) {
            if (product.productID.equals(productID)) {
                removedProduct = product;
            }
        }
        brandsProducts.remove(removedProduct);
    }

    public void addNewProduct(String productCategory) { // enter new product
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter brand name: ");
        String brandName = scanner.next();
        System.out.print("Please enter product ID: ");
        String productID = scanner.next();
        System.out.print("Please enter unit price: ");
        int unitPrice = scanner.nextInt();
        System.out.print("Please enter discount rate: ");
        int discountRate = scanner.nextInt();
        System.out.print("Please enter amount of stock: ");
        int amountOfStock = scanner.nextInt();
        System.out.print("Please enter product name: ");
        String productName = scanner.next();
        if (productCategory.toUpperCase().equals("COMPUTER")) {
            Product p = new Computer(brandName, productID, unitPrice, discountRate, amountOfStock, productName);
        } else if (productCategory.toUpperCase().equals("PHONE")) {
            System.out.print("Please enter color: ");
            String color = scanner.next();
            Product p = new Phone(brandName, productID, unitPrice, discountRate, amountOfStock, productName, color);
        } else {
            System.out.println("Invalid category name.");
        }
    }
}