
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author rocker
 */
public class Coj_1118 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Boolean> array = new ArrayList<>(101);
        
        int t = sc.nextInt();
        int n, c;
        
        while(t > 0){
            
            n = sc.nextInt();
            //array = new ArrayList<>(n);
            array.addAll(Collections.nCopies(101, Boolean.TRUE));
            
            for (int i = 2; i <= n; i++) {
                for (int j = i; j <= n; j += i) {
                    if(array.get(j) == true)
                        array.set(j, false);
                    else
                        array.set(j, true);
                }
            }
            
            c = 0;
            for (int i = 1; i <= n; i++) {
                if(array.get(i) == true)
                    c++;
            }
            array.clear();
            System.out.println(c);
            t--;
        }
                
    }
    
}
