import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public  boolean isValidSudoku(char[][] board){
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.'){
                    continue;
                }
                char val = board[r][c];
                //check rows
                if (rows[r].contains(val)){
                    return false;
                }
                rows[r].add(val);

                //check col
                if (columns[c].contains(val)){
                    return false; //duplicate found in col
                }
                columns[c].add(val);

                int boxIndex = (r/3) *3 + (c/3);
                if(boxes[boxIndex].contains(val)){
                    return false;
                }
                boxes[boxIndex].add(val);
            }
        }
        return true;
    }

    public static void main (String[] arg){
        ValidSudoku VS = new ValidSudoku();

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(VS.isValidSudoku(board));
    }
}
