
import java.util.Scanner;


/**
 *
 * @author rocker
 */
public class prob1099 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        prob1099 objeto = new prob1099();
        int a, b, c;
        
        while(true){
            
            a = entrada.nextInt();
            if(a == 0) break;
            b = entrada.nextInt();
            c = entrada.nextInt();
            
            
            System.out.println(objeto.pitagoricos(a, b, c));
            
            a = b = c = 0;
            
        }
    }
    
        String pitagoricos(int a, int b, int c){
        
        double aCua = Math.pow(a, 2);
        double bCua = Math.pow(b, 2);
        double cCua = Math.pow(c, 2);
        
        if((aCua + bCua) == cCua)
            return "right";
        else{
            if((aCua + cCua) == bCua)
                return "right";
            else{
                if((cCua + bCua) == aCua)
                    return "right";
                else
                    return "wrong";
            }
        }
    }
    
}
