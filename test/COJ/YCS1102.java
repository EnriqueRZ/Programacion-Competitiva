
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author rocker
 */
public class YCS1102 {

    public static void main(String[] args) {
        Scanner Lee = new Scanner(System.in); // para ler datos
        BigInteger n; // el numero a evaluar
 
        BigInteger once = new BigInteger("11");
 
        n = new BigInteger(Lee.next());
        
        while (!n.equals(BigInteger.ZERO)) {
            if (n.mod(once).equals(BigInteger.ZERO)){ 
                //mod es el modudulo
                System.out.println(n + " is a multiple of 11.");
            } else {
                System.out.println(n + " is not a multiple of 11.");
            }
            n = new BigInteger(Lee.next());
        }
        Lee.close();
        
    }
    
}
