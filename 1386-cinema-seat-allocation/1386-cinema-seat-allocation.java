class Solution {
    boolean check(ArrayList<Integer> list,int []grp){
        for(int i:grp){
            if(list.contains(i)){
                return true;
            };
        }
        return false;
    }
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int seats[]:reservedSeats){
          if (!map.containsKey(seats[0])) {
                map.put(seats[0], new ArrayList<>());
            }
            map.get(seats[0]).add(seats[1]);
        }
        int grpA[]={2,3,4,5};
        int grpB[]={4,5,6,7};
        int grpC[]={6,7,8,9};
        int size=map.size();
        int res=0;
        res+=(n-size)*2;
        for(ArrayList<Integer> s:map.values()){
           boolean a=check(s,grpA);
           boolean b=check(s,grpB);
           boolean c=check(s,grpC);

           if(!a && !c){
             res+=2;
           }
           else if(!a || !b || !c){
            res+=1;
           }
        }
        return res;
    }
}