
import java.util.Scanner;

/**
 *
 * @author rocker
 */
public class prob3277 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] semillas = new int[entrada.nextInt()];
        
        for (int i = 0; i < semillas.length; i++) {
            semillas[i] = entrada.nextInt();
        }
        prob3277 objeto = new prob3277();
        objeto.operacion(semillas);
        
    }
    
    void operacion(int [] semillas){
        
        boolean si = false;
        for (int i = 0; i < semillas.length-2; i++) {
            if(semillas[i] - semillas[i+1] == semillas[i+1] - semillas[i+2]){
                si = true;
                break;
            }
        }
        if(si == true)
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }
    
}
