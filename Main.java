import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 04/04/17.
 */
public class Main {
    static public ArrayList<Products> productsArrayList = new ArrayList<Products>();
    //static public ArrayList<ProductCategory>productCategories = new ArrayList<ProductCategory>();


    public static void main(String[] args) {
        int choice;
       // Products products = new Products();
        Store store = new Store();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter (1) to Add Products " +
                                "\nEnter (2) to display all" +
                                "\nEnter (3) to Order " +
                                "\nEnter (4) to  modify a product" +
                                "\nEnter (5) to delete a product " +
                                "\nEnter (6) to Search Product"+
                                "\nEnter (7) to add a Category"+
                                "\nEnter (8) to add a Supplier"+
                                "\nEnter (9) to find top selling product"+
                                "\nEnter (10) to find Which products are stock out"+
                                "\nEnter (0) to exit ");


            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter product ID:");
                String productID = sc.next();
                System.out.println("Enter Product Name: ");
                String productName = sc.next();
                System.out.println("Enter product price");
                double productPrice = sc.nextDouble();
                System.out.println("Enter quantity");
                int productQuantity = sc.nextInt();


//                System.out.println("Enter product Category");
//                String productCategory = sc.next();
//                System.out.println("Enter Supplier name");
//                String brandName = sc.next();
                store.addNewProducts(productID,productName,productPrice,productQuantity);
                //productsArrayList.add();
                //Products products = new Products(productName, productID, productQunatity, productPrice);

                //ProductCategory pc = new ProductCategory()
               // productsArrayList.add(products);
            }

                if (choice == 2) {
                        store.display();
                    //products.displayProducts();
                    //String list = products.getlistProducts(productName, productID, productQunatity, productPrice);
                    //System.out.println(list);
                }

            if (choice==3){
                System.out.println("Enter product NAme");
                String productName = sc.next();
                System.out.println("How many copy you want ?");
                int productQuantity = sc.nextInt();
                store.sell(productName,productQuantity);


            }
            if (choice==4){
                System.out.println("Enter new product ID:");
                String productID = sc.next();
                System.out.println("Enter new Product Name: ");
                String productName = sc.next();
                System.out.println("Enter new product price");
                double productPrice = sc.nextDouble();
                System.out.println("Enter new quantity");
                int productQuantity = sc.nextInt();
                store.productsModify(productID,productName,productPrice,productQuantity);

            }
            if (choice==5){

            }
            if (choice==0){
                break;
            }



        }
    }


    }

