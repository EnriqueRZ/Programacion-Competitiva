
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author rocker
 */
public class AnoCand1078 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n, t, suma;
                
        t = entrada.nextInt();
  
        for(int i = 0; i < t; i++){
            suma = 0;
            n = entrada.nextInt();
            
            for (int j = 0; j < n; j++) {
                suma=(suma%n+(int)(entrada.nextLong()%n))%n;
            }
            
            if((suma%n) == 0)
                out.println("YES");
            else
                out.println("NO");  
        }

        out.close();
    }
    
}
