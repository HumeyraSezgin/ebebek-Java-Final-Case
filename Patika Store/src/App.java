import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BrandCatalog catalog = new BrandCatalog();
        // create and add brands to brandList
        Brand b1 = new Brand("Samsung");
        catalog.addBrandToBrandList(b1);
        Brand b2 = new Brand("Lenovo");
        catalog.addBrandToBrandList(b2);
        Brand b3 = new Brand("Apple");
        catalog.addBrandToBrandList(b3);
        Brand b4 = new Brand("Huawei");
        catalog.addBrandToBrandList(b4);
        Brand b5 = new Brand("Casper");
        catalog.addBrandToBrandList(b5);
        Brand b6 = new Brand("Asus");
        catalog.addBrandToBrandList(b6);
        Brand b7 = new Brand("HP");
        catalog.addBrandToBrandList(b7);
        Brand b8 = new Brand("Xiaomi");
        catalog.addBrandToBrandList(b8);
        Brand b9 = new Brand("Monster");
        catalog.addBrandToBrandList(b9);
        // brandList.toStringBrandList();
        Product c1 = new Computer("Asus", "1", 100, 50, 770, "Asus A547 PC");
        Product c2 = new Computer("Asus", "3", 99990, 10, 570, "Asus A57 PC");
        Product p1 = new Phone("Apple", "2", 10000, 2, 42, "iPhone 14 pro max", "blue");
        catalog.addBrandAndProduct(c1);
        catalog.addBrandAndProduct(c2);
        catalog.addBrandAndProduct(p1);
        // user inputs
        boolean isFinish = false; // if user do not want to do another operation
        Scanner scanner = new Scanner(System.in);
        String productID, category, brandID;
        while (!isFinish) {
            System.out.print(
                    "1- List brands\n2- Print all\n3- Filter products by brandID\n4- Filter products by productID\n5- Filter products by product category\n6- Remove product by productID\n7- Add product\n");
            System.out.print("Please select operation number: ");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    catalog.toStringBrandList();
                    break;
                case 2:
                    catalog.toStringBrandsProducts();
                    break;
                case 3:
                    System.out.println("Please enter brandID: ");
                    brandID = scanner.next();
                    catalog.filterBrand(brandID);
                    break;
                case 4:
                    System.out.print("Please enter productID: ");
                    productID = scanner.next();
                    catalog.filterProductID(productID);
                    break;
                case 5:
                    System.out.print("Please enter category: ");
                    category = scanner.next();
                    catalog.filterCategory(category);
                    break;
                case 6:
                    System.out.print("Please enter productID: ");
                    productID = scanner.next();
                    catalog.removeProduct(productID);
                    break;
                case 7:
                    System.out.print("Please enter a category type which you want to add: ");
                    category = scanner.next();
                    catalog.addNewProduct(category);
                    break;
            }
            System.out.println("Do you want to take another action?(y->1/n->2): "); // if continue operation
            int isAgain = scanner.nextInt();
            if (isAgain == 1)
                isFinish = false;
            else {
                isFinish = true;
            }
        }
        scanner.close();
    }
}
