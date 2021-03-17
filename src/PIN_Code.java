import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PIN_Code {
    public static void main(String[] args) {
        System.out.println("Welcome To PIN Code Program");
        Scanner scan = new Scanner(System.in);
        String exp = "^[0-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
        System.out.print("Enter the PIN code:");
        String pin = scan.nextLine();
        if(Pattern.matches(exp, pin))
            System.out.println("PIN Code you entered is Valid");
        else
            System.out.println("PIN Code you entered is Invalid");
    }
}
