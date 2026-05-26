class Solution {
    boolean isvalid(int i, int j, char[][] board){
        //column check 
        char curr = board[i][j];
        for(int k=0;k<9;k++){
            if(k!=j){
                if(board[i][k]==curr)return false;
            }
        }
        for(int k=0;k<9;k++){
            if(k!=i){
                if(board[k][j]==curr)return false;
            }
        }
        int newi = (i/3)*3;
        int newj = (j/3)*3;
        for(int k=newi;k<newi+3;k++){
            for(int l=newj;l<newj+3;l++){
                if(k!=i && l!=j && board[k][l]==curr)return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.')
                    if(!isvalid(i,j,board))
                        return false;
            }
        }
        return true;
    }
}
