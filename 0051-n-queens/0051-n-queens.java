class Solution {
    public List<List<String>> solveNQueens(int n) {
         char board[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        nqueens(board,0,ans);
        return ans;
    }
    public static void nqueens(char board[][],int row,List<List<String>> ans)
    {
        if(row==board.length)
        {
            ans.add(convert(board));
            return;
        }
        for(int j=0;j<board.length;j++)
        {
            if(issafe(board,row,j))
            {
                board[row][j]='Q';
                nqueens(board,row+1,ans);
                board[row][j]='.';
            }
        }    
    }
    public static List<String> convert(char board[][])
    {
        List<String> change = new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            String row = new String(board[i]);
            change.add(row);
        }
        return change;
    }
    public static boolean issafe(char board[][],int row,int col)
    {
        // vertically up
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
                return false;
        }
        // diagonal left 
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
                return false;
        }
        // diagonal right
           for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
                return false;
        }
        return true;
    }
}