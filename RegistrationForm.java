import java.util.Scanner;

public class RegistrationForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registration Form");
        System.out.print("ID: ");
        int id = scanner.nextInt();

        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Gender (Male/Female): ");
        String gender = scanner.next();

        System.out.print("Address: ");
        String address = scanner.next();

        System.out.print("Contact: ");
        String contact = scanner.next();

        System.out.println("\nRegistration Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contact);

        scanner.close();
    }
}
