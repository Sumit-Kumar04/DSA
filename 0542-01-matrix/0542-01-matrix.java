class Solution {
    
   
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length; 
        int m=mat[0].length; 
        int ans[][]=new int[n][m];
        boolean visited[][]=new boolean[n][m];
        int dist[][]=new int[n][m];
        Queue<int[]>q=new LinkedList<>();


        
      
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j,0});
                    visited[i][j]=true;
                }else{
                    visited[i][j]=false;
                }
            }

        }

        int []dirX={-1,1,0,0};
        int []dirY={0,0,-1,1};

        while(!q.isEmpty()){
            int cell[]=q.poll();
            int r=cell[0];
            int c=cell[1];
            int steps=cell[2];
            dist[r][c]=steps;

            for(int i=0;i<4;i++){
                int nr=r+dirX[i];
                int nc=c+dirY[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m && visited[nr][nc]==false){
                    visited[nr][nc]=true;
                    q.add(new int[]{nr,nc,steps+1});
                }
            }

        }

        return dist;



        
    }
}