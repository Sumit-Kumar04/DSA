class Solution {
    public static  void fill(int[][] image, int sr, int sc, int color,int n,int m,int srcColor,boolean [][]visited){
        if((sr<0) || (sc<0) || (sr>=n) || (sc>=m) || visited[sr][sc]){
            return;
        }
        if(image[sr][sc]!=srcColor){
            return;
        }
        if(image[sr][sc]==srcColor){
            visited[sr][sc]=true;
            image[sr][sc]=color;
        }
        fill(image,sr-1,sc,color,n,m,srcColor,visited);
        fill(image,sr,sc-1,color,n,m,srcColor,visited);
        fill(image,sr+1,sc,color,n,m,srcColor,visited);
        fill(image,sr,sc+1,color,n,m,srcColor,visited);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        boolean visited[][]=new boolean[n][m];
         fill(image,sr,sc,color,n,m,image[sr][sc],visited);
        return image;

    }
}