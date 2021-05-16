/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProblemA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String l1 = inp.next().concat(inp.nextLine());
        String[] l1_split = l1.split(" ");
        int m = Integer.parseInt(l1_split[0]);
        int n = Integer.parseInt(l1_split[1]);
        int[][] matrix = new int[n+2][m+2];
        for(int i = 1; i < m+1; i++){
            for(int j = 1; j < n+1; j++){
                matrix[j][i] = inp.nextInt();
            }
        }
        for(int i = 0; i < m+2; i++){
            for(int j = 0; j < n+2; j++){
                if(matrix[j][i] < 0){
                    matrix[j][i] = 0;
                }
            }
        }
        int[][] feature = new int[n][m];
        for(int i = 1; i < m+1; i++){
            for(int j = 1; j < n+1; j++){
                int num = 0;
                for(int k = i-1; k <= i+1; k++){
                    for(int l = j-1; l <= j+1; l++){
                        if(k == i && l == j){
                            num += matrix[l][k]*8/9;
                        }else{
                            num += matrix[l][k]*-1/9;
                        }
                    }
                }
                feature[j-1][i-1] = num;
            }
        }
        String output = "";
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                output += feature[j][i] + " ";
            }
            output += "\b\n";
        }
        System.out.println(output);
    }
    
}
