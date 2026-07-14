class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        String num="123456789";
        int n=num.length();
        int ll = String.valueOf(low).length();
        int lh = String.valueOf(high).length();
        for(int i=ll;i<=lh;i++){
            for(int j=0;j+i<=n;j++){
                int val=Integer.valueOf(num.substring(j,j+i));
                if(val>=low && val<=high){
                    list.add(val);
                }
            }
        }

       
        return list;

    }
}