
import java.util.Scanner;



/**
 *
 * @author rocker
 */
public class prob1312 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        prob1312 objeto = new prob1312();

        System.out.println(objeto.mediaArit());
    }
    
    int mediaArit(){
        Scanner entrada = new Scanner(System.in);
        int r1 = entrada.nextInt();
        int s = entrada.nextInt();
        
        return ((2*s) - r1);
        
    }
    
}
