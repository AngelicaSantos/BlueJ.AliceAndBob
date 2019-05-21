/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner; 
public class Main {

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in); // declares scanner 
        System.out.println("what is your name? "); // prompt user for name 
        String name = in.nextLine(); //reads input and assigns to name 
       
        if (name.equals("Alice") || name.equals ("Bob") );
        System.out.print(" Hola "  + name);
       

    }
}
