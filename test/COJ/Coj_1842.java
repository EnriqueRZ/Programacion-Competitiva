
import java.util.Scanner;

/**
 *
 * @author rocker
 */
public class Coj_1842 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, x1, y1;
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        while(c > 0){
            x = sc.nextInt();
            y = sc.nextInt();
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            System.out.println(Math.abs(x - x1) + 
                    Math.abs(y - y1));
            c--;
        }
    }
    
}
