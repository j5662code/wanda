import java.util.HashMap;
import java.util.Scanner;
public class LogIn{
    public static HashMap<String, String>
    users = newHashMap<>();
    static{

        users.put("user1","password1");
        users.put("user1","password1");
    }
    public static boolean login(String username, String password){
        return users.containsKey(username)&&users.get(username).equals(pasword);
    }
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Enter your username:"); 
    String username = scanner.nextLine(); 
    System.out.println("Enter your password:"); 
    String password = scanner.nextLine(); 
    if (login(username, password)) { System.out.println("Login successful!"); } 
    else { System.out.println("Invalid username or password. Please try again."); } 
    scanner.close(); 
}
}
