import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 09/04/17.
 */
public class Store {
    static public ArrayList<Products> productsArrayList = new ArrayList<Products>();


    Products[] products = new Products[100];
    //Scanner sc = new Scanner(System.in);

    void addNewProducts(String productID,String productName,double productPrice ,int productQuantity)
    {
        int i,flag=0;
        for (i=0;i<products.length;i++)
        {
            if (products[i] == null) {
                flag = 1;
                break;
            }
//            if (productID.equals(products[i].productID)) {
//                products[i].productQuantity += productQuantity;
//                break;
//            }
        }
        if (flag==1)
            {
                products[i] = new Products(productID,productName,productPrice,productQuantity);
                System.out.println("Enter Product Name: ");
                products[i].productName = productName;
                System.out.println("Enter product price");
                products[i].productPrice = productPrice;
                products[i].productID = productID;
                products[i].productQuantity = productQuantity;
            }



        }



    void sell(String productName,int productQuantity){
        for (int i=0;i<products.length;i++)
        {
            if (products[i]==null)
            {
                break;
            }
            if (productName.toLowerCase().equals(products[i].productName))
            {
                if (products[i].productQuantity>productQuantity){
                    products[i].productQuantity-=productQuantity;
                    break;
                }
                else {
                    System.out.println("Not Available");
                }
            }
        }

    }


    void productsModify(String productID,String productName,double productPrice ,int productQuantity ){
        for (int i=0;i<products.length;i++){
            if (products[i]==null){
                break;
            }
            if(productID.toLowerCase().equals(products[i].productID)){
                products[i] = new Products(productID,productName,productPrice,productQuantity);
                System.out.println("Enter new Name: ");
                products[i].productName = productName;
                System.out.println("Enter new price");
                products[i].productPrice = productPrice;
                products[i].productID = productID;
                products[i].productQuantity = productQuantity;
            }
        }
    }


    void display(){
        for (int i=0;i<products.length;i++){
            if (products[i]==null){
                break;
            }
            else {
                System.out.println("Product ID\t\tProduct Name\tQuantity\tPrice");
                System.out.println("\t"+products[i].productID+
                        "\t\t\t"+products[i].productName+
                        "\t\t\t"+products[i].productQuantity+
                        "\t\t\t"+products[i].productPrice);
            }
        }
    }




}



