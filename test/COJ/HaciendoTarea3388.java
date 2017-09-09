
import java.util.Scanner;
import java.util.Arrays;
public class HaciendoTarea3388 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String numero;
        
        numero = entrada.next();
        
        int m;
        int n = Integer.parseInt(numero);
        int contador = 0;
        while(n > 0){
            char[] arreglo = numero.toCharArray();
            Arrays.sort(arreglo);
            int number = Integer.parseInt(new String(arreglo));
         
            m = number;
            n = n-m;
            contador++;
            numero = Integer.toString(n);
        }
        System.out.println(contador);

        
    }

}
