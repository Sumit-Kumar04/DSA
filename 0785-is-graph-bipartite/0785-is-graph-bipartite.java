class Solution {
    static class Edge{
        int src;
        int dest;
       
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
            
        }
    }
     public static boolean isBipartite(ArrayList<Edge> graph[]){
        int color[] = new int[graph.length];
        for(int i=0;i<color.length;i++){
            color[i]=-1; //no color
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                q.add(i);
                color[i]=0; //yellow

                while(!q.isEmpty()){
                    int curr=q.remove();
                    for(int  j=0;j<graph[curr].size();j++){
                        Edge e=graph[curr].get(j);
                        if(color[e.dest] == -1){
                            int nextColor=color[curr]==0? 1: 0;
                            color[e.dest]=nextColor;
                            q.add(e.dest);
                        }else if(color[e.dest]==color[curr]){
                            return false;
                        }

                    }
                }
            }
            
        }
        return true;
    }
    public boolean isBipartite(int[][] g) {
        int v=g.length;
          ArrayList<Edge> graph[] = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
          for (int i = 0; i < v; i++) {
            for (int j = 0; j < g[i].length; j++) {
                graph[i].add(new Edge(i, g[i][j]));
            }
        }
        return isBipartite(graph);
    }
}