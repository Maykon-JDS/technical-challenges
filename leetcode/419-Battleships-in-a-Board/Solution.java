class Solution {
    public int countBattleships(char[][] board) {
        int ships = 0;

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 'X'){
                    dfs(i, j, board);
                    ++ships;
                }
            }
        }
        return ships;
    }

    public void dfs(int row, int col, char[][] board) {
        if(
            row >= 0 && col >= 0 && 
            row < board.length && col < board[row].length &&
            board[row][col] == 'X'
        ){
            board[row][col] = '.';
            dfs(row + 1, col, board);
            dfs(row, col + 1, board);
        }
    }
}