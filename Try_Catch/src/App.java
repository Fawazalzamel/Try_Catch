import java.util.Scanner;

public class App {

    

    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);

         String validUsername="Coded";
         String vaildPassword="Coded123";
            System.out.println("Please enter Username");
            String userName = myScanner.nextLine();

            System.out.println("Please enter your password");
            String userPass = myScanner.next();


           

        try {

            if (userName.equals(validUsername) && userPass.equals(vaildPassword)) {

                System.out.println("Access granted");

            } else {
                throw new Exception("Invalid credentials");
            }
            

        } catch (Exception e) {
            
            System.out.println(e);

        }
    
        
        myScanner.close();
    }
    


}
