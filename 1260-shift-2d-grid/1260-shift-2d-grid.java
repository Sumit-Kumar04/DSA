class Solution {
    public static void reverse(int i,int j,int grid[][],int r,int col){
        while(i<j){
            int t=grid[i/col][i%col];
            grid[i/col][i%col]=grid[j/col][j%col];
            grid[j/col][j%col]=t;
            i++;
            j--;
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r=grid.length;
        int c=grid[0].length;
        int n=r*c;
        k=(k>n)?k%n:k;
        reverse(0,n-1,grid,r,c);
        reverse(0,k-1,grid,r,c);
        reverse(k,n-1,grid,r,c);
        List<List<Integer>> l=new ArrayList<>();

        for (int[] row : grid) {
            List<Integer> innerList = new ArrayList<>();
            for (int val : row) {
                innerList.add(val);
            }
            l.add(innerList);
        }
        return l;
    }
}