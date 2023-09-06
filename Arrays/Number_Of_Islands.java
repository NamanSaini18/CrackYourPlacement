/*
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.

*/


class Pair
{
    int first;
    int second;
    public Pair(int first,int second)
    {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    private void BFS(int ro,int co,int[][] vis,char[][] grid)
    {
        vis[ro][co] = 1;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(ro,co));

        int n = grid.length;
        int m = grid[0].length;

        while(!queue.isEmpty())
        {
            int row = queue.peek().first;
            int col = queue.peek().second;

            queue.remove();

            delRow[] = {-1,0,1,0};
            delCol[] = {0,1,0,-1};
            //Traverse in Neighbours and MArk them if it is a land
            for(int i=0;i<4;i++)
            {
                
                    int nrow = row + delRow[i];
                    int ncol = col + delCol[i];

                    if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == '1'
                    && vis[nrow][ncol] == 0)
                    {
                        vis[nrow][ncol] = 1;
                        queue.add(new Pair(nrow,ncol));
                    }
                
            }
        }
    }
    public int numIslands(char[][] grid) 
    {
        int n = grid.length;
        int m = grid[0].length;

        int[][] vis = new int[n][m];
        int ctr = 0;

        for(int row=0;row<n;row++)
        {
            for(int col = 0;col<m;col++)
            {
                if(vis[row][col] == 0 && grid[row][col] == '1')
                {
                    ctr++;
                    BFS(row,col,vis,grid);
                }
            }
        }

        return ctr;
    }
    
}
