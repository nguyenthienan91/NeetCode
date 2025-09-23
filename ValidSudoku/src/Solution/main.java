
package Solution;

import java.util.HashSet;
import java.util.Set;


public class main {
    
    public static void main(String[] args) {
          char[][] board = {
        {'1','2','.','.','3','.','.','.','.'},
        {'4','.','.','5','.','.','.','.','.'},
        {'.','9','8','.','.','.','.','.','3'},
        {'5','.','.','.','6','.','.','.','4'},
        {'.','.','.','8','.','3','.','.','5'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','.','.','.','.','.','2','.','.'},
        {'.','.','.','4','1','9','.','.','8'},
        {'.','.','.','.','8','.','.','7','9'}
    };
          
        System.out.println(isValidSudoku(board));
    }
    
    
    
    
    
    public static boolean isValidSudoku(char[][] board) {
        
        for (int row = 0; row < 9; row++){
            Set<Character> checkRow = new HashSet<>();
            for (int i = 0; i < 9; i++){
                if(board[row][i] == '.') continue;
                if(checkRow.contains(board[row][i])) return false;
                checkRow.add(board[row][i]);
            }
        }
        
        for (int col = 0; col < 9; col++){
            Set<Character> checkColumn = new HashSet<>();
            for (int i = 0; i < 9; i++){
                if(board[i][col] == '.') continue;
                if(checkColumn.contains(board[i][col])) return false;
                checkColumn.add(board[i][col]);
            }
        }
        
        for (int square = 0; square < 9; square++){
            Set<Character> checkSquare = new HashSet<>();
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if(board[row][col] == '.') continue;
                    if(checkSquare.contains(board[row][col])) return false;
                    checkSquare.add(board[row][col]);
                }
            }
        }
        
        return true;
    }
    
}
