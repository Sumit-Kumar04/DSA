class Solution {
    static void recu(int n,int k,int curr,List<List<Integer>> list,List<Integer> temp){
        if(temp.size()==k){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(curr>n){
            return;
        }
        

        temp.add(curr);
        recu(n,k,curr+1,list,temp);
        temp.remove(temp.size()-1);
        recu(n,k,curr+1,list,temp);

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        recu(n,k,1,list,new ArrayList<>());
        return list;
    }
}