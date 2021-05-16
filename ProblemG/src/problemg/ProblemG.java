/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemg;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProblemG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String l1 = inp.next().concat(inp.nextLine());
        String[] l1_split = l1.split(" ");
        int m = Integer.parseInt(l1_split[0]);
        int n = Integer.parseInt(l1_split[1]);
        int[][] matrix = new int[m][m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = inp.nextInt();
            }
        }
        int max = 0;
        for(int i = 0; i < m-2; i++){
            int num = 0;
            for(int j = 0; j < m-2; j++){
                for(int k = 0; k < 3; k++){
                    for(int l = 0; l < 3; l++){
                        num += matrix[j+k][i+l];
                    }
                }
                if(num > max){
                    max = num;
                }
                num = 0;
            }
        }
        System.out.println(max);
    }
    
}
