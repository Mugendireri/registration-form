import javax.swing.*;
import java.awt.*;

public class RegistrationFormGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        panel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Mobile:"));
        JTextField mobileField = new JTextField();
        panel.add(mobileField);

        panel.add(new JLabel("Gender:"));
        ButtonGroup genderGroup = new ButtonGroup();
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        panel.add(maleButton);
        panel.add(femaleButton);

        panel.add(new JLabel("Date of Birth:"));
        JComboBox<String> monthDropdown = new JComboBox<>(new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"});
        panel.add(monthDropdown);

        panel.add(new JLabel("Address:"));
        JTextField addressField = new JTextField();
        panel.add(addressField);

        panel.add(new JLabel("Accept Terms and Conditions:"));
        JCheckBox termsCheckbox = new JCheckBox();
        panel.add(termsCheckbox);

        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
