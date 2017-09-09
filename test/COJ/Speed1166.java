import java.util.Scanner;
/**
 *
 * @author rocker
 */
public class Speed1166 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c;
        int p, im;
        
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            p = im = 0;
            c = sc.nextInt();
            for (int j = 0; j < c; j++) {
                if(sc.nextInt() % 2 != 0)
                    p++;
                else
                    im++;
            }
            
            System.out.println(im+" even and "+p+" odd.");
            
        }
           
    }
    
}
