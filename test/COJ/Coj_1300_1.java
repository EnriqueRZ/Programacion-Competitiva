
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rocker
 */
public class Coj_1300_1 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Integer> lista = new ArrayList<Integer>();
    static int cont = 0;

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int m;
        
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            m = arr[i] % 42;
            insertar(m);
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
