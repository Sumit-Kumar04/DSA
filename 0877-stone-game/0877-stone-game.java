class Solution {
    boolean recu(int piles[],int l,int r,boolean bobTurn,int bobsum1,int alicesum2){

            if(l>r){
                return bobsum1>alicesum2;
            }
            

         if(bobTurn){
            boolean left=false;
            boolean right=false;
            if(piles[l]>=piles[r]){
                left=recu(piles,l+1,r,true,bobsum1+piles[l],alicesum2);
            }else{
                right=recu(piles,l,r-1,true,bobsum1+piles[r],alicesum2);
            }
            return left|| right;
            
        }else{
              boolean left=false;
            boolean right=false;
            if(piles[l]>=piles[r]){
                left=recu(piles,l+1,r,false,bobsum1,alicesum2+piles[l]);
            }else{
                right=recu(piles,l,r-1,false,bobsum1,alicesum2+piles[r]);
            }
            return left && right;

        }
    }
    public boolean stoneGame(int[] piles) {
        
        return recu(piles,0,piles.length-1,true,0,0);
    }
}