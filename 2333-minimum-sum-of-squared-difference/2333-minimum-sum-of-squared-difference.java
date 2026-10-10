class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int k=k1+k2;
        int n=nums1.length;
        int  countDiff[]=new int[100001];
       
        for(int i=0;i<n;i++){
            int d=Math.abs(nums1[i]-nums2[i]);
            countDiff[d]++;

        }
        for(int i=100000;i>0 && k>0;i--){
              int  countOpe=Math.min(countDiff[i],k);
              countDiff[i]-=countOpe;
              countDiff[i-1]+=countOpe;
              k-=countOpe;
        }
        

        long res=0;
        for(int i=1;i<100001;i++){
            if(countDiff[i]>0){
            res+=Math.pow(i,2)*countDiff[i];
            System.out.println(i+"hi"+countDiff[i]);
            }
        }
        return res;
       

    }
}