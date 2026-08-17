class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean rows[][] = new boolean[9][9];
        boolean columns[][] = new boolean[9][9];
        boolean boxes[][] = new boolean[9][9];

        for (int row = 0; row < 9; row++){
            for (int col = 0; col < 9; col++){

                char ch = board[row][col];
                if (ch=='.'){
                    continue;
                }

                int num = ch - '1';
                int boxindex = (row/3)*3+(col/3);

                if(rows[row][num] || columns[col][num] || boxes[boxindex][num] ){
                    return false;
                }

                rows[row][num] = true;
                columns[col][num] = true;
                boxes[boxindex][num] = true;
            }
        } 
        return true;
    }
}