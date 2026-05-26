/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null2133 {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,2,3},{1,2,3}};
        
        int n = matrix.length;
        boolean result = true;
        boolean breakk = false;
        
        for (int i = 0; i < n; i++) {
            boolean[] rowCheck = new boolean[n + 1];

            for (int j = 0; j < n; j++) {
                int num = matrix[i][j];
                if (num < 1 || num > n || rowCheck[num]) {
                    result = false;
                    breakk = true;
                    break;
                }
                rowCheck[num] = true;
            }
            if (breakk) break;
        }

        
        if (result) {
            for (int i = 0; i < n; i++) {
                boolean[] colCheck = new boolean[n + 1];

                for (int j = 0; j < n; j++) {
                    int num = matrix[j][i];
                    if (num < 1 || num > n || colCheck[num]) {
                        result = false;
                        breakk = true;
                        break;
                    }
                    colCheck[num] = true;
                }
                if (breakk) break;
            }
        }
        
        System.out.println(result);
        //return result;
        
    }
    
}
