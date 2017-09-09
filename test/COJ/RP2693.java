
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author rocker
 */
public class RP2693 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        int espacios;
        String formato = "#.";
       

            numero = entrada.nextDouble();
            espacios = entrada.nextInt();
            for (int i = 0; i < espacios; i++) {
                formato += "#"; 
            }
       
        DecimalFormat objeto = new DecimalFormat(formato);
        System.out.println(objeto.format(numero));
    }
    
}
