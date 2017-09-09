import java.util.Scanner;

public class Suma1049 {
       
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        
        if(n >= 0){
            System.out.println(((n*(n+1)/2)));
        }
        else{
            System.out.println((((n*-1)*((n*-1)+1)/2)*-1)+1);
        }
    }
}
