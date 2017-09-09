
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rocker
 */
public class Coj_1300 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Integer> lista = new ArrayList<Integer>();
    static int cont = 0;

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        int arr;
        
        for (int i = 0; i < 10; i++) {
            arr = sc.nextInt();
            insertar(arr % 42);
        }
       
        System.out.println(cont);
    }
    
    public static void insertar(int m){
        if(!lista.contains(m)){
            lista.add(m);
            cont++;
        }
    }
    
}
