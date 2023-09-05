package credservices.utils;

import credservices.Employee;

import java.security.SecureRandom;

public class CredentialServices {
    
    static SecureRandom rand = new SecureRandom();
    public CredentialServices() {
        super();
    }
    public String generateEmailAddress(Employee employee, String department, String companyName) {
                    return employee.getFirstName()+ employee.getLastName() + "@" +department +"."+companyName + ".com";
            }

            public String generatePassword(int length) {
                assert length >= 4;
                      char[] password = new char[length];

                      //get the requirements out of the way
                      password[0] = Constants.LOWERCASE[rand.nextInt(Constants.LOWERCASE.length)];
                      password[1] = Constants.UPPERCASE[rand.nextInt(Constants.UPPERCASE.length)];
                      password[2] = Constants.NUMBERS[rand.nextInt(Constants.NUMBERS.length)];
                      password[3] = Constants.SYMBOLS[rand.nextInt(Constants.SYMBOLS.length)];

                      //populate rest of the password with random chars
                      for (int i = 4; i < length; i++) {
                          password[i] = Constants.ALL_CHARS[rand.nextInt(Constants.ALL_CHARS.length)];
                      }

                      //shuffle it up
                      for (int i = 0; i < password.length; i++) {
                          int randomPosition = rand.nextInt(password.length);
                          char temp = password[i];
                          password[i] = password[randomPosition];
                          password[randomPosition] = temp;
                      }

                      return new String(password);
            }
            
            public void showCredentials(Employee employee, String email, String password) {
                    System.out.println("Dear "+employee.getFirstName() + ",Your generated credentials are as follows :\n");
                    System.out.println("Email    --> "+ email);
                    System.out.println("Password --> "+ password);
            }
}

