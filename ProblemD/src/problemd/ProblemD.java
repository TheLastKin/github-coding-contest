/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemd;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProblemD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String l1 = inp.next().concat(inp.nextLine());
        String[] l1_split = l1.split(" ");
        int m = Integer.parseInt(l1_split[0]);
        int n = Integer.parseInt(l1_split[1]);
        int[][] matrix = new int[n][m+2];
        for(int i = 1; i < m+1; i++){
            for(int j = 0; j < n; j++){
                matrix[j][i] = inp.nextInt();
            }
        }
        for(int i = 0; i < m; i+=n+1){
            for(int j = 0; j < n; j++){
                matrix[j][i] = 0;
            }
        }
        int counter = 0;
        int sequence = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < m+2; j++){
                if(matrix[i][j] == 1){
                    counter++;
                    sequence++;
                    continue;
                }else{
                    for(int k = i-1; k >= 0; k--){
                        int counter2 = 0;
                        for(int l = j-sequence; l < j; l++){
                            if(matrix[k][l] == 1){
                                counter2++;
                            }
                        }
                        if(counter2 == sequence){
                            counter += counter2;
                            counter2 = 0;
                        }
                    }
                    for(int k = i+1; k < n; k++){
                        int counter2 = 0;
                        for(int l = j-sequence; l < j; l++){
                            if(matrix[k][l] == 1){
                                counter2++;
                            }
                        }
                        if(counter2 == sequence){
                            counter += counter2;
                            counter2 = 0;
                        }
                    }
                }
                if(max < counter){
                    max = counter;
                }
                counter = 0;
                sequence = 0;
            }
        }
        System.out.println(max);
    }
    
}
