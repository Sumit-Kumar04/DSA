class Solution {
    public int smallestNumber(int n, int t) {
      while (true) {
            int digMulti = 1;
            int temp = n;
            
            while (temp > 0) {
                digMulti *= (temp % 10);
                temp /= 10;
            }
            
            if (digMulti % t == 0) {
                return n;
            }
            
            n++;
        }
    }
}