class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int l = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int r = 0; r < arr.length; r++) {
            sum += arr[r];

            if (r - l + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                sum -= arr[l];
                l++;
            }
        }

        return (double) maxSum / k;
    }
}