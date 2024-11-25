/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Vector;
import myteller.MyTellerFrame;
import myteller.NewJFrame;

public class MyTeller {

    public static void addrecords(String name, String email, String phone, String address) {
        // Assuming NewJFrame has methods to add records to the table
        NewJFrame.addRecordToTable(name, email, phone, address);
    }

    public static void viewstaff() {
        // Assuming there's a JTextArea in your GUI named ViewPanel
        NewJFrame.viewRecordButton.setText(""); // clear the box
         NewJFrame.viewRecordButton.append("Index\t" + "ID\t" + "Name\t\t" + "Pin\n"); // set header

        // Add logic to view staff information from NewJFrame if needed
    }

    public static void main(String[] args) {
        // Initialize your lists if needed
        // StaffID = new ArrayList<>();
        // StaffName = new ArrayList<>();
        // StaffPin = new ArrayList<>();

        // Call addrecords with sample data
        addrecords("John", "john@example.com", "123456789", "123 Main St");

        new MyTellerFrame().setVisible(true);
    }
}


