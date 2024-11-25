/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mybankteller;

import java.util.ArrayList;

/**
 * SwingArray class to manage customer details.
 * 
 * @author Dell
 */
public class SwingArray {
    
    public static ArrayList<Integer> customerID = new ArrayList<>();
    public static ArrayList<String> customerName = new ArrayList<>();
    public static ArrayList<Integer> customerPin = new ArrayList<>();
    public static ArrayList<String> gender = new ArrayList<>();
    public static ArrayList<String> address = new ArrayList<>();
    public static ArrayList<String> nationality = new ArrayList<>();
    public static ArrayList<String> accountType = new ArrayList<>();

    static int index;

    public static void addRecords() {
        customerID.add(1001);
        customerName.add("John Doe");
        customerPin.add(1234);
        gender.add("Male");
        address.add("123 Main St, City");
        nationality.add("American");
        accountType.add("Savings");

        customerID.add(1002);
        customerName.add("Jane Smith");
        customerPin.add(5678);
        gender.add("Female");
        address.add("456 Oak St, Town");
        nationality.add("Canadian");
        accountType.add("Checking");

        // Add more customer records as needed
    }

    public static void viewCustomers() {
        MyTeller.ViewPanel.setText(""); // clear the box
        MyTeller.ViewPanel.append("ID\tName\t\tPin\tGender\tAddress\t\tNationality\tAccount Type\n"); // set header
        for (int i = 0; i < customerID.size(); i++) {
            MyTeller.ViewPanel.append(customerID.get(i).toString() + "\t" +
                    customerName.get(i) + "\t" +
                    customerPin.get(i).toString() + "\t" +
                    gender.get(i) + "\t" +
                    address.get(i) + "\t" +
                    nationality.get(i) + "\t" +
                    accountType.get(i) + "\n");
        }
    }
    
   public static void deleteCustomer() {
    boolean customerFound = false;
    for (int i = 0; i < customerID.size(); i++) {
        if (MyTeller.IDField.getText().equals(Integer.toString(customerID.get(i)))) {
            customerFound = true;
            index = i;
        }
    }

    if (customerFound) {
        MyTeller.IDField.setText(null);
        customerID.remove(index);
        MyTeller.NameField.setText(null);
        customerName.remove(index);
        MyTeller.PinSlider.setValue(0);
        customerPin.remove(index);
        // Assuming the following fields are part of MyTeller or accessible from here
        MyTeller.GenderField.setText(null);
        gender.remove(index);
        MyTeller.AddressField.setText(null);
        address.remove(index);
        MyTeller.NationalityField.setText(null);
        nationality.remove(index);
        MyTeller.AccountTypeField.setText(null);
        accountType.remove(index);

        JOptionPane.showMessageDialog(null, "Customer Deleted!");
    } else {
        JOptionPane.showMessageDialog(null, "Customer Not Found!");
        MyTeller.IDField.setText(null);
        MyTeller.NameField.setText(null);
        MyTeller.PinSlider.setValue(0);
        // Reset other fields as needed
    }
}


}


  