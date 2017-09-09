import java.util.Scanner;

/**
 *
 * @author rocker
 */
public class Coj_1318 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coj_1318 ob = new Coj_1318();
        int nu[] = new int[3];
        String orde;
        
        nu[0] = sc.nextInt();
        nu[1] = sc.nextInt();
        nu[2] = sc.nextInt();
        orde = sc.next();

        ob.ordenamiento(nu);
        if(orde.equals("ABC"))
            System.out.println(nu[0]+" "+nu[1]+" "+nu[2]);
        if(orde.equals("ACB"))
            System.out.println(nu[0]+" "+nu[2]+" "+nu[1]);
        if(orde.equals("CAB"))
            System.out.println(nu[2]+" "+nu[0]+" "+nu[1]);
        if(orde.equals("BCA"))
            System.out.println(nu[1]+" "+nu[2]+" "+nu[0]);
        if(orde.equals("CBA"))
            System.out.println(nu[2]+" "+nu[1]+" "+nu[0]);
        if(orde.equals("BAC"))
            System.out.println(nu[1]+" "+nu[0]+" "+nu[2]);
        
    }
        void ordenamiento(int num[]){
            int aux;
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num.length; j++) {  
                    if(num[i]<num[j]){
                        aux = num[i];
                        num[i] = num[j];
                        num[j] = aux;
                    }
                }   
            }
//            System.out.println(num[0]+" "+num[1]+" "+num[2]);
        }
   
}
