
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
public class Coj_1300_2{

    /**
     * @param args the command line arguments
     */
  

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int cont = 0;
        int arr;
        
        for (int i = 0; i < 10; i++) {
            arr = sc.nextInt();
            arr = arr % 42;
            
            if(!lista.contains(arr)){
            lista.add(arr);
            cont++;
            }
        }
       
        System.out.println(cont);
    }
    
}
