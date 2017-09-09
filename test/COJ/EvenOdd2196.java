
import java.util.Scanner;

/**
 *
 * @author rocker
 */
public class EvenOdd2196 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tam;
        String i;
        n = sc.nextInt();

        while (n > 0) {
            i = sc.next();
            tam = i.length();
                if ((int)i.charAt(tam-1)% 2 != 0)
                    System.out.println("odd");
                else 
                    System.out.println("even");
                n--;
            }

        }
    }


