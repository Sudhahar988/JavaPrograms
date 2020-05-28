package JavaPrograms;

import javax.swing.*;
import java.awt.*;
public class O91_AppletEx2 extends JApplet {
 private JLabel lblName;
 private JLabel lblAddress;
 private JLabel lblEmail;
 private JTextField txtName;
 private JTextField txtAddress;
 private JTextField txtEmail;

 public void init() {
 Container conpane = getContentPane();
 conpane.setLayout(new FlowLayout());
 lblName = new JLabel("name");
 lblAddress = new JLabel("address");
 lblEmail = new JLabel("email");

 txtName = new JTextField(10);
 txtAddress = new JTextField(10);
 txtEmail = new JTextField(10);

 conpane.add(lblName);
 conpane.add(txtName);
 conpane.add(lblAddress);
 conpane.add(txtAddress);
 conpane.add(lblEmail);
 conpane.add(txtEmail);
 }
}