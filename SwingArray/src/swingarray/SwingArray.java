package swingarray;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SwingArray {

    public static ArrayList<Integer> customerID = new ArrayList<>();
    public static ArrayList<String> customerName = new ArrayList<>();
    public static ArrayList<Integer> customerPin = new ArrayList<>();
    public static ArrayList<String> accountType = new ArrayList<>();
    public static ArrayList<Integer> balance = new ArrayList<>();
    public static ArrayList<String> address = new ArrayList<>();
    public static ArrayList<String> customerEmail = new ArrayList<>();
    public static ArrayList<String> county = new ArrayList<>();
    public static ArrayList<String> number = new ArrayList<>();

    static int index;

    public static void addrecords() {
        customerID.add(0);
        customerName.add("John");
        customerPin.add(1234);
        accountType.add("Current Account");
        balance.add(50000);
        address.add("2 connolly Dublin 2");
        customerEmail.add("john@example.com");
        county.add("Dublin");
        number.add("089372163");

        customerID.add(1);
        customerName.add("Selena");
        customerPin.add(1234);
        accountType.add("Saving Account");
        balance.add(30000);
        address.add("123 Dublin Rd");
        customerEmail.add("selena@example.com");
        county.add("Wicklow");
        number.add("089372163");

        customerID.add(2);
        customerName.add("Jack");
        customerPin.add(1234);
        accountType.add("Mortgage Account");
        balance.add(70000);
        address.add("12 main wickow 2");
        customerEmail.add("jackh@example.com");
        county.add("Wicklow");
        number.add("089372163");

        customerID.add(3);
        customerName.add("Michael");
        customerPin.add(5678);
        accountType.add("Current Account");
        balance.add(45000);
        address.add("456 Cork Street");
        customerEmail.add("michael@example.com");
        county.add("Cork");
        number.add("087654321");

        customerID.add(4);
        customerName.add("Emma");
        customerPin.add(9876);
        accountType.add("Saving Account");
        balance.add(25000);
        address.add("78 Galway Road");
        customerEmail.add("emma@example.com");
        county.add("Galway");
        number.add("086123456");

        customerID.add(5);
        customerName.add("David");
        customerPin.add(2468);
        accountType.add("Mortgage Account");
        balance.add(60000);
        address.add("10 Limerick Lane");
        customerEmail.add("david@example.com");
        county.add("Limerick");
        number.add("083987654");
    }

 public static void viewstaff() {
    StringBuilder output = new StringBuilder();
    output.append(String.format("%-12s%-10s%-22s%-12s%-29s%-16s%-22s%-36s%-21s%s%n",
            "Index", "ID", "Name", "Pin", "Account", "Balance", "Address", "Email", "County", "Number"));
    output.append("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

    for (int i = 0; i < customerID.size(); i++) {
        output.append(String.format("%-12d%-10d%-22s%-12d%-29s%-16d%-22s%-36s%-21s%s%n",
                i, customerID.get(i), customerName.get(i), customerPin.get(i),
                accountType.get(i), balance.get(i), address.get(i),
                customerEmail.get(i), county.get(i), number.get(i)));
    }

    System.out.print(output); // Console output
    FirstJFrame.ViewPanel.setText(output.toString()); // GUI field update
}

    public static void search() {
        boolean customerFound = false;
        for (int i = 0; i < customerID.size(); i++) {
            if (FirstJFrame.IDField.getText().equals(Integer.toString(customerID.get(i)))) {
                customerFound = true;
                index = i;
                break;
            }
        }

        if (customerFound) {
            FirstJFrame.IDField.setText(Integer.toString(customerID.get(index)));
            FirstJFrame.NameField.setText(customerName.get(index));
            FirstJFrame.PinSlider.setValue(customerPin.get(index));
            FirstJFrame.AccountComboBox.setSelectedItem(accountType.get(index));
            FirstJFrame.BalanceField.setText(Integer.toString(balance.get(index)));
            FirstJFrame.AddressField.setText(address.get(index));
            FirstJFrame.EmailField.setText(customerEmail.get(index));
            FirstJFrame.CountyComboBox.setSelectedItem(county.get(index));
            FirstJFrame.NumberField.setText(number.get(index));

            JOptionPane.showMessageDialog(null, "Customer Found!");
        } else {
            JOptionPane.showMessageDialog(null, "Customer Not Found!");
            FirstJFrame.IDField.setText(null);
            FirstJFrame.NameField.setText(null);
            FirstJFrame.PinSlider.setValue(0);
            FirstJFrame.BalanceField.setText(null);
            FirstJFrame.AccountComboBox.setSelectedIndex(0);
            FirstJFrame.AddressField.setText(null);
            FirstJFrame.EmailField.setText(null);
            FirstJFrame.CountyComboBox.setSelectedIndex(0);
            FirstJFrame.NumberField.setText(null);
        }
    }

    public static void delete() {
        boolean stafffound = false;
        for (int i = 0; i < customerID.size(); i++) {
            if (FirstJFrame.IDField.getText().equals(Integer.toString(customerID.get(i)))) {
                stafffound = true;
                index = i;
                break;
            }
        }

        if (stafffound) {
            FirstJFrame.IDField.setText(null);
            customerID.remove(index);

            FirstJFrame.NameField.setText(null);
            customerName.remove(index);

            accountType.remove(index);
            FirstJFrame.AccountComboBox.setSelectedItem(null);

            FirstJFrame.BalanceField.setText(null);
            balance.remove(index);

            FirstJFrame.PinSlider.setValue(0);
            customerPin.remove(index);

            FirstJFrame.EmailField.setText(null);
            customerEmail.remove(index);

            FirstJFrame.CountyComboBox.setSelectedItem(null);
            county.remove(index);

            FirstJFrame.AddressField.setText(null);
            address.remove(index);

            number.remove(index);
            FirstJFrame.NumberField.setText(null);

            JOptionPane.showMessageDialog(null, "Staff Deleted!");
        } else {
            JOptionPane.showMessageDialog(null, "Staff Not Found!");
            FirstJFrame.IDField.setText(null);
            FirstJFrame.NameField.setText(null);
            FirstJFrame.PinSlider.setValue(0);
        }
    }

    public static void newstaff(String id, String name, int pin, String ACtype, int Balance, String Address, String email, String County, String Number) {
        boolean stafffound = false;
        for (int i = 0; i < customerID.size(); i++) {
            if (id.equals(Integer.toString(customerID.get(i)))) {
                stafffound = true;
                index = i;
                break;
            }
        }
        if (!stafffound) {
            customerID.add(Integer.valueOf(id));
            customerName.add(name);
            customerPin.add(pin);
            accountType.add(ACtype);
            balance.add(Balance);
            customerEmail.add(email);
            county.add(County);
            address.add(Address);
            number.add(Number);
            JOptionPane.showMessageDialog(null, "Information Added!");
        } else {
            JOptionPane.showMessageDialog(null, "ID in use!");
        }
    }

    public static void editstaff() {
        boolean stafffound = false;
        for (int i = 0; i < customerID.size(); i++) {
            if (FirstJFrame.IDField.getText().equals(Integer.toString(customerID.get(i)))) {
                stafffound = true;
                index = i;
                break;
            }
        }
        if (stafffound) {
            customerID.set(index, Integer.valueOf(FirstJFrame.IDField.getText()));
            customerName.set(index, FirstJFrame.NameField.getText());
            customerPin.set(index, FirstJFrame.PinSlider.getValue());
            JOptionPane.showMessageDialog(null, "Staff Updated!");
        } else {
            JOptionPane.showMessageDialog(null, "Staff Not Found!");
            FirstJFrame.IDField.setText(null);
            FirstJFrame.NameField.setText(null);
            FirstJFrame.PinSlider.setValue(0);
        }
    }

    public static void Statistic() {
        int numberUser = customerID.size();

        // Calculate total cash
        int totalCash = 0;
        for (int i = 0; i < balance.size(); i++) {
            totalCash += balance.get(i);
        }

        // Calculate average cash
        double averageCash = (double) totalCash / numberUser;

        // Find the lowest and highest cash
        double lowestCash = Double.MAX_VALUE;
        double highestCash = Double.MIN_VALUE;

        for (int i = 0; i < balance.size(); i++) {
            int currentCash = balance.get(i);

            if (currentCash < lowestCash) {
                lowestCash = currentCash;
            }

            if (currentCash > highestCash) {
                highestCash = currentCash;
            }
        }

        // Update GUI fields (assuming you have GUI fields as text fields)
        FirstJFrame.NUField.setText(String.valueOf(numberUser));
        FirstJFrame.totalField.setText(Integer.toString(totalCash));
        FirstJFrame.averageField.setText(Double.toString(averageCash));
        FirstJFrame.lowestField.setText(Double.toString(lowestCash));
        FirstJFrame.highestField.setText(Double.toString(highestCash));
    }
}
