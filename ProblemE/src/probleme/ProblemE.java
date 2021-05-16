/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probleme;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProblemE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String line = inp.next().concat(inp.nextLine());
        ArrayList<Character> set = new ArrayList<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('y');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        set.add('Y');
        int counter = 0;
        line = line.toLowerCase();
        char sample = line.charAt(0);
        String output = "";
        ArrayList<Character> counted = new ArrayList<>();
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) != sample && !counted.contains(Character.toLowerCase(line.charAt(i)))){
                sample = line.charAt(i);
                counter = 0;
            }
            for(int j = 0; j < line.length(); j++){
                if(line.charAt(j) == sample && line.charAt(j) != ' '){
                    counter++;
               }
            }
            if(set.contains(sample)){
                output += sample + "(" + counter + ") ";
                counted.add(sample);
            }
        }
        String[] sorted = output.split(" ");
        for(int i = 0; i < sorted.length-1; i++){
            for(int j = i+1; j < sorted.length; j++){
                int num1 = Integer.parseInt(sorted[i].substring(2,3));
                int num2 = Integer.parseInt(sorted[j].substring(2,3));
                if(num1 < num2){
                    String tem = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = tem;
                }
            }
        }
        for(int i = 0; i < sorted.length; i++){
            for(int j = i+1; j < sorted.length-1; j++){
                int num1 = Integer.parseInt(String.valueOf(sorted[i].charAt(0)+1-1));
                int num2 = Integer.parseInt(String.valueOf(sorted[j].charAt(0)+1-1));
                int num3 = Integer.parseInt(sorted[i].substring(2,3));
                int num4 = Integer.parseInt(sorted[j].substring(2,3));
                if(num1 > num2 && num3 == num4){
                    String tem = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = tem;
                }
            }
        }
        String output2 = "";
        for (String sorted1 :sorted) {
            output2 += sorted1 + ' ';
        }
        System.out.println(output2);
    }
    
}
