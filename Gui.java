import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 30/03/17.
 */
public class Gui implements ActionListener{
    JFrame loginFrame = new JFrame("Your Shop");
    public Gui(){



        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setSize(400,400);
        loginFrame.setLayout(null);
        loginFrame.setVisible(true);

        JLabel userNameLabel = new JLabel("User Name:");
        loginFrame.add(userNameLabel);
        userNameLabel.setBounds(30,50,100,20);
        userNameLabel.setVisible(true);

        JTextField userNameTextField = new JTextField(" ");
        loginFrame.add(userNameTextField);
        userNameTextField.setBounds(130,51,120,25);
        userNameTextField.setVisible(true);

        JLabel passwordLabel = new JLabel("Enter Password:");
        loginFrame.add(passwordLabel);
        passwordLabel.setBounds(30,90,100,10);
        passwordLabel.setVisible(true);

        JPasswordField passwordField = new JPasswordField("");
        loginFrame.add(passwordField);
        passwordField.setBounds(130,91,120,25);
        passwordField.setVisible(true);

        JButton signIn = new JButton("Sign In");
        loginFrame.add(signIn);
        signIn.setBounds(130,140,100,30);

        signIn.addActionListener(new dashBoard());

    }

    public static void main(String[] args) {
        new Gui();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class dashBoard implements ActionListener{
        JFrame dashboardFrame = new JFrame("Your Shop DashBoard");
        @Override
        public void actionPerformed(ActionEvent e) {
            loginFrame.dispose();

            dashboardFrame.setVisible(true);
            dashboardFrame.setSize(1000,700);
            dashboardFrame.setLayout(null);
            dashboardFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            JMenuBar menuBar = new JMenuBar();
            dashboardFrame.add(menuBar);
            menuBar.setBounds(0,0,1000,30);
            menuBar.setVisible(true);
            JMenuItem products = new JMenuItem("Products");
            menuBar.add(products);
            products.setBounds(0,0,100,20);

            JTextField searchTextField = new JTextField("");
            dashboardFrame.add(searchTextField);
            searchTextField.setBounds(20,50,700,30);


            JButton searchButton = new JButton("Search");
            dashboardFrame.add(searchButton);
            searchButton.setBounds(750,48,100,35);


            JButton addOrder = new JButton("Add new Order");
            dashboardFrame.add(addOrder);
            addOrder.setBounds(20,100,140,100);

            JButton addProducts = new JButton("Add new Product");
            dashboardFrame.add(addProducts);
            addProducts.setBounds(220,100,140,100);
            addProducts.addActionListener(new addNewProduct());


            JButton addCategory = new JButton("Add new Category");
            dashboardFrame.add(addCategory);
            addCategory.setBounds(420,100,140,50);

            JButton addBrand = new JButton("Add new Brand");
            dashboardFrame.add(addBrand);
            addBrand.setBounds(420,150,140,50);



        }
    }

    public class addNewProduct implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            JFrame newProduct = new JFrame("New Product");
            newProduct.setVisible(true);
            newProduct.setSize(300,400);
            newProduct.setLayout(null);


            JLabel productID = new JLabel("Product ID");
            newProduct.add(productID);
            productID.setBounds(20,40,100,50);



            JLabel productName = new JLabel("Product NAme");
            newProduct.add(productName);
            productName.setBounds(20,80,100,50);

            JLabel productPrice = new JLabel("Price");
            newProduct.add(productPrice);
            productPrice.setBounds(20,120,100,50);

            JLabel productQuantity = new JLabel("Quantity");
            newProduct.add(productQuantity);
            productQuantity.setBounds(20,160,100,50);


            JTextField productIDtext = new JTextField("");
            newProduct.add(productIDtext);
            productIDtext.getText();
            productIDtext.setText("");
            productIDtext.setBounds(120,55,130,25);

            JTextField productNameText = new JTextField("");
            newProduct.add(productNameText);
            productNameText.getText();
            productNameText.setText("");
            productNameText.setBounds(120,95,130,25);

            JTextField priceText = new JTextField("");
            newProduct.add(priceText);
            priceText.getText();
            priceText.setText("");
            priceText.setBounds(120,135,130,25);


            JTextField quantitytext = new JTextField("");
            newProduct.add(quantitytext);
            quantitytext.getText();
            quantitytext.setText("");

            quantitytext.setBounds(120,175,130,25);

            Store store = new Store();
            //store.addNewProducts();


            JButton done = new JButton("Done");
            newProduct.add(done);
            done.setBounds(160,260,100,25);

            JButton back = new JButton("Back");
            newProduct.add(back);
            back.setBounds(20,260,100,25);






        }
    }




}
