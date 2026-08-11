class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(n);

        int left = 0;
        int right = n -1;

        for(int k = n - 1;k >= 0; k--) {
            if(abs(nums[left]) > abs(nums[right])) {
                ans[k] = nums[left] * nums[left];
                left++;
            }else{
                ans[k] = nums[right] * nums[right];
                right--;
            }
        }
        return ans;
        
    }
};