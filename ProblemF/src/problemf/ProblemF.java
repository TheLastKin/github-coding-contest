/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemf;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProblemF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k = 8;
        String[] lines = new String[8];
        String[] format = new String[8];
        for(int i = 0; i < k; i++){
            lines[i] = inp.next().concat(inp.nextLine());
        }
        for(int i = 0; i < k; i++){
            String s = "";
            for(int j = 0; j < lines[i].length(); j++){
                s += String.valueOf(lines[i].charAt(j));
                if(s.equals("<SPACE>")){
                    format[i] += " ";
                    s = "";
                }else if(s.equals("*")){
                    format[i] += "*";
                    s = "";
                }
            }
            format[i] = format[i].substring(4);
        }
        char[][] matrix = new char[k][k];
        for(int i = 0; i < k; i++){
            for(int j = 0; j < k; j++){
                matrix[j][i] = format[i].charAt(j);
            }
        }
        char[][] mirror = new char[k][k];
        for(int i = 0; i < k; i++){
            for(int j = 0; j < k; j++){
                mirror[k-i-1][j] = matrix[i][j]; 
            }
        }
        String output = "";
        for(int i = 0; i < k; i++){
            for(int j = 0; j < k; j++){
                if(mirror[j][i] == ' '){
                    output += "<SPACE>";
                }else{
                    output += "*";
                }
            }
            output += "\n";
        }
        System.out.println(output);
    }
    
}
