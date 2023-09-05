package credservices;
import credservices.utils.CredentialServices;

import java.util.Scanner;
import credservices.utils.*;

public class EmployeeCredServiceMain {
    public EmployeeCredServiceMain() {
        super();
    }
    public static void main(String[] args) {
                    System.out.println("Enter you first name: ");
                    Scanner sc = new Scanner(System.in);
                    String firstName = sc.nextLine();
                    System.out.println("Enter you last name: ");
                    String lastName = sc.nextLine();
                    System.out.println("Please enter the department from the following.");
                    for (int i = 0 ; i < Constants.DEPARTMENTS.length; i++) {
                            System.out.println((i + 1)+". "+Constants.DEPARTMENTS[i]);
                    }
                    int department = sc.nextInt();
                    
                    Employee employee = new Employee(firstName, lastName);
                    CredentialServices cred = new CredentialServices();
                    
                    String email = cred.generateEmailAddress(employee, Constants.DEPARTMENTS_EMAIL[department - 1],
                                    Constants.COMPANY);
                    String password = cred.generatePassword(10);
                    
                    cred.showCredentials(employee, email, password);
            }
}
