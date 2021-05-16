/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProblemH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int m = inp.nextInt();
        int n = inp.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;
        if(m == 1){
            max = 0;
        }else{
            for(int i = m-1; i > 0; i--){
                int num = 0;
                for(int j = 1; j <= i; j++){
                    if(i%j==0){
                        num += j;
                    }
                }
                if(max < num){
                    max = num;
                }
            }
        }
        for(int i = m; i <= n; i++){
            int num = 0;
            for(int j = 1; j <= i; j++){
                if(i%j==0){
                    num += j;
                }
            }
            if(num > max){
               max = num;
               arr.add(i);
            }
        }
        String output = "";
        for(Integer i: arr){
            output += i + ", ";
        }
        output += "\b\b";
        System.out.println(output);
    }
    
}
