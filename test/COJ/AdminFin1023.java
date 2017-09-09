import java.text.DecimalFormat;
import java.util.Scanner;

//rocker
public class AdminFin1023{
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cantidad;
        double suma=0;
        
        DecimalFormat decimales = new DecimalFormat("0.00");
        for (int i = 0; i < 12; i++) {
            cantidad = entrada.nextDouble();
            suma = suma + cantidad;
            cantidad = 0;
        }
        System.out.println("$"+(decimales.format(suma/12)));
    }
    
}
