/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemc;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProblemC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String l1 = inp.next().concat(inp.nextLine());
        char[] line = new char[l1.length()];
        char sample = l1.charAt(0);
        int counter = 0;
        String output = "";
        for(int i = 0; i < l1.length(); i++){
            if(l1.charAt(i) == sample){
                counter++;
            }else if(l1.charAt(i) != sample){
                output += String.valueOf(sample) + counter;
                counter = 1;
                sample = l1.charAt(i);
            }
        }
        output += String.valueOf(sample) + counter;
        System.out.println(output);
    }
    
}
