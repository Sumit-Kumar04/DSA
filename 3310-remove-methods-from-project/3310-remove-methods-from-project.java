class Solution {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;

        }

    }
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
       
        List<Edge> graph[]=new ArrayList[n];
        for(int i=0;i<n;i++) {
            graph[i]=new ArrayList<>();
        }
        int inDegree[]=new int[n];

        for(int[] arr:invocations) {
            int u=arr[0];
            int v=arr[1];

            graph[u].add(new Edge(u, v));
            inDegree[v]++; 
        }
        //BFS
        boolean suspicious[]=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        suspicious[k]=true;
        q.add(k);
        while(!q.isEmpty()){
            int curr=q.poll();
            
            for(Edge e:graph[curr]){
                
                int dest=e.dest;
                inDegree[dest]--;
                if(!suspicious[dest]){
                    suspicious[dest]=true;
                    q.offer(dest);
                }
            }
        }

        List<Integer> res=new ArrayList<>();
        boolean cannotRemove = false;
          for(int i = 0; i < n; i++) {
            if(suspicious[i] && inDegree[i] > 0) {
                cannotRemove = true;
                break;
            }
            if(!suspicious[i]) {
                res.add(i);
            }
        }

        if(cannotRemove) {
            List<Integer> list = new ArrayList<>(); 
            for(int i = 0; i < n; i++) {
                list.add(i);
            }
            return list;
        }

        return res;


        

    }
}