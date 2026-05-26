/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null999 {
    public static void main(String[] args) {
        char[][] board = {
        {'.','.','.','.','.','.','.','.'},
        {'.','.','.','.','p','.','p','.'},
        {'.','p','.','.','.','.','.','.'},
        {'.','p','B','.','R','.','B','p'},
        {'.','p','.','.','.','B','.','.'},
        {'.','.','p','.','.','p','.','.'},
        {'.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.'}};
        
        int result = 0;
        for(int i = 0 ; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(board[i][j] == 'R'){
                    //Üst
                    for(int a = i ; a > -1; a--){
                        if (board[a][j] == 'p') {
                            result++;
                            break;
                        } else if(board[a][j] == 'B') {
                           break;
                       } 
                    }
                    //Alt
                    for(int a = i ; a < 8; a++){
                       if (board[a][j] == 'p') {
                            result++;
                            break;
                        } else if(board[a][j] == 'B') {
                           break;
                       }
                    
                    }
                    //Sağ
                    for(int a = j ; a < 8; a++){
                       if (board[i][a] == 'p') {
                            result++;
                            break;
                        } else if(board[i][a] == 'B') {
                           break;
                       }
                    
                    }
                    //Sol
                    for(int a = j ; a > -1; a--){
                       if (board[i][a] == 'p') {
                            result++;
                            break;
                        } else if(board[i][a] == 'B') {
                           break;
                       }
                    
                    }
                    
                
                }
                
                
                
            }
            
            
            
        }
        
        System.out.println(result);
        //return result;
    
        
    }
    
}
